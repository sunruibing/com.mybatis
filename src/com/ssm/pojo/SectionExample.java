package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
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

        public Criteria andSecidIsNull() {
            addCriterion("SecId is null");
            return (Criteria) this;
        }

        public Criteria andSecidIsNotNull() {
            addCriterion("SecId is not null");
            return (Criteria) this;
        }

        public Criteria andSecidEqualTo(String value) {
            addCriterion("SecId =", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotEqualTo(String value) {
            addCriterion("SecId <>", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidGreaterThan(String value) {
            addCriterion("SecId >", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidGreaterThanOrEqualTo(String value) {
            addCriterion("SecId >=", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLessThan(String value) {
            addCriterion("SecId <", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLessThanOrEqualTo(String value) {
            addCriterion("SecId <=", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLike(String value) {
            addCriterion("SecId like", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotLike(String value) {
            addCriterion("SecId not like", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidIn(List<String> values) {
            addCriterion("SecId in", values, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotIn(List<String> values) {
            addCriterion("SecId not in", values, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidBetween(String value1, String value2) {
            addCriterion("SecId between", value1, value2, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotBetween(String value1, String value2) {
            addCriterion("SecId not between", value1, value2, "secid");
            return (Criteria) this;
        }

        public Criteria andSecnameIsNull() {
            addCriterion("SecName is null");
            return (Criteria) this;
        }

        public Criteria andSecnameIsNotNull() {
            addCriterion("SecName is not null");
            return (Criteria) this;
        }

        public Criteria andSecnameEqualTo(String value) {
            addCriterion("SecName =", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameNotEqualTo(String value) {
            addCriterion("SecName <>", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameGreaterThan(String value) {
            addCriterion("SecName >", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameGreaterThanOrEqualTo(String value) {
            addCriterion("SecName >=", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameLessThan(String value) {
            addCriterion("SecName <", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameLessThanOrEqualTo(String value) {
            addCriterion("SecName <=", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameLike(String value) {
            addCriterion("SecName like", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameNotLike(String value) {
            addCriterion("SecName not like", value, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameIn(List<String> values) {
            addCriterion("SecName in", values, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameNotIn(List<String> values) {
            addCriterion("SecName not in", values, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameBetween(String value1, String value2) {
            addCriterion("SecName between", value1, value2, "secname");
            return (Criteria) this;
        }

        public Criteria andSecnameNotBetween(String value1, String value2) {
            addCriterion("SecName not between", value1, value2, "secname");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
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