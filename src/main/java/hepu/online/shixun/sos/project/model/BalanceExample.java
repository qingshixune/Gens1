package hepu.online.shixun.sos.project.model;

import java.util.ArrayList;
import java.util.List;

public class BalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceExample() {
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
            addCriterion("userBalance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("userBalance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("userBalance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("userBalance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("userBalance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("userBalance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("userBalance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("userBalance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("userBalance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("userBalance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("userBalance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("userBalance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }
        public Criteria andIdnumberIsNull() {
            addCriterion("cardPwd is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("cardPwd is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("cardPwd =", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("cardPwd <>", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("cardPwd >", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardPwd >=", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("cardPwd <", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("cardPwd <=", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("cardPwd like", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("cardPwd not like", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("cardPwd in", values, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("cardPwd not in", values, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("cardPwd between", value1, value2, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("cardPwd not between", value1, value2, "cardPwd");
            return (Criteria) this;
        }
        
        
        public Criteria andcardNumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andcardNumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andcardNumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberLessThan(String value) {
            addCriterion("cardPwd <", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andcardNumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberLike(String value) {
            addCriterion("cardNumber like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andcardNumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }


        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Double value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Double value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Double value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Double value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Double value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Double> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Double> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Double value1, Double value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Double value1, Double value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }
        
        
        public Criteria andTranfserIsNull() {
            addCriterion("transfer is null");
            return (Criteria) this;
        }

        public Criteria andTranfserIsNotNull() {
            addCriterion("transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTranfserEqualTo(Double value) {
            addCriterion("transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserNotEqualTo(Double value) {
            addCriterion("transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserGreaterThan(Double value) {
            addCriterion("transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserGreaterThanOrEqualTo(Double value) {
            addCriterion("transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserLessThan(Double value) {
            addCriterion("transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserLessThanOrEqualTo(Double value) {
            addCriterion("transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserIn(List<Double> values) {
            addCriterion("transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserNotIn(List<Double> values) {
            addCriterion("transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserBetween(Double value1, Double value2) {
            addCriterion("transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTranfserNotBetween(Double value1, Double value2) {
            addCriterion("transfer not between", value1, value2, "transfer");
            return (Criteria) this;
        }
        public Criteria andPaywordIsNull() {
            addCriterion("payword is null");
            return (Criteria) this;
        }

        public Criteria andPaywordIsNotNull() {
            addCriterion("payword is not null");
            return (Criteria) this;
        }

        public Criteria andPaywordEqualTo(String value) {
            addCriterion("payword =", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordNotEqualTo(String value) {
            addCriterion("payword <>", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordGreaterThan(String value) {
            addCriterion("payword >", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordGreaterThanOrEqualTo(String value) {
            addCriterion("payword >=", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordLessThan(String value) {
            addCriterion("payword <", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordLessThanOrEqualTo(String value) {
            addCriterion("payword <=", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordLike(String value) {
            addCriterion("payword like", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordNotLike(String value) {
            addCriterion("payword not like", value, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordIn(List<String> values) {
            addCriterion("payword in", values, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordNotIn(List<String> values) {
            addCriterion("payword not in", values, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordBetween(String value1, String value2) {
            addCriterion("payword between", value1, value2, "payword");
            return (Criteria) this;
        }

        public Criteria andPaywordNotBetween(String value1, String value2) {
            addCriterion("payword not between", value1, value2, "payword");
            return (Criteria) this;
        }

        
        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
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