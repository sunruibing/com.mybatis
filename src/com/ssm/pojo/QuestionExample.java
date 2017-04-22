package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQusidIsNull() {
            addCriterion("qusId is null");
            return (Criteria) this;
        }

        public Criteria andQusidIsNotNull() {
            addCriterion("qusId is not null");
            return (Criteria) this;
        }

        public Criteria andQusidEqualTo(String value) {
            addCriterion("qusId =", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidNotEqualTo(String value) {
            addCriterion("qusId <>", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidGreaterThan(String value) {
            addCriterion("qusId >", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidGreaterThanOrEqualTo(String value) {
            addCriterion("qusId >=", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidLessThan(String value) {
            addCriterion("qusId <", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidLessThanOrEqualTo(String value) {
            addCriterion("qusId <=", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidLike(String value) {
            addCriterion("qusId like", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidNotLike(String value) {
            addCriterion("qusId not like", value, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidIn(List<String> values) {
            addCriterion("qusId in", values, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidNotIn(List<String> values) {
            addCriterion("qusId not in", values, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidBetween(String value1, String value2) {
            addCriterion("qusId between", value1, value2, "qusid");
            return (Criteria) this;
        }

        public Criteria andQusidNotBetween(String value1, String value2) {
            addCriterion("qusId not between", value1, value2, "qusid");
            return (Criteria) this;
        }

        public Criteria andQustypeIsNull() {
            addCriterion("qusType is null");
            return (Criteria) this;
        }

        public Criteria andQustypeIsNotNull() {
            addCriterion("qusType is not null");
            return (Criteria) this;
        }

        public Criteria andQustypeEqualTo(Integer value) {
            addCriterion("qusType =", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeNotEqualTo(Integer value) {
            addCriterion("qusType <>", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeGreaterThan(Integer value) {
            addCriterion("qusType >", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qusType >=", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeLessThan(Integer value) {
            addCriterion("qusType <", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeLessThanOrEqualTo(Integer value) {
            addCriterion("qusType <=", value, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeIn(List<Integer> values) {
            addCriterion("qusType in", values, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeNotIn(List<Integer> values) {
            addCriterion("qusType not in", values, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeBetween(Integer value1, Integer value2) {
            addCriterion("qusType between", value1, value2, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustypeNotBetween(Integer value1, Integer value2) {
            addCriterion("qusType not between", value1, value2, "qustype");
            return (Criteria) this;
        }

        public Criteria andQustextIsNull() {
            addCriterion("qusText is null");
            return (Criteria) this;
        }

        public Criteria andQustextIsNotNull() {
            addCriterion("qusText is not null");
            return (Criteria) this;
        }

        public Criteria andQustextEqualTo(String value) {
            addCriterion("qusText =", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextNotEqualTo(String value) {
            addCriterion("qusText <>", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextGreaterThan(String value) {
            addCriterion("qusText >", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextGreaterThanOrEqualTo(String value) {
            addCriterion("qusText >=", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextLessThan(String value) {
            addCriterion("qusText <", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextLessThanOrEqualTo(String value) {
            addCriterion("qusText <=", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextLike(String value) {
            addCriterion("qusText like", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextNotLike(String value) {
            addCriterion("qusText not like", value, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextIn(List<String> values) {
            addCriterion("qusText in", values, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextNotIn(List<String> values) {
            addCriterion("qusText not in", values, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextBetween(String value1, String value2) {
            addCriterion("qusText between", value1, value2, "qustext");
            return (Criteria) this;
        }

        public Criteria andQustextNotBetween(String value1, String value2) {
            addCriterion("qusText not between", value1, value2, "qustext");
            return (Criteria) this;
        }

        public Criteria andQusvoiceIsNull() {
            addCriterion("qusVoice is null");
            return (Criteria) this;
        }

        public Criteria andQusvoiceIsNotNull() {
            addCriterion("qusVoice is not null");
            return (Criteria) this;
        }

        public Criteria andQusvoiceEqualTo(String value) {
            addCriterion("qusVoice =", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceNotEqualTo(String value) {
            addCriterion("qusVoice <>", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceGreaterThan(String value) {
            addCriterion("qusVoice >", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("qusVoice >=", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceLessThan(String value) {
            addCriterion("qusVoice <", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceLessThanOrEqualTo(String value) {
            addCriterion("qusVoice <=", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceLike(String value) {
            addCriterion("qusVoice like", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceNotLike(String value) {
            addCriterion("qusVoice not like", value, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceIn(List<String> values) {
            addCriterion("qusVoice in", values, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceNotIn(List<String> values) {
            addCriterion("qusVoice not in", values, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceBetween(String value1, String value2) {
            addCriterion("qusVoice between", value1, value2, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusvoiceNotBetween(String value1, String value2) {
            addCriterion("qusVoice not between", value1, value2, "qusvoice");
            return (Criteria) this;
        }

        public Criteria andQusimageIsNull() {
            addCriterion("qusImage is null");
            return (Criteria) this;
        }

        public Criteria andQusimageIsNotNull() {
            addCriterion("qusImage is not null");
            return (Criteria) this;
        }

        public Criteria andQusimageEqualTo(String value) {
            addCriterion("qusImage =", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageNotEqualTo(String value) {
            addCriterion("qusImage <>", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageGreaterThan(String value) {
            addCriterion("qusImage >", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageGreaterThanOrEqualTo(String value) {
            addCriterion("qusImage >=", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageLessThan(String value) {
            addCriterion("qusImage <", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageLessThanOrEqualTo(String value) {
            addCriterion("qusImage <=", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageLike(String value) {
            addCriterion("qusImage like", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageNotLike(String value) {
            addCriterion("qusImage not like", value, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageIn(List<String> values) {
            addCriterion("qusImage in", values, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageNotIn(List<String> values) {
            addCriterion("qusImage not in", values, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageBetween(String value1, String value2) {
            addCriterion("qusImage between", value1, value2, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQusimageNotBetween(String value1, String value2) {
            addCriterion("qusImage not between", value1, value2, "qusimage");
            return (Criteria) this;
        }

        public Criteria andQuspriceIsNull() {
            addCriterion("qusPrice is null");
            return (Criteria) this;
        }

        public Criteria andQuspriceIsNotNull() {
            addCriterion("qusPrice is not null");
            return (Criteria) this;
        }

        public Criteria andQuspriceEqualTo(BigDecimal value) {
            addCriterion("qusPrice =", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceNotEqualTo(BigDecimal value) {
            addCriterion("qusPrice <>", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceGreaterThan(BigDecimal value) {
            addCriterion("qusPrice >", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qusPrice >=", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceLessThan(BigDecimal value) {
            addCriterion("qusPrice <", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qusPrice <=", value, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceIn(List<BigDecimal> values) {
            addCriterion("qusPrice in", values, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceNotIn(List<BigDecimal> values) {
            addCriterion("qusPrice not in", values, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qusPrice between", value1, value2, "qusprice");
            return (Criteria) this;
        }

        public Criteria andQuspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qusPrice not between", value1, value2, "qusprice");
            return (Criteria) this;
        }

        public Criteria andStatusimgIsNull() {
            addCriterion("statusImg is null");
            return (Criteria) this;
        }

        public Criteria andStatusimgIsNotNull() {
            addCriterion("statusImg is not null");
            return (Criteria) this;
        }

        public Criteria andStatusimgEqualTo(String value) {
            addCriterion("statusImg =", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgNotEqualTo(String value) {
            addCriterion("statusImg <>", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgGreaterThan(String value) {
            addCriterion("statusImg >", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgGreaterThanOrEqualTo(String value) {
            addCriterion("statusImg >=", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgLessThan(String value) {
            addCriterion("statusImg <", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgLessThanOrEqualTo(String value) {
            addCriterion("statusImg <=", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgLike(String value) {
            addCriterion("statusImg like", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgNotLike(String value) {
            addCriterion("statusImg not like", value, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgIn(List<String> values) {
            addCriterion("statusImg in", values, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgNotIn(List<String> values) {
            addCriterion("statusImg not in", values, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgBetween(String value1, String value2) {
            addCriterion("statusImg between", value1, value2, "statusimg");
            return (Criteria) this;
        }

        public Criteria andStatusimgNotBetween(String value1, String value2) {
            addCriterion("statusImg not between", value1, value2, "statusimg");
            return (Criteria) this;
        }

        public Criteria andQussubtimeIsNull() {
            addCriterion("qusSubTime is null");
            return (Criteria) this;
        }

        public Criteria andQussubtimeIsNotNull() {
            addCriterion("qusSubTime is not null");
            return (Criteria) this;
        }

        public Criteria andQussubtimeEqualTo(Date value) {
            addCriterion("qusSubTime =", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeNotEqualTo(Date value) {
            addCriterion("qusSubTime <>", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeGreaterThan(Date value) {
            addCriterion("qusSubTime >", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qusSubTime >=", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeLessThan(Date value) {
            addCriterion("qusSubTime <", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeLessThanOrEqualTo(Date value) {
            addCriterion("qusSubTime <=", value, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeIn(List<Date> values) {
            addCriterion("qusSubTime in", values, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeNotIn(List<Date> values) {
            addCriterion("qusSubTime not in", values, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeBetween(Date value1, Date value2) {
            addCriterion("qusSubTime between", value1, value2, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQussubtimeNotBetween(Date value1, Date value2) {
            addCriterion("qusSubTime not between", value1, value2, "qussubtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeIsNull() {
            addCriterion("qusEndTime is null");
            return (Criteria) this;
        }

        public Criteria andQusendtimeIsNotNull() {
            addCriterion("qusEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andQusendtimeEqualTo(Date value) {
            addCriterion("qusEndTime =", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeNotEqualTo(Date value) {
            addCriterion("qusEndTime <>", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeGreaterThan(Date value) {
            addCriterion("qusEndTime >", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qusEndTime >=", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeLessThan(Date value) {
            addCriterion("qusEndTime <", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeLessThanOrEqualTo(Date value) {
            addCriterion("qusEndTime <=", value, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeIn(List<Date> values) {
            addCriterion("qusEndTime in", values, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeNotIn(List<Date> values) {
            addCriterion("qusEndTime not in", values, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeBetween(Date value1, Date value2) {
            addCriterion("qusEndTime between", value1, value2, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andQusendtimeNotBetween(Date value1, Date value2) {
            addCriterion("qusEndTime not between", value1, value2, "qusendtime");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
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