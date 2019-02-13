package com.besthome.besthome.dao.generator.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperPlugin extends PluginAdapter {

    //为了保证每次生成的序列化相同，这里加个map映射已有的id
    private static final Map<String, String> SERIAL_MAP = new HashMap<String, String>();

    public MapperPlugin() {

    }

    public boolean validate(List<String> warnings) {
        return false;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType importType = new FullyQualifiedJavaType(
                "com.besthome.besthome.dao.entity.generator.BaseExample");
        FullyQualifiedJavaType type = new FullyQualifiedJavaType("BaseExample");
        topLevelClass.addImportedType(importType);
        topLevelClass.setSuperClass(type);
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType importTypeSuperClass = new FullyQualifiedJavaType(
                "com.besthome.besthome.dao.entity.generator.CanonicalDomain");
        FullyQualifiedJavaType importTypeImpl = new FullyQualifiedJavaType("java.io.Serializable");
        FullyQualifiedJavaType type = new FullyQualifiedJavaType("CanonicalDomain");
        FullyQualifiedJavaType interfaces = new FullyQualifiedJavaType("Serializable");
        topLevelClass.addImportedType(importTypeSuperClass);
        topLevelClass.addImportedType(importTypeImpl);
        topLevelClass.setSuperClass(type);
        topLevelClass.addSuperInterface(interfaces);
        Field field = new Field();
        field.setFinal(true);
        field.setStatic(true);
        field.setVisibility(JavaVisibility.PRIVATE);
        field.setType(new FullyQualifiedJavaType("long"));
        field.setName("serialVersionUID");
        //要求重设
        String serialFormName = topLevelClass.getType().getShortName();
        if (null == SERIAL_MAP.get(serialFormName)) {
            field.setInitializationString("useOldOne");
        } else {
            field.setInitializationString(SERIAL_MAP.get(serialFormName));
        }
        List<Field> recentField = topLevelClass.getFields();
        recentField.add(0, field);
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        for (Element element1 : element.getElements()) {
            if (element1 instanceof TextElement) {
                TextElement textElement = (TextElement) element1;
                if (textElement.getContent().startsWith("where")) {
                    element.addElement(new TextElement("and is_deleted = 'N'"));
                    break;
                }

            }
        }
        return true;
    }

    /**
     * 去除map中delete方法
     */
    public boolean clientDeleteByExampleMethodGenerated(Method method, Interface interfaze,
                                                        IntrospectedTable introspectedTable) {
        return false;
    }

    /**
     * 去除map中delete方法
     */
    public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
                                                           IntrospectedTable introspectedTable) {
        return false;
    }

    /**
     * 查询方法增加分页
     */
    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        XmlElement isNotNullElement = new XmlElement("include");
        isNotNullElement.addAttribute(new Attribute("refid", "PaginationSql.paginationSql"));
        element.addElement(isNotNullElement);
        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

}
