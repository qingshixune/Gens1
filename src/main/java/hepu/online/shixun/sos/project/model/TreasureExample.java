package hepu.online.shixun.sos.project.model;

import java.util.ArrayList;
import java.util.List;

public class TreasureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreasureExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("totalMoney =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("totalMoney <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("totalMoney >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("totalMoney >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("totalMoney <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("totalMoney <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("totalMoney like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("totalMoney not like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("totalMoney in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("totalMoney not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("totalMoney between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("totalMoney not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("ableMoney is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("ableMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("ableMoney =", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("ableMoney <>", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("ableMoney >", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("ableMoney >=", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("ableMoney <", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("ableMoney <=", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("ableMoney in", values, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("ableMoney not in", values, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("ableMoney between", value1, value2, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("ableMoney not between", value1, value2, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("disableMoney is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("disableMoney is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("disableMoney =", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("disableMoney <>", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("disableMoney >", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("disableMoney >=", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("disableMoney <", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("disableMoney <=", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("disableMoney like", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("disableMoney not like", value, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("disableMoney in", values, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("disableMoney not in", values, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("disableMoney between", value1, value2, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("disableMoney not between", value1, value2, "disableMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("outMoney is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("outMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("outMoney =", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("outMoney <>", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("outMoney >", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("outMoney >=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("outMoney <", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("outMoney <=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("outMoney like", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("outMoney not like", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("outMoney in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("outMoney not in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("outMoney between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("outMoney not between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("inMoney is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("inMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Double value) {
            addCriterion("inMoney =", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Double value) {
            addCriterion("inMoney <>", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Double value) {
            addCriterion("inMoney >", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("inMoney >=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Double value) {
            addCriterion("inMoney <", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Double value) {
            addCriterion("inMoney <=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Double> values) {
            addCriterion("inMoney in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Double> values) {
            addCriterion("inMoney not in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Double value1, Double value2) {
            addCriterion("inMoney between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Double value1, Double value2) {
            addCriterion("inMoney not between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andLoginaccountIsNull() {
            addCriterion("totalProfit is null");
            return (Criteria) this;
        }

        public Criteria andLoginaccountIsNotNull() {
            addCriterion("totalProfit is not null");
            return (Criteria) this;
        }

        public Criteria andLoginaccountEqualTo(String value) {
            addCriterion("totalProfit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotEqualTo(String value) {
            addCriterion("totalProfit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountGreaterThan(String value) {
            addCriterion("totalProfit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountGreaterThanOrEqualTo(String value) {
            addCriterion("totalProfit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLessThan(String value) {
            addCriterion("totalProfit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLessThanOrEqualTo(String value) {
            addCriterion("totalProfit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLike(String value) {
            addCriterion("totalProfit like", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotLike(String value) {
            addCriterion("totalProfit not like", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountIn(List<String> values) {
            addCriterion("totalProfit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotIn(List<String> values) {
            addCriterion("totalProfit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountBetween(String value1, String value2) {
            addCriterion("totalProfit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotBetween(String value1, String value2) {
            addCriterion("totalProfit not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("dayProfit is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("dayProfit is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("dayProfit =", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("dayProfit <>", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("dayProfit >", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("dayProfit >=", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("dayProfit <", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("dayProfit <=", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("dayProfit like", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("dayProfit not like", value, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("dayProfit in", values, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("dayProfit not in", values, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("dayProfit between", value1, value2, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("dayProfit not between", value1, value2, "dayProfit");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
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