package hepu.online.shixun.sos.project.model;

import java.util.ArrayList;
import java.util.List;

public class BankCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankCardExample() {
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNull() {
            addCriterion("cardName is null");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNotNull() {
            addCriterion("cardName is not null");
            return (Criteria) this;
        }

        public Criteria andCardnameEqualTo(String value) {
            addCriterion("cardName =", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotEqualTo(String value) {
            addCriterion("cardName <>", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThan(String value) {
            addCriterion("cardName >", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThanOrEqualTo(String value) {
            addCriterion("cardName >=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThan(String value) {
            addCriterion("cardName <", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThanOrEqualTo(String value) {
            addCriterion("cardName <=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLike(String value) {
            addCriterion("cardName like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotLike(String value) {
            addCriterion("cardName not like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameIn(List<String> values) {
            addCriterion("cardName in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotIn(List<String> values) {
            addCriterion("cardName not in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameBetween(String value1, String value2) {
            addCriterion("cardName between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotBetween(String value1, String value2) {
            addCriterion("cardName not between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNull() {
            addCriterion("cardNum is null");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNotNull() {
            addCriterion("cardNum is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumEqualTo(String value) {
            addCriterion("cardNum =", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotEqualTo(String value) {
            addCriterion("cardNum <>", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThan(String value) {
            addCriterion("cardNum >", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThanOrEqualTo(String value) {
            addCriterion("cardNum >=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThan(String value) {
            addCriterion("cardNum <", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThanOrEqualTo(String value) {
            addCriterion("cardNum <=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLike(String value) {
            addCriterion("cardNum like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotLike(String value) {
            addCriterion("cardNum not like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumIn(List<String> values) {
            addCriterion("cardNum in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotIn(List<String> values) {
            addCriterion("cardNum not in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumBetween(String value1, String value2) {
            addCriterion("cardNum between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotBetween(String value1, String value2) {
            addCriterion("cardNum not between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardpwdIsNull() {
            addCriterion("cardPwd is null");
            return (Criteria) this;
        }

        public Criteria andCardpwdIsNotNull() {
            addCriterion("cardPwd is not null");
            return (Criteria) this;
        }

        public Criteria andCardpwdEqualTo(Integer value) {
            addCriterion("cardPwd =", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotEqualTo(Integer value) {
            addCriterion("cardPwd <>", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdGreaterThan(Integer value) {
            addCriterion("cardPwd >", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardPwd >=", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdLessThan(Integer value) {
            addCriterion("cardPwd <", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdLessThanOrEqualTo(Integer value) {
            addCriterion("cardPwd <=", value, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdIn(List<Integer> values) {
            addCriterion("cardPwd in", values, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotIn(List<Integer> values) {
            addCriterion("cardPwd not in", values, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdBetween(Integer value1, Integer value2) {
            addCriterion("cardPwd between", value1, value2, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andCardpwdNotBetween(Integer value1, Integer value2) {
            addCriterion("cardPwd not between", value1, value2, "cardpwd");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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