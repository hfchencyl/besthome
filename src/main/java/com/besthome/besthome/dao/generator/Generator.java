/**
 * 
 */
package com.besthome.besthome.dao.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * mybatis 生成器
 * @author cold [hzchenliang1]
 *
 */
public class Generator
{

	public static void main(String[] args) throws Exception
	{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
//		Resource resource = new ClassPathResource("generate/cold/cold-config.xml");
		Resource resource = new ClassPathResource("database/generate/initTableConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(resource.getFile());
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println("生成文件执行成功！");
	}
}
