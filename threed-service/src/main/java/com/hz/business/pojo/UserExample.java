package com.hz.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRndIsNull() {
            addCriterion("rnd is null");
            return (Criteria) this;
        }

        public Criteria andRndIsNotNull() {
            addCriterion("rnd is not null");
            return (Criteria) this;
        }

        public Criteria andRndEqualTo(String value) {
            addCriterion("rnd =", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndNotEqualTo(String value) {
            addCriterion("rnd <>", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndGreaterThan(String value) {
            addCriterion("rnd >", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndGreaterThanOrEqualTo(String value) {
            addCriterion("rnd >=", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndLessThan(String value) {
            addCriterion("rnd <", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndLessThanOrEqualTo(String value) {
            addCriterion("rnd <=", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndLike(String value) {
            addCriterion("rnd like", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndNotLike(String value) {
            addCriterion("rnd not like", value, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndIn(List<String> values) {
            addCriterion("rnd in", values, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndNotIn(List<String> values) {
            addCriterion("rnd not in", values, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndBetween(String value1, String value2) {
            addCriterion("rnd between", value1, value2, "rnd");
            return (Criteria) this;
        }

        public Criteria andRndNotBetween(String value1, String value2) {
            addCriterion("rnd not between", value1, value2, "rnd");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registertime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registertime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Integer value) {
            addCriterion("registertime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Integer value) {
            addCriterion("registertime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Integer value) {
            addCriterion("registertime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("registertime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Integer value) {
            addCriterion("registertime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Integer value) {
            addCriterion("registertime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Integer> values) {
            addCriterion("registertime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Integer> values) {
            addCriterion("registertime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Integer value1, Integer value2) {
            addCriterion("registertime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("registertime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Short value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Short value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Short value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Short value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Short value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Short value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Short> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Short> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Short value1, Short value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Short value1, Short value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andUserfenIsNull() {
            addCriterion("userfen is null");
            return (Criteria) this;
        }

        public Criteria andUserfenIsNotNull() {
            addCriterion("userfen is not null");
            return (Criteria) this;
        }

        public Criteria andUserfenEqualTo(Integer value) {
            addCriterion("userfen =", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotEqualTo(Integer value) {
            addCriterion("userfen <>", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenGreaterThan(Integer value) {
            addCriterion("userfen >", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenGreaterThanOrEqualTo(Integer value) {
            addCriterion("userfen >=", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenLessThan(Integer value) {
            addCriterion("userfen <", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenLessThanOrEqualTo(Integer value) {
            addCriterion("userfen <=", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenIn(List<Integer> values) {
            addCriterion("userfen in", values, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotIn(List<Integer> values) {
            addCriterion("userfen not in", values, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenBetween(Integer value1, Integer value2) {
            addCriterion("userfen between", value1, value2, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotBetween(Integer value1, Integer value2) {
            addCriterion("userfen not between", value1, value2, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNull() {
            addCriterion("userdate is null");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNotNull() {
            addCriterion("userdate is not null");
            return (Criteria) this;
        }

        public Criteria andUserdateEqualTo(Integer value) {
            addCriterion("userdate =", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotEqualTo(Integer value) {
            addCriterion("userdate <>", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThan(Integer value) {
            addCriterion("userdate >", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userdate >=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThan(Integer value) {
            addCriterion("userdate <", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThanOrEqualTo(Integer value) {
            addCriterion("userdate <=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateIn(List<Integer> values) {
            addCriterion("userdate in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotIn(List<Integer> values) {
            addCriterion("userdate not in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateBetween(Integer value1, Integer value2) {
            addCriterion("userdate between", value1, value2, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotBetween(Integer value1, Integer value2) {
            addCriterion("userdate not between", value1, value2, "userdate");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andZgroupidIsNull() {
            addCriterion("zgroupid is null");
            return (Criteria) this;
        }

        public Criteria andZgroupidIsNotNull() {
            addCriterion("zgroupid is not null");
            return (Criteria) this;
        }

        public Criteria andZgroupidEqualTo(Short value) {
            addCriterion("zgroupid =", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidNotEqualTo(Short value) {
            addCriterion("zgroupid <>", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidGreaterThan(Short value) {
            addCriterion("zgroupid >", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidGreaterThanOrEqualTo(Short value) {
            addCriterion("zgroupid >=", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidLessThan(Short value) {
            addCriterion("zgroupid <", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidLessThanOrEqualTo(Short value) {
            addCriterion("zgroupid <=", value, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidIn(List<Short> values) {
            addCriterion("zgroupid in", values, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidNotIn(List<Short> values) {
            addCriterion("zgroupid not in", values, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidBetween(Short value1, Short value2) {
            addCriterion("zgroupid between", value1, value2, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andZgroupidNotBetween(Short value1, Short value2) {
            addCriterion("zgroupid not between", value1, value2, "zgroupid");
            return (Criteria) this;
        }

        public Criteria andHavemsgIsNull() {
            addCriterion("havemsg is null");
            return (Criteria) this;
        }

        public Criteria andHavemsgIsNotNull() {
            addCriterion("havemsg is not null");
            return (Criteria) this;
        }

        public Criteria andHavemsgEqualTo(Boolean value) {
            addCriterion("havemsg =", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgNotEqualTo(Boolean value) {
            addCriterion("havemsg <>", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgGreaterThan(Boolean value) {
            addCriterion("havemsg >", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("havemsg >=", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgLessThan(Boolean value) {
            addCriterion("havemsg <", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgLessThanOrEqualTo(Boolean value) {
            addCriterion("havemsg <=", value, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgIn(List<Boolean> values) {
            addCriterion("havemsg in", values, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgNotIn(List<Boolean> values) {
            addCriterion("havemsg not in", values, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgBetween(Boolean value1, Boolean value2) {
            addCriterion("havemsg between", value1, value2, "havemsg");
            return (Criteria) this;
        }

        public Criteria andHavemsgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("havemsg not between", value1, value2, "havemsg");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Boolean value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Boolean value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Boolean value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Boolean value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Boolean> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Boolean> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checked not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNull() {
            addCriterion("userkey is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNotNull() {
            addCriterion("userkey is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyEqualTo(String value) {
            addCriterion("userkey =", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotEqualTo(String value) {
            addCriterion("userkey <>", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThan(String value) {
            addCriterion("userkey >", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThanOrEqualTo(String value) {
            addCriterion("userkey >=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThan(String value) {
            addCriterion("userkey <", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThanOrEqualTo(String value) {
            addCriterion("userkey <=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLike(String value) {
            addCriterion("userkey like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotLike(String value) {
            addCriterion("userkey not like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIn(List<String> values) {
            addCriterion("userkey in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotIn(List<String> values) {
            addCriterion("userkey not in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyBetween(String value1, String value2) {
            addCriterion("userkey between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotBetween(String value1, String value2) {
            addCriterion("userkey not between", value1, value2, "userkey");
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