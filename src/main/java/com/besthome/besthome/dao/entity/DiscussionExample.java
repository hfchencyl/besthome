package com.besthome.besthome.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Integer value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Integer value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Integer value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Integer> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andDiscussionIsNull() {
            addCriterion("discussion is null");
            return (Criteria) this;
        }

        public Criteria andDiscussionIsNotNull() {
            addCriterion("discussion is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussionEqualTo(String value) {
            addCriterion("discussion =", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionNotEqualTo(String value) {
            addCriterion("discussion <>", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionGreaterThan(String value) {
            addCriterion("discussion >", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionGreaterThanOrEqualTo(String value) {
            addCriterion("discussion >=", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionLessThan(String value) {
            addCriterion("discussion <", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionLessThanOrEqualTo(String value) {
            addCriterion("discussion <=", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionLike(String value) {
            addCriterion("discussion like", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionNotLike(String value) {
            addCriterion("discussion not like", value, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionIn(List<String> values) {
            addCriterion("discussion in", values, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionNotIn(List<String> values) {
            addCriterion("discussion not in", values, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionBetween(String value1, String value2) {
            addCriterion("discussion between", value1, value2, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussionNotBetween(String value1, String value2) {
            addCriterion("discussion not between", value1, value2, "discussion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionIsNull() {
            addCriterion("discuss_persion is null");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionIsNotNull() {
            addCriterion("discuss_persion is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionEqualTo(String value) {
            addCriterion("discuss_persion =", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionNotEqualTo(String value) {
            addCriterion("discuss_persion <>", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionGreaterThan(String value) {
            addCriterion("discuss_persion >", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_persion >=", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionLessThan(String value) {
            addCriterion("discuss_persion <", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionLessThanOrEqualTo(String value) {
            addCriterion("discuss_persion <=", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionLike(String value) {
            addCriterion("discuss_persion like", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionNotLike(String value) {
            addCriterion("discuss_persion not like", value, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionIn(List<String> values) {
            addCriterion("discuss_persion in", values, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionNotIn(List<String> values) {
            addCriterion("discuss_persion not in", values, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionBetween(String value1, String value2) {
            addCriterion("discuss_persion between", value1, value2, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andDiscussPersionNotBetween(String value1, String value2) {
            addCriterion("discuss_persion not between", value1, value2, "discussPersion");
            return (Criteria) this;
        }

        public Criteria andAgreeCountIsNull() {
            addCriterion("agree_count is null");
            return (Criteria) this;
        }

        public Criteria andAgreeCountIsNotNull() {
            addCriterion("agree_count is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeCountEqualTo(Integer value) {
            addCriterion("agree_count =", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountNotEqualTo(Integer value) {
            addCriterion("agree_count <>", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountGreaterThan(Integer value) {
            addCriterion("agree_count >", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("agree_count >=", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountLessThan(Integer value) {
            addCriterion("agree_count <", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountLessThanOrEqualTo(Integer value) {
            addCriterion("agree_count <=", value, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountIn(List<Integer> values) {
            addCriterion("agree_count in", values, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountNotIn(List<Integer> values) {
            addCriterion("agree_count not in", values, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountBetween(Integer value1, Integer value2) {
            addCriterion("agree_count between", value1, value2, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andAgreeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("agree_count not between", value1, value2, "agreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountIsNull() {
            addCriterion("dis_agree_count is null");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountIsNotNull() {
            addCriterion("dis_agree_count is not null");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountEqualTo(Integer value) {
            addCriterion("dis_agree_count =", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountNotEqualTo(Integer value) {
            addCriterion("dis_agree_count <>", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountGreaterThan(Integer value) {
            addCriterion("dis_agree_count >", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dis_agree_count >=", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountLessThan(Integer value) {
            addCriterion("dis_agree_count <", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountLessThanOrEqualTo(Integer value) {
            addCriterion("dis_agree_count <=", value, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountIn(List<Integer> values) {
            addCriterion("dis_agree_count in", values, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountNotIn(List<Integer> values) {
            addCriterion("dis_agree_count not in", values, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountBetween(Integer value1, Integer value2) {
            addCriterion("dis_agree_count between", value1, value2, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andDisAgreeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dis_agree_count not between", value1, value2, "disAgreeCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}