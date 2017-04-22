package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class FocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FocusExample() {
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

        public Criteria andFocidIsNull() {
            addCriterion("FocId is null");
            return (Criteria) this;
        }

        public Criteria andFocidIsNotNull() {
            addCriterion("FocId is not null");
            return (Criteria) this;
        }

        public Criteria andFocidEqualTo(String value) {
            addCriterion("FocId =", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidNotEqualTo(String value) {
            addCriterion("FocId <>", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidGreaterThan(String value) {
            addCriterion("FocId >", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidGreaterThanOrEqualTo(String value) {
            addCriterion("FocId >=", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidLessThan(String value) {
            addCriterion("FocId <", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidLessThanOrEqualTo(String value) {
            addCriterion("FocId <=", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidLike(String value) {
            addCriterion("FocId like", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidNotLike(String value) {
            addCriterion("FocId not like", value, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidIn(List<String> values) {
            addCriterion("FocId in", values, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidNotIn(List<String> values) {
            addCriterion("FocId not in", values, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidBetween(String value1, String value2) {
            addCriterion("FocId between", value1, value2, "focid");
            return (Criteria) this;
        }

        public Criteria andFocidNotBetween(String value1, String value2) {
            addCriterion("FocId not between", value1, value2, "focid");
            return (Criteria) this;
        }

        public Criteria andFocfollowIsNull() {
            addCriterion("focFollow is null");
            return (Criteria) this;
        }

        public Criteria andFocfollowIsNotNull() {
            addCriterion("focFollow is not null");
            return (Criteria) this;
        }

        public Criteria andFocfollowEqualTo(String value) {
            addCriterion("focFollow =", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowNotEqualTo(String value) {
            addCriterion("focFollow <>", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowGreaterThan(String value) {
            addCriterion("focFollow >", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowGreaterThanOrEqualTo(String value) {
            addCriterion("focFollow >=", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowLessThan(String value) {
            addCriterion("focFollow <", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowLessThanOrEqualTo(String value) {
            addCriterion("focFollow <=", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowLike(String value) {
            addCriterion("focFollow like", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowNotLike(String value) {
            addCriterion("focFollow not like", value, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowIn(List<String> values) {
            addCriterion("focFollow in", values, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowNotIn(List<String> values) {
            addCriterion("focFollow not in", values, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowBetween(String value1, String value2) {
            addCriterion("focFollow between", value1, value2, "focfollow");
            return (Criteria) this;
        }

        public Criteria andFocfollowNotBetween(String value1, String value2) {
            addCriterion("focFollow not between", value1, value2, "focfollow");
            return (Criteria) this;
        }

        public Criteria andBefollowIsNull() {
            addCriterion("beFollow is null");
            return (Criteria) this;
        }

        public Criteria andBefollowIsNotNull() {
            addCriterion("beFollow is not null");
            return (Criteria) this;
        }

        public Criteria andBefollowEqualTo(String value) {
            addCriterion("beFollow =", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowNotEqualTo(String value) {
            addCriterion("beFollow <>", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowGreaterThan(String value) {
            addCriterion("beFollow >", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowGreaterThanOrEqualTo(String value) {
            addCriterion("beFollow >=", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowLessThan(String value) {
            addCriterion("beFollow <", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowLessThanOrEqualTo(String value) {
            addCriterion("beFollow <=", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowLike(String value) {
            addCriterion("beFollow like", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowNotLike(String value) {
            addCriterion("beFollow not like", value, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowIn(List<String> values) {
            addCriterion("beFollow in", values, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowNotIn(List<String> values) {
            addCriterion("beFollow not in", values, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowBetween(String value1, String value2) {
            addCriterion("beFollow between", value1, value2, "befollow");
            return (Criteria) this;
        }

        public Criteria andBefollowNotBetween(String value1, String value2) {
            addCriterion("beFollow not between", value1, value2, "befollow");
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