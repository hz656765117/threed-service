package com.hz.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsTypeExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Short value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Short value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Short value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Short value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Short value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Short value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Short> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Short> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Short value1, Short value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Short value1, Short value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andBclassidIsNull() {
            addCriterion("bclassid is null");
            return (Criteria) this;
        }

        public Criteria andBclassidIsNotNull() {
            addCriterion("bclassid is not null");
            return (Criteria) this;
        }

        public Criteria andBclassidEqualTo(Short value) {
            addCriterion("bclassid =", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidNotEqualTo(Short value) {
            addCriterion("bclassid <>", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidGreaterThan(Short value) {
            addCriterion("bclassid >", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidGreaterThanOrEqualTo(Short value) {
            addCriterion("bclassid >=", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidLessThan(Short value) {
            addCriterion("bclassid <", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidLessThanOrEqualTo(Short value) {
            addCriterion("bclassid <=", value, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidIn(List<Short> values) {
            addCriterion("bclassid in", values, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidNotIn(List<Short> values) {
            addCriterion("bclassid not in", values, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidBetween(Short value1, Short value2) {
            addCriterion("bclassid between", value1, value2, "bclassid");
            return (Criteria) this;
        }

        public Criteria andBclassidNotBetween(Short value1, Short value2) {
            addCriterion("bclassid not between", value1, value2, "bclassid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andIsZtIsNull() {
            addCriterion("is_zt is null");
            return (Criteria) this;
        }

        public Criteria andIsZtIsNotNull() {
            addCriterion("is_zt is not null");
            return (Criteria) this;
        }

        public Criteria andIsZtEqualTo(Boolean value) {
            addCriterion("is_zt =", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtNotEqualTo(Boolean value) {
            addCriterion("is_zt <>", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtGreaterThan(Boolean value) {
            addCriterion("is_zt >", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_zt >=", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtLessThan(Boolean value) {
            addCriterion("is_zt <", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtLessThanOrEqualTo(Boolean value) {
            addCriterion("is_zt <=", value, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtIn(List<Boolean> values) {
            addCriterion("is_zt in", values, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtNotIn(List<Boolean> values) {
            addCriterion("is_zt not in", values, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtBetween(Boolean value1, Boolean value2) {
            addCriterion("is_zt between", value1, value2, "isZt");
            return (Criteria) this;
        }

        public Criteria andIsZtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_zt not between", value1, value2, "isZt");
            return (Criteria) this;
        }

        public Criteria andLencordIsNull() {
            addCriterion("lencord is null");
            return (Criteria) this;
        }

        public Criteria andLencordIsNotNull() {
            addCriterion("lencord is not null");
            return (Criteria) this;
        }

        public Criteria andLencordEqualTo(Short value) {
            addCriterion("lencord =", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordNotEqualTo(Short value) {
            addCriterion("lencord <>", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordGreaterThan(Short value) {
            addCriterion("lencord >", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordGreaterThanOrEqualTo(Short value) {
            addCriterion("lencord >=", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordLessThan(Short value) {
            addCriterion("lencord <", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordLessThanOrEqualTo(Short value) {
            addCriterion("lencord <=", value, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordIn(List<Short> values) {
            addCriterion("lencord in", values, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordNotIn(List<Short> values) {
            addCriterion("lencord not in", values, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordBetween(Short value1, Short value2) {
            addCriterion("lencord between", value1, value2, "lencord");
            return (Criteria) this;
        }

        public Criteria andLencordNotBetween(Short value1, Short value2) {
            addCriterion("lencord not between", value1, value2, "lencord");
            return (Criteria) this;
        }

        public Criteria andLinkNumIsNull() {
            addCriterion("link_num is null");
            return (Criteria) this;
        }

        public Criteria andLinkNumIsNotNull() {
            addCriterion("link_num is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNumEqualTo(Byte value) {
            addCriterion("link_num =", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotEqualTo(Byte value) {
            addCriterion("link_num <>", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumGreaterThan(Byte value) {
            addCriterion("link_num >", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("link_num >=", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumLessThan(Byte value) {
            addCriterion("link_num <", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumLessThanOrEqualTo(Byte value) {
            addCriterion("link_num <=", value, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumIn(List<Byte> values) {
            addCriterion("link_num in", values, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotIn(List<Byte> values) {
            addCriterion("link_num not in", values, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumBetween(Byte value1, Byte value2) {
            addCriterion("link_num between", value1, value2, "linkNum");
            return (Criteria) this;
        }

        public Criteria andLinkNumNotBetween(Byte value1, Byte value2) {
            addCriterion("link_num not between", value1, value2, "linkNum");
            return (Criteria) this;
        }

        public Criteria andNewstempidIsNull() {
            addCriterion("newstempid is null");
            return (Criteria) this;
        }

        public Criteria andNewstempidIsNotNull() {
            addCriterion("newstempid is not null");
            return (Criteria) this;
        }

        public Criteria andNewstempidEqualTo(Short value) {
            addCriterion("newstempid =", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidNotEqualTo(Short value) {
            addCriterion("newstempid <>", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidGreaterThan(Short value) {
            addCriterion("newstempid >", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidGreaterThanOrEqualTo(Short value) {
            addCriterion("newstempid >=", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidLessThan(Short value) {
            addCriterion("newstempid <", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidLessThanOrEqualTo(Short value) {
            addCriterion("newstempid <=", value, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidIn(List<Short> values) {
            addCriterion("newstempid in", values, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidNotIn(List<Short> values) {
            addCriterion("newstempid not in", values, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidBetween(Short value1, Short value2) {
            addCriterion("newstempid between", value1, value2, "newstempid");
            return (Criteria) this;
        }

        public Criteria andNewstempidNotBetween(Short value1, Short value2) {
            addCriterion("newstempid not between", value1, value2, "newstempid");
            return (Criteria) this;
        }

        public Criteria andOnclickIsNull() {
            addCriterion("onclick is null");
            return (Criteria) this;
        }

        public Criteria andOnclickIsNotNull() {
            addCriterion("onclick is not null");
            return (Criteria) this;
        }

        public Criteria andOnclickEqualTo(Integer value) {
            addCriterion("onclick =", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotEqualTo(Integer value) {
            addCriterion("onclick <>", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickGreaterThan(Integer value) {
            addCriterion("onclick >", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("onclick >=", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickLessThan(Integer value) {
            addCriterion("onclick <", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickLessThanOrEqualTo(Integer value) {
            addCriterion("onclick <=", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickIn(List<Integer> values) {
            addCriterion("onclick in", values, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotIn(List<Integer> values) {
            addCriterion("onclick not in", values, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickBetween(Integer value1, Integer value2) {
            addCriterion("onclick between", value1, value2, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotBetween(Integer value1, Integer value2) {
            addCriterion("onclick not between", value1, value2, "onclick");
            return (Criteria) this;
        }

        public Criteria andListtempidIsNull() {
            addCriterion("listtempid is null");
            return (Criteria) this;
        }

        public Criteria andListtempidIsNotNull() {
            addCriterion("listtempid is not null");
            return (Criteria) this;
        }

        public Criteria andListtempidEqualTo(Short value) {
            addCriterion("listtempid =", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidNotEqualTo(Short value) {
            addCriterion("listtempid <>", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidGreaterThan(Short value) {
            addCriterion("listtempid >", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidGreaterThanOrEqualTo(Short value) {
            addCriterion("listtempid >=", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidLessThan(Short value) {
            addCriterion("listtempid <", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidLessThanOrEqualTo(Short value) {
            addCriterion("listtempid <=", value, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidIn(List<Short> values) {
            addCriterion("listtempid in", values, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidNotIn(List<Short> values) {
            addCriterion("listtempid not in", values, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidBetween(Short value1, Short value2) {
            addCriterion("listtempid between", value1, value2, "listtempid");
            return (Criteria) this;
        }

        public Criteria andListtempidNotBetween(Short value1, Short value2) {
            addCriterion("listtempid not between", value1, value2, "listtempid");
            return (Criteria) this;
        }

        public Criteria andIslastIsNull() {
            addCriterion("islast is null");
            return (Criteria) this;
        }

        public Criteria andIslastIsNotNull() {
            addCriterion("islast is not null");
            return (Criteria) this;
        }

        public Criteria andIslastEqualTo(Boolean value) {
            addCriterion("islast =", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotEqualTo(Boolean value) {
            addCriterion("islast <>", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastGreaterThan(Boolean value) {
            addCriterion("islast >", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islast >=", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastLessThan(Boolean value) {
            addCriterion("islast <", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastLessThanOrEqualTo(Boolean value) {
            addCriterion("islast <=", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastIn(List<Boolean> values) {
            addCriterion("islast in", values, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotIn(List<Boolean> values) {
            addCriterion("islast not in", values, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastBetween(Boolean value1, Boolean value2) {
            addCriterion("islast between", value1, value2, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islast not between", value1, value2, "islast");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("classtype is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("classtype is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(String value) {
            addCriterion("classtype =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(String value) {
            addCriterion("classtype <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(String value) {
            addCriterion("classtype >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(String value) {
            addCriterion("classtype >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(String value) {
            addCriterion("classtype <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(String value) {
            addCriterion("classtype <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLike(String value) {
            addCriterion("classtype like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotLike(String value) {
            addCriterion("classtype not like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<String> values) {
            addCriterion("classtype in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<String> values) {
            addCriterion("classtype not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(String value1, String value2) {
            addCriterion("classtype between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(String value1, String value2) {
            addCriterion("classtype not between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andNewspathIsNull() {
            addCriterion("newspath is null");
            return (Criteria) this;
        }

        public Criteria andNewspathIsNotNull() {
            addCriterion("newspath is not null");
            return (Criteria) this;
        }

        public Criteria andNewspathEqualTo(String value) {
            addCriterion("newspath =", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathNotEqualTo(String value) {
            addCriterion("newspath <>", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathGreaterThan(String value) {
            addCriterion("newspath >", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathGreaterThanOrEqualTo(String value) {
            addCriterion("newspath >=", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathLessThan(String value) {
            addCriterion("newspath <", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathLessThanOrEqualTo(String value) {
            addCriterion("newspath <=", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathLike(String value) {
            addCriterion("newspath like", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathNotLike(String value) {
            addCriterion("newspath not like", value, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathIn(List<String> values) {
            addCriterion("newspath in", values, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathNotIn(List<String> values) {
            addCriterion("newspath not in", values, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathBetween(String value1, String value2) {
            addCriterion("newspath between", value1, value2, "newspath");
            return (Criteria) this;
        }

        public Criteria andNewspathNotBetween(String value1, String value2) {
            addCriterion("newspath not between", value1, value2, "newspath");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(Boolean value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(Boolean value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(Boolean value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(Boolean value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(Boolean value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(Boolean value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<Boolean> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<Boolean> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(Boolean value1, Boolean value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(Boolean value1, Boolean value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("filetype is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("filetype is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("filetype =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("filetype <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("filetype >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("filetype >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("filetype <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("filetype <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("filetype like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("filetype not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("filetype in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("filetype not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("filetype between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("filetype not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andOpenplIsNull() {
            addCriterion("openpl is null");
            return (Criteria) this;
        }

        public Criteria andOpenplIsNotNull() {
            addCriterion("openpl is not null");
            return (Criteria) this;
        }

        public Criteria andOpenplEqualTo(Boolean value) {
            addCriterion("openpl =", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplNotEqualTo(Boolean value) {
            addCriterion("openpl <>", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplGreaterThan(Boolean value) {
            addCriterion("openpl >", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplGreaterThanOrEqualTo(Boolean value) {
            addCriterion("openpl >=", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplLessThan(Boolean value) {
            addCriterion("openpl <", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplLessThanOrEqualTo(Boolean value) {
            addCriterion("openpl <=", value, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplIn(List<Boolean> values) {
            addCriterion("openpl in", values, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplNotIn(List<Boolean> values) {
            addCriterion("openpl not in", values, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplBetween(Boolean value1, Boolean value2) {
            addCriterion("openpl between", value1, value2, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenplNotBetween(Boolean value1, Boolean value2) {
            addCriterion("openpl not between", value1, value2, "openpl");
            return (Criteria) this;
        }

        public Criteria andOpenaddIsNull() {
            addCriterion("openadd is null");
            return (Criteria) this;
        }

        public Criteria andOpenaddIsNotNull() {
            addCriterion("openadd is not null");
            return (Criteria) this;
        }

        public Criteria andOpenaddEqualTo(Boolean value) {
            addCriterion("openadd =", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddNotEqualTo(Boolean value) {
            addCriterion("openadd <>", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddGreaterThan(Boolean value) {
            addCriterion("openadd >", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddGreaterThanOrEqualTo(Boolean value) {
            addCriterion("openadd >=", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddLessThan(Boolean value) {
            addCriterion("openadd <", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddLessThanOrEqualTo(Boolean value) {
            addCriterion("openadd <=", value, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddIn(List<Boolean> values) {
            addCriterion("openadd in", values, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddNotIn(List<Boolean> values) {
            addCriterion("openadd not in", values, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddBetween(Boolean value1, Boolean value2) {
            addCriterion("openadd between", value1, value2, "openadd");
            return (Criteria) this;
        }

        public Criteria andOpenaddNotBetween(Boolean value1, Boolean value2) {
            addCriterion("openadd not between", value1, value2, "openadd");
            return (Criteria) this;
        }

        public Criteria andNewlineIsNull() {
            addCriterion("newline is null");
            return (Criteria) this;
        }

        public Criteria andNewlineIsNotNull() {
            addCriterion("newline is not null");
            return (Criteria) this;
        }

        public Criteria andNewlineEqualTo(Integer value) {
            addCriterion("newline =", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineNotEqualTo(Integer value) {
            addCriterion("newline <>", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineGreaterThan(Integer value) {
            addCriterion("newline >", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("newline >=", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineLessThan(Integer value) {
            addCriterion("newline <", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineLessThanOrEqualTo(Integer value) {
            addCriterion("newline <=", value, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineIn(List<Integer> values) {
            addCriterion("newline in", values, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineNotIn(List<Integer> values) {
            addCriterion("newline not in", values, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineBetween(Integer value1, Integer value2) {
            addCriterion("newline between", value1, value2, "newline");
            return (Criteria) this;
        }

        public Criteria andNewlineNotBetween(Integer value1, Integer value2) {
            addCriterion("newline not between", value1, value2, "newline");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNull() {
            addCriterion("hotline is null");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNotNull() {
            addCriterion("hotline is not null");
            return (Criteria) this;
        }

        public Criteria andHotlineEqualTo(Integer value) {
            addCriterion("hotline =", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotEqualTo(Integer value) {
            addCriterion("hotline <>", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThan(Integer value) {
            addCriterion("hotline >", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotline >=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThan(Integer value) {
            addCriterion("hotline <", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThanOrEqualTo(Integer value) {
            addCriterion("hotline <=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineIn(List<Integer> values) {
            addCriterion("hotline in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotIn(List<Integer> values) {
            addCriterion("hotline not in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineBetween(Integer value1, Integer value2) {
            addCriterion("hotline between", value1, value2, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotBetween(Integer value1, Integer value2) {
            addCriterion("hotline not between", value1, value2, "hotline");
            return (Criteria) this;
        }

        public Criteria andGoodlineIsNull() {
            addCriterion("goodline is null");
            return (Criteria) this;
        }

        public Criteria andGoodlineIsNotNull() {
            addCriterion("goodline is not null");
            return (Criteria) this;
        }

        public Criteria andGoodlineEqualTo(Integer value) {
            addCriterion("goodline =", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineNotEqualTo(Integer value) {
            addCriterion("goodline <>", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineGreaterThan(Integer value) {
            addCriterion("goodline >", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodline >=", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineLessThan(Integer value) {
            addCriterion("goodline <", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineLessThanOrEqualTo(Integer value) {
            addCriterion("goodline <=", value, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineIn(List<Integer> values) {
            addCriterion("goodline in", values, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineNotIn(List<Integer> values) {
            addCriterion("goodline not in", values, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineBetween(Integer value1, Integer value2) {
            addCriterion("goodline between", value1, value2, "goodline");
            return (Criteria) this;
        }

        public Criteria andGoodlineNotBetween(Integer value1, Integer value2) {
            addCriterion("goodline not between", value1, value2, "goodline");
            return (Criteria) this;
        }

        public Criteria andClassurlIsNull() {
            addCriterion("classurl is null");
            return (Criteria) this;
        }

        public Criteria andClassurlIsNotNull() {
            addCriterion("classurl is not null");
            return (Criteria) this;
        }

        public Criteria andClassurlEqualTo(String value) {
            addCriterion("classurl =", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlNotEqualTo(String value) {
            addCriterion("classurl <>", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlGreaterThan(String value) {
            addCriterion("classurl >", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlGreaterThanOrEqualTo(String value) {
            addCriterion("classurl >=", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlLessThan(String value) {
            addCriterion("classurl <", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlLessThanOrEqualTo(String value) {
            addCriterion("classurl <=", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlLike(String value) {
            addCriterion("classurl like", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlNotLike(String value) {
            addCriterion("classurl not like", value, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlIn(List<String> values) {
            addCriterion("classurl in", values, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlNotIn(List<String> values) {
            addCriterion("classurl not in", values, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlBetween(String value1, String value2) {
            addCriterion("classurl between", value1, value2, "classurl");
            return (Criteria) this;
        }

        public Criteria andClassurlNotBetween(String value1, String value2) {
            addCriterion("classurl not between", value1, value2, "classurl");
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

        public Criteria andMyorderIsNull() {
            addCriterion("myorder is null");
            return (Criteria) this;
        }

        public Criteria andMyorderIsNotNull() {
            addCriterion("myorder is not null");
            return (Criteria) this;
        }

        public Criteria andMyorderEqualTo(Short value) {
            addCriterion("myorder =", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderNotEqualTo(Short value) {
            addCriterion("myorder <>", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderGreaterThan(Short value) {
            addCriterion("myorder >", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderGreaterThanOrEqualTo(Short value) {
            addCriterion("myorder >=", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderLessThan(Short value) {
            addCriterion("myorder <", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderLessThanOrEqualTo(Short value) {
            addCriterion("myorder <=", value, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderIn(List<Short> values) {
            addCriterion("myorder in", values, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderNotIn(List<Short> values) {
            addCriterion("myorder not in", values, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderBetween(Short value1, Short value2) {
            addCriterion("myorder between", value1, value2, "myorder");
            return (Criteria) this;
        }

        public Criteria andMyorderNotBetween(Short value1, Short value2) {
            addCriterion("myorder not between", value1, value2, "myorder");
            return (Criteria) this;
        }

        public Criteria andFilenameQzIsNull() {
            addCriterion("filename_qz is null");
            return (Criteria) this;
        }

        public Criteria andFilenameQzIsNotNull() {
            addCriterion("filename_qz is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameQzEqualTo(String value) {
            addCriterion("filename_qz =", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzNotEqualTo(String value) {
            addCriterion("filename_qz <>", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzGreaterThan(String value) {
            addCriterion("filename_qz >", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzGreaterThanOrEqualTo(String value) {
            addCriterion("filename_qz >=", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzLessThan(String value) {
            addCriterion("filename_qz <", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzLessThanOrEqualTo(String value) {
            addCriterion("filename_qz <=", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzLike(String value) {
            addCriterion("filename_qz like", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzNotLike(String value) {
            addCriterion("filename_qz not like", value, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzIn(List<String> values) {
            addCriterion("filename_qz in", values, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzNotIn(List<String> values) {
            addCriterion("filename_qz not in", values, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzBetween(String value1, String value2) {
            addCriterion("filename_qz between", value1, value2, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andFilenameQzNotBetween(String value1, String value2) {
            addCriterion("filename_qz not between", value1, value2, "filenameQz");
            return (Criteria) this;
        }

        public Criteria andHotpllineIsNull() {
            addCriterion("hotplline is null");
            return (Criteria) this;
        }

        public Criteria andHotpllineIsNotNull() {
            addCriterion("hotplline is not null");
            return (Criteria) this;
        }

        public Criteria andHotpllineEqualTo(Byte value) {
            addCriterion("hotplline =", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineNotEqualTo(Byte value) {
            addCriterion("hotplline <>", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineGreaterThan(Byte value) {
            addCriterion("hotplline >", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineGreaterThanOrEqualTo(Byte value) {
            addCriterion("hotplline >=", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineLessThan(Byte value) {
            addCriterion("hotplline <", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineLessThanOrEqualTo(Byte value) {
            addCriterion("hotplline <=", value, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineIn(List<Byte> values) {
            addCriterion("hotplline in", values, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineNotIn(List<Byte> values) {
            addCriterion("hotplline not in", values, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineBetween(Byte value1, Byte value2) {
            addCriterion("hotplline between", value1, value2, "hotplline");
            return (Criteria) this;
        }

        public Criteria andHotpllineNotBetween(Byte value1, Byte value2) {
            addCriterion("hotplline not between", value1, value2, "hotplline");
            return (Criteria) this;
        }

        public Criteria andModidIsNull() {
            addCriterion("modid is null");
            return (Criteria) this;
        }

        public Criteria andModidIsNotNull() {
            addCriterion("modid is not null");
            return (Criteria) this;
        }

        public Criteria andModidEqualTo(Short value) {
            addCriterion("modid =", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotEqualTo(Short value) {
            addCriterion("modid <>", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThan(Short value) {
            addCriterion("modid >", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThanOrEqualTo(Short value) {
            addCriterion("modid >=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThan(Short value) {
            addCriterion("modid <", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThanOrEqualTo(Short value) {
            addCriterion("modid <=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidIn(List<Short> values) {
            addCriterion("modid in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotIn(List<Short> values) {
            addCriterion("modid not in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidBetween(Short value1, Short value2) {
            addCriterion("modid between", value1, value2, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotBetween(Short value1, Short value2) {
            addCriterion("modid not between", value1, value2, "modid");
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

        public Criteria andFirstlineIsNull() {
            addCriterion("firstline is null");
            return (Criteria) this;
        }

        public Criteria andFirstlineIsNotNull() {
            addCriterion("firstline is not null");
            return (Criteria) this;
        }

        public Criteria andFirstlineEqualTo(Byte value) {
            addCriterion("firstline =", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineNotEqualTo(Byte value) {
            addCriterion("firstline <>", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineGreaterThan(Byte value) {
            addCriterion("firstline >", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("firstline >=", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineLessThan(Byte value) {
            addCriterion("firstline <", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineLessThanOrEqualTo(Byte value) {
            addCriterion("firstline <=", value, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineIn(List<Byte> values) {
            addCriterion("firstline in", values, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineNotIn(List<Byte> values) {
            addCriterion("firstline not in", values, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineBetween(Byte value1, Byte value2) {
            addCriterion("firstline between", value1, value2, "firstline");
            return (Criteria) this;
        }

        public Criteria andFirstlineNotBetween(Byte value1, Byte value2) {
            addCriterion("firstline not between", value1, value2, "firstline");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andIslistIsNull() {
            addCriterion("islist is null");
            return (Criteria) this;
        }

        public Criteria andIslistIsNotNull() {
            addCriterion("islist is not null");
            return (Criteria) this;
        }

        public Criteria andIslistEqualTo(Boolean value) {
            addCriterion("islist =", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotEqualTo(Boolean value) {
            addCriterion("islist <>", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistGreaterThan(Boolean value) {
            addCriterion("islist >", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islist >=", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistLessThan(Boolean value) {
            addCriterion("islist <", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistLessThanOrEqualTo(Boolean value) {
            addCriterion("islist <=", value, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistIn(List<Boolean> values) {
            addCriterion("islist in", values, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotIn(List<Boolean> values) {
            addCriterion("islist not in", values, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistBetween(Boolean value1, Boolean value2) {
            addCriterion("islist between", value1, value2, "islist");
            return (Criteria) this;
        }

        public Criteria andIslistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islist not between", value1, value2, "islist");
            return (Criteria) this;
        }

        public Criteria andSearchtempidIsNull() {
            addCriterion("searchtempid is null");
            return (Criteria) this;
        }

        public Criteria andSearchtempidIsNotNull() {
            addCriterion("searchtempid is not null");
            return (Criteria) this;
        }

        public Criteria andSearchtempidEqualTo(Short value) {
            addCriterion("searchtempid =", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidNotEqualTo(Short value) {
            addCriterion("searchtempid <>", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidGreaterThan(Short value) {
            addCriterion("searchtempid >", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidGreaterThanOrEqualTo(Short value) {
            addCriterion("searchtempid >=", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidLessThan(Short value) {
            addCriterion("searchtempid <", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidLessThanOrEqualTo(Short value) {
            addCriterion("searchtempid <=", value, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidIn(List<Short> values) {
            addCriterion("searchtempid in", values, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidNotIn(List<Short> values) {
            addCriterion("searchtempid not in", values, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidBetween(Short value1, Short value2) {
            addCriterion("searchtempid between", value1, value2, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andSearchtempidNotBetween(Short value1, Short value2) {
            addCriterion("searchtempid not between", value1, value2, "searchtempid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Short value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Short value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Short value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Short value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Short value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Short value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Short> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Short> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Short value1, Short value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Short value1, Short value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTbnameIsNull() {
            addCriterion("tbname is null");
            return (Criteria) this;
        }

        public Criteria andTbnameIsNotNull() {
            addCriterion("tbname is not null");
            return (Criteria) this;
        }

        public Criteria andTbnameEqualTo(String value) {
            addCriterion("tbname =", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotEqualTo(String value) {
            addCriterion("tbname <>", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThan(String value) {
            addCriterion("tbname >", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThanOrEqualTo(String value) {
            addCriterion("tbname >=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThan(String value) {
            addCriterion("tbname <", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThanOrEqualTo(String value) {
            addCriterion("tbname <=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLike(String value) {
            addCriterion("tbname like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotLike(String value) {
            addCriterion("tbname not like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameIn(List<String> values) {
            addCriterion("tbname in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotIn(List<String> values) {
            addCriterion("tbname not in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameBetween(String value1, String value2) {
            addCriterion("tbname between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotBetween(String value1, String value2) {
            addCriterion("tbname not between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("maxnum is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("maxnum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(Integer value) {
            addCriterion("maxnum =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(Integer value) {
            addCriterion("maxnum <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(Integer value) {
            addCriterion("maxnum >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxnum >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(Integer value) {
            addCriterion("maxnum <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxnum <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<Integer> values) {
            addCriterion("maxnum in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<Integer> values) {
            addCriterion("maxnum not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("maxnum between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxnum not between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andCheckplIsNull() {
            addCriterion("checkpl is null");
            return (Criteria) this;
        }

        public Criteria andCheckplIsNotNull() {
            addCriterion("checkpl is not null");
            return (Criteria) this;
        }

        public Criteria andCheckplEqualTo(Boolean value) {
            addCriterion("checkpl =", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplNotEqualTo(Boolean value) {
            addCriterion("checkpl <>", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplGreaterThan(Boolean value) {
            addCriterion("checkpl >", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checkpl >=", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplLessThan(Boolean value) {
            addCriterion("checkpl <", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplLessThanOrEqualTo(Boolean value) {
            addCriterion("checkpl <=", value, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplIn(List<Boolean> values) {
            addCriterion("checkpl in", values, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplNotIn(List<Boolean> values) {
            addCriterion("checkpl not in", values, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplBetween(Boolean value1, Boolean value2) {
            addCriterion("checkpl between", value1, value2, "checkpl");
            return (Criteria) this;
        }

        public Criteria andCheckplNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checkpl not between", value1, value2, "checkpl");
            return (Criteria) this;
        }

        public Criteria andDownNumIsNull() {
            addCriterion("down_num is null");
            return (Criteria) this;
        }

        public Criteria andDownNumIsNotNull() {
            addCriterion("down_num is not null");
            return (Criteria) this;
        }

        public Criteria andDownNumEqualTo(Byte value) {
            addCriterion("down_num =", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumNotEqualTo(Byte value) {
            addCriterion("down_num <>", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumGreaterThan(Byte value) {
            addCriterion("down_num >", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("down_num >=", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumLessThan(Byte value) {
            addCriterion("down_num <", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumLessThanOrEqualTo(Byte value) {
            addCriterion("down_num <=", value, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumIn(List<Byte> values) {
            addCriterion("down_num in", values, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumNotIn(List<Byte> values) {
            addCriterion("down_num not in", values, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumBetween(Byte value1, Byte value2) {
            addCriterion("down_num between", value1, value2, "downNum");
            return (Criteria) this;
        }

        public Criteria andDownNumNotBetween(Byte value1, Byte value2) {
            addCriterion("down_num not between", value1, value2, "downNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumIsNull() {
            addCriterion("online_num is null");
            return (Criteria) this;
        }

        public Criteria andOnlineNumIsNotNull() {
            addCriterion("online_num is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineNumEqualTo(Byte value) {
            addCriterion("online_num =", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumNotEqualTo(Byte value) {
            addCriterion("online_num <>", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumGreaterThan(Byte value) {
            addCriterion("online_num >", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("online_num >=", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumLessThan(Byte value) {
            addCriterion("online_num <", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumLessThanOrEqualTo(Byte value) {
            addCriterion("online_num <=", value, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumIn(List<Byte> values) {
            addCriterion("online_num in", values, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumNotIn(List<Byte> values) {
            addCriterion("online_num not in", values, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumBetween(Byte value1, Byte value2) {
            addCriterion("online_num between", value1, value2, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andOnlineNumNotBetween(Byte value1, Byte value2) {
            addCriterion("online_num not between", value1, value2, "onlineNum");
            return (Criteria) this;
        }

        public Criteria andListorderIsNull() {
            addCriterion("listorder is null");
            return (Criteria) this;
        }

        public Criteria andListorderIsNotNull() {
            addCriterion("listorder is not null");
            return (Criteria) this;
        }

        public Criteria andListorderEqualTo(String value) {
            addCriterion("listorder =", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotEqualTo(String value) {
            addCriterion("listorder <>", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThan(String value) {
            addCriterion("listorder >", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThanOrEqualTo(String value) {
            addCriterion("listorder >=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThan(String value) {
            addCriterion("listorder <", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThanOrEqualTo(String value) {
            addCriterion("listorder <=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLike(String value) {
            addCriterion("listorder like", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotLike(String value) {
            addCriterion("listorder not like", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderIn(List<String> values) {
            addCriterion("listorder in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotIn(List<String> values) {
            addCriterion("listorder not in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderBetween(String value1, String value2) {
            addCriterion("listorder between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotBetween(String value1, String value2) {
            addCriterion("listorder not between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andReorderIsNull() {
            addCriterion("reorder is null");
            return (Criteria) this;
        }

        public Criteria andReorderIsNotNull() {
            addCriterion("reorder is not null");
            return (Criteria) this;
        }

        public Criteria andReorderEqualTo(String value) {
            addCriterion("reorder =", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotEqualTo(String value) {
            addCriterion("reorder <>", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThan(String value) {
            addCriterion("reorder >", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThanOrEqualTo(String value) {
            addCriterion("reorder >=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThan(String value) {
            addCriterion("reorder <", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThanOrEqualTo(String value) {
            addCriterion("reorder <=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLike(String value) {
            addCriterion("reorder like", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotLike(String value) {
            addCriterion("reorder not like", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderIn(List<String> values) {
            addCriterion("reorder in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotIn(List<String> values) {
            addCriterion("reorder not in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderBetween(String value1, String value2) {
            addCriterion("reorder between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotBetween(String value1, String value2) {
            addCriterion("reorder not between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andClassimgIsNull() {
            addCriterion("classimg is null");
            return (Criteria) this;
        }

        public Criteria andClassimgIsNotNull() {
            addCriterion("classimg is not null");
            return (Criteria) this;
        }

        public Criteria andClassimgEqualTo(String value) {
            addCriterion("classimg =", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgNotEqualTo(String value) {
            addCriterion("classimg <>", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgGreaterThan(String value) {
            addCriterion("classimg >", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgGreaterThanOrEqualTo(String value) {
            addCriterion("classimg >=", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgLessThan(String value) {
            addCriterion("classimg <", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgLessThanOrEqualTo(String value) {
            addCriterion("classimg <=", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgLike(String value) {
            addCriterion("classimg like", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgNotLike(String value) {
            addCriterion("classimg not like", value, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgIn(List<String> values) {
            addCriterion("classimg in", values, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgNotIn(List<String> values) {
            addCriterion("classimg not in", values, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgBetween(String value1, String value2) {
            addCriterion("classimg between", value1, value2, "classimg");
            return (Criteria) this;
        }

        public Criteria andClassimgNotBetween(String value1, String value2) {
            addCriterion("classimg not between", value1, value2, "classimg");
            return (Criteria) this;
        }

        public Criteria andJstempidIsNull() {
            addCriterion("jstempid is null");
            return (Criteria) this;
        }

        public Criteria andJstempidIsNotNull() {
            addCriterion("jstempid is not null");
            return (Criteria) this;
        }

        public Criteria andJstempidEqualTo(Short value) {
            addCriterion("jstempid =", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidNotEqualTo(Short value) {
            addCriterion("jstempid <>", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidGreaterThan(Short value) {
            addCriterion("jstempid >", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidGreaterThanOrEqualTo(Short value) {
            addCriterion("jstempid >=", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidLessThan(Short value) {
            addCriterion("jstempid <", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidLessThanOrEqualTo(Short value) {
            addCriterion("jstempid <=", value, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidIn(List<Short> values) {
            addCriterion("jstempid in", values, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidNotIn(List<Short> values) {
            addCriterion("jstempid not in", values, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidBetween(Short value1, Short value2) {
            addCriterion("jstempid between", value1, value2, "jstempid");
            return (Criteria) this;
        }

        public Criteria andJstempidNotBetween(Short value1, Short value2) {
            addCriterion("jstempid not between", value1, value2, "jstempid");
            return (Criteria) this;
        }

        public Criteria andAddinfofenIsNull() {
            addCriterion("addinfofen is null");
            return (Criteria) this;
        }

        public Criteria andAddinfofenIsNotNull() {
            addCriterion("addinfofen is not null");
            return (Criteria) this;
        }

        public Criteria andAddinfofenEqualTo(Integer value) {
            addCriterion("addinfofen =", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenNotEqualTo(Integer value) {
            addCriterion("addinfofen <>", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenGreaterThan(Integer value) {
            addCriterion("addinfofen >", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenGreaterThanOrEqualTo(Integer value) {
            addCriterion("addinfofen >=", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenLessThan(Integer value) {
            addCriterion("addinfofen <", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenLessThanOrEqualTo(Integer value) {
            addCriterion("addinfofen <=", value, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenIn(List<Integer> values) {
            addCriterion("addinfofen in", values, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenNotIn(List<Integer> values) {
            addCriterion("addinfofen not in", values, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenBetween(Integer value1, Integer value2) {
            addCriterion("addinfofen between", value1, value2, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andAddinfofenNotBetween(Integer value1, Integer value2) {
            addCriterion("addinfofen not between", value1, value2, "addinfofen");
            return (Criteria) this;
        }

        public Criteria andListdtIsNull() {
            addCriterion("listdt is null");
            return (Criteria) this;
        }

        public Criteria andListdtIsNotNull() {
            addCriterion("listdt is not null");
            return (Criteria) this;
        }

        public Criteria andListdtEqualTo(Boolean value) {
            addCriterion("listdt =", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtNotEqualTo(Boolean value) {
            addCriterion("listdt <>", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtGreaterThan(Boolean value) {
            addCriterion("listdt >", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("listdt >=", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtLessThan(Boolean value) {
            addCriterion("listdt <", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtLessThanOrEqualTo(Boolean value) {
            addCriterion("listdt <=", value, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtIn(List<Boolean> values) {
            addCriterion("listdt in", values, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtNotIn(List<Boolean> values) {
            addCriterion("listdt not in", values, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtBetween(Boolean value1, Boolean value2) {
            addCriterion("listdt between", value1, value2, "listdt");
            return (Criteria) this;
        }

        public Criteria andListdtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("listdt not between", value1, value2, "listdt");
            return (Criteria) this;
        }

        public Criteria andShowclassIsNull() {
            addCriterion("showclass is null");
            return (Criteria) this;
        }

        public Criteria andShowclassIsNotNull() {
            addCriterion("showclass is not null");
            return (Criteria) this;
        }

        public Criteria andShowclassEqualTo(Boolean value) {
            addCriterion("showclass =", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassNotEqualTo(Boolean value) {
            addCriterion("showclass <>", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassGreaterThan(Boolean value) {
            addCriterion("showclass >", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("showclass >=", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassLessThan(Boolean value) {
            addCriterion("showclass <", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassLessThanOrEqualTo(Boolean value) {
            addCriterion("showclass <=", value, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassIn(List<Boolean> values) {
            addCriterion("showclass in", values, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassNotIn(List<Boolean> values) {
            addCriterion("showclass not in", values, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassBetween(Boolean value1, Boolean value2) {
            addCriterion("showclass between", value1, value2, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowclassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("showclass not between", value1, value2, "showclass");
            return (Criteria) this;
        }

        public Criteria andShowdtIsNull() {
            addCriterion("showdt is null");
            return (Criteria) this;
        }

        public Criteria andShowdtIsNotNull() {
            addCriterion("showdt is not null");
            return (Criteria) this;
        }

        public Criteria andShowdtEqualTo(Boolean value) {
            addCriterion("showdt =", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtNotEqualTo(Boolean value) {
            addCriterion("showdt <>", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtGreaterThan(Boolean value) {
            addCriterion("showdt >", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("showdt >=", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtLessThan(Boolean value) {
            addCriterion("showdt <", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtLessThanOrEqualTo(Boolean value) {
            addCriterion("showdt <=", value, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtIn(List<Boolean> values) {
            addCriterion("showdt in", values, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtNotIn(List<Boolean> values) {
            addCriterion("showdt not in", values, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtBetween(Boolean value1, Boolean value2) {
            addCriterion("showdt between", value1, value2, "showdt");
            return (Criteria) this;
        }

        public Criteria andShowdtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("showdt not between", value1, value2, "showdt");
            return (Criteria) this;
        }

        public Criteria andCheckqaddIsNull() {
            addCriterion("checkqadd is null");
            return (Criteria) this;
        }

        public Criteria andCheckqaddIsNotNull() {
            addCriterion("checkqadd is not null");
            return (Criteria) this;
        }

        public Criteria andCheckqaddEqualTo(Boolean value) {
            addCriterion("checkqadd =", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddNotEqualTo(Boolean value) {
            addCriterion("checkqadd <>", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddGreaterThan(Boolean value) {
            addCriterion("checkqadd >", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checkqadd >=", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddLessThan(Boolean value) {
            addCriterion("checkqadd <", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddLessThanOrEqualTo(Boolean value) {
            addCriterion("checkqadd <=", value, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddIn(List<Boolean> values) {
            addCriterion("checkqadd in", values, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddNotIn(List<Boolean> values) {
            addCriterion("checkqadd not in", values, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddBetween(Boolean value1, Boolean value2) {
            addCriterion("checkqadd between", value1, value2, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andCheckqaddNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checkqadd not between", value1, value2, "checkqadd");
            return (Criteria) this;
        }

        public Criteria andQaddlistIsNull() {
            addCriterion("qaddlist is null");
            return (Criteria) this;
        }

        public Criteria andQaddlistIsNotNull() {
            addCriterion("qaddlist is not null");
            return (Criteria) this;
        }

        public Criteria andQaddlistEqualTo(Boolean value) {
            addCriterion("qaddlist =", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistNotEqualTo(Boolean value) {
            addCriterion("qaddlist <>", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistGreaterThan(Boolean value) {
            addCriterion("qaddlist >", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qaddlist >=", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistLessThan(Boolean value) {
            addCriterion("qaddlist <", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistLessThanOrEqualTo(Boolean value) {
            addCriterion("qaddlist <=", value, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistIn(List<Boolean> values) {
            addCriterion("qaddlist in", values, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistNotIn(List<Boolean> values) {
            addCriterion("qaddlist not in", values, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistBetween(Boolean value1, Boolean value2) {
            addCriterion("qaddlist between", value1, value2, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddlistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qaddlist not between", value1, value2, "qaddlist");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyIsNull() {
            addCriterion("qaddshowkey is null");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyIsNotNull() {
            addCriterion("qaddshowkey is not null");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyEqualTo(Boolean value) {
            addCriterion("qaddshowkey =", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyNotEqualTo(Boolean value) {
            addCriterion("qaddshowkey <>", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyGreaterThan(Boolean value) {
            addCriterion("qaddshowkey >", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qaddshowkey >=", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyLessThan(Boolean value) {
            addCriterion("qaddshowkey <", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyLessThanOrEqualTo(Boolean value) {
            addCriterion("qaddshowkey <=", value, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyIn(List<Boolean> values) {
            addCriterion("qaddshowkey in", values, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyNotIn(List<Boolean> values) {
            addCriterion("qaddshowkey not in", values, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyBetween(Boolean value1, Boolean value2) {
            addCriterion("qaddshowkey between", value1, value2, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andQaddshowkeyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qaddshowkey not between", value1, value2, "qaddshowkey");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoIsNull() {
            addCriterion("adminqinfo is null");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoIsNotNull() {
            addCriterion("adminqinfo is not null");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoEqualTo(Boolean value) {
            addCriterion("adminqinfo =", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoNotEqualTo(Boolean value) {
            addCriterion("adminqinfo <>", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoGreaterThan(Boolean value) {
            addCriterion("adminqinfo >", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("adminqinfo >=", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoLessThan(Boolean value) {
            addCriterion("adminqinfo <", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoLessThanOrEqualTo(Boolean value) {
            addCriterion("adminqinfo <=", value, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoIn(List<Boolean> values) {
            addCriterion("adminqinfo in", values, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoNotIn(List<Boolean> values) {
            addCriterion("adminqinfo not in", values, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoBetween(Boolean value1, Boolean value2) {
            addCriterion("adminqinfo between", value1, value2, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andAdminqinfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("adminqinfo not between", value1, value2, "adminqinfo");
            return (Criteria) this;
        }

        public Criteria andDoctimeIsNull() {
            addCriterion("doctime is null");
            return (Criteria) this;
        }

        public Criteria andDoctimeIsNotNull() {
            addCriterion("doctime is not null");
            return (Criteria) this;
        }

        public Criteria andDoctimeEqualTo(Short value) {
            addCriterion("doctime =", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeNotEqualTo(Short value) {
            addCriterion("doctime <>", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeGreaterThan(Short value) {
            addCriterion("doctime >", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeGreaterThanOrEqualTo(Short value) {
            addCriterion("doctime >=", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeLessThan(Short value) {
            addCriterion("doctime <", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeLessThanOrEqualTo(Short value) {
            addCriterion("doctime <=", value, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeIn(List<Short> values) {
            addCriterion("doctime in", values, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeNotIn(List<Short> values) {
            addCriterion("doctime not in", values, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeBetween(Short value1, Short value2) {
            addCriterion("doctime between", value1, value2, "doctime");
            return (Criteria) this;
        }

        public Criteria andDoctimeNotBetween(Short value1, Short value2) {
            addCriterion("doctime not between", value1, value2, "doctime");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyIsNull() {
            addCriterion("classpagekey is null");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyIsNotNull() {
            addCriterion("classpagekey is not null");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyEqualTo(String value) {
            addCriterion("classpagekey =", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyNotEqualTo(String value) {
            addCriterion("classpagekey <>", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyGreaterThan(String value) {
            addCriterion("classpagekey >", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyGreaterThanOrEqualTo(String value) {
            addCriterion("classpagekey >=", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyLessThan(String value) {
            addCriterion("classpagekey <", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyLessThanOrEqualTo(String value) {
            addCriterion("classpagekey <=", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyLike(String value) {
            addCriterion("classpagekey like", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyNotLike(String value) {
            addCriterion("classpagekey not like", value, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyIn(List<String> values) {
            addCriterion("classpagekey in", values, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyNotIn(List<String> values) {
            addCriterion("classpagekey not in", values, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyBetween(String value1, String value2) {
            addCriterion("classpagekey between", value1, value2, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andClasspagekeyNotBetween(String value1, String value2) {
            addCriterion("classpagekey not between", value1, value2, "classpagekey");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidIsNull() {
            addCriterion("dtlisttempid is null");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidIsNotNull() {
            addCriterion("dtlisttempid is not null");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidEqualTo(Short value) {
            addCriterion("dtlisttempid =", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidNotEqualTo(Short value) {
            addCriterion("dtlisttempid <>", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidGreaterThan(Short value) {
            addCriterion("dtlisttempid >", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidGreaterThanOrEqualTo(Short value) {
            addCriterion("dtlisttempid >=", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidLessThan(Short value) {
            addCriterion("dtlisttempid <", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidLessThanOrEqualTo(Short value) {
            addCriterion("dtlisttempid <=", value, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidIn(List<Short> values) {
            addCriterion("dtlisttempid in", values, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidNotIn(List<Short> values) {
            addCriterion("dtlisttempid not in", values, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidBetween(Short value1, Short value2) {
            addCriterion("dtlisttempid between", value1, value2, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andDtlisttempidNotBetween(Short value1, Short value2) {
            addCriterion("dtlisttempid not between", value1, value2, "dtlisttempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidIsNull() {
            addCriterion("classtempid is null");
            return (Criteria) this;
        }

        public Criteria andClasstempidIsNotNull() {
            addCriterion("classtempid is not null");
            return (Criteria) this;
        }

        public Criteria andClasstempidEqualTo(Short value) {
            addCriterion("classtempid =", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidNotEqualTo(Short value) {
            addCriterion("classtempid <>", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidGreaterThan(Short value) {
            addCriterion("classtempid >", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidGreaterThanOrEqualTo(Short value) {
            addCriterion("classtempid >=", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidLessThan(Short value) {
            addCriterion("classtempid <", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidLessThanOrEqualTo(Short value) {
            addCriterion("classtempid <=", value, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidIn(List<Short> values) {
            addCriterion("classtempid in", values, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidNotIn(List<Short> values) {
            addCriterion("classtempid not in", values, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidBetween(Short value1, Short value2) {
            addCriterion("classtempid between", value1, value2, "classtempid");
            return (Criteria) this;
        }

        public Criteria andClasstempidNotBetween(Short value1, Short value2) {
            addCriterion("classtempid not between", value1, value2, "classtempid");
            return (Criteria) this;
        }

        public Criteria andNreclassIsNull() {
            addCriterion("nreclass is null");
            return (Criteria) this;
        }

        public Criteria andNreclassIsNotNull() {
            addCriterion("nreclass is not null");
            return (Criteria) this;
        }

        public Criteria andNreclassEqualTo(Boolean value) {
            addCriterion("nreclass =", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassNotEqualTo(Boolean value) {
            addCriterion("nreclass <>", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassGreaterThan(Boolean value) {
            addCriterion("nreclass >", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nreclass >=", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassLessThan(Boolean value) {
            addCriterion("nreclass <", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassLessThanOrEqualTo(Boolean value) {
            addCriterion("nreclass <=", value, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassIn(List<Boolean> values) {
            addCriterion("nreclass in", values, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassNotIn(List<Boolean> values) {
            addCriterion("nreclass not in", values, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassBetween(Boolean value1, Boolean value2) {
            addCriterion("nreclass between", value1, value2, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreclassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nreclass not between", value1, value2, "nreclass");
            return (Criteria) this;
        }

        public Criteria andNreinfoIsNull() {
            addCriterion("nreinfo is null");
            return (Criteria) this;
        }

        public Criteria andNreinfoIsNotNull() {
            addCriterion("nreinfo is not null");
            return (Criteria) this;
        }

        public Criteria andNreinfoEqualTo(Boolean value) {
            addCriterion("nreinfo =", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoNotEqualTo(Boolean value) {
            addCriterion("nreinfo <>", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoGreaterThan(Boolean value) {
            addCriterion("nreinfo >", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nreinfo >=", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoLessThan(Boolean value) {
            addCriterion("nreinfo <", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoLessThanOrEqualTo(Boolean value) {
            addCriterion("nreinfo <=", value, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoIn(List<Boolean> values) {
            addCriterion("nreinfo in", values, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoNotIn(List<Boolean> values) {
            addCriterion("nreinfo not in", values, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoBetween(Boolean value1, Boolean value2) {
            addCriterion("nreinfo between", value1, value2, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNreinfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nreinfo not between", value1, value2, "nreinfo");
            return (Criteria) this;
        }

        public Criteria andNrejsIsNull() {
            addCriterion("nrejs is null");
            return (Criteria) this;
        }

        public Criteria andNrejsIsNotNull() {
            addCriterion("nrejs is not null");
            return (Criteria) this;
        }

        public Criteria andNrejsEqualTo(Boolean value) {
            addCriterion("nrejs =", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsNotEqualTo(Boolean value) {
            addCriterion("nrejs <>", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsGreaterThan(Boolean value) {
            addCriterion("nrejs >", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nrejs >=", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsLessThan(Boolean value) {
            addCriterion("nrejs <", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsLessThanOrEqualTo(Boolean value) {
            addCriterion("nrejs <=", value, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsIn(List<Boolean> values) {
            addCriterion("nrejs in", values, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsNotIn(List<Boolean> values) {
            addCriterion("nrejs not in", values, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsBetween(Boolean value1, Boolean value2) {
            addCriterion("nrejs between", value1, value2, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNrejsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nrejs not between", value1, value2, "nrejs");
            return (Criteria) this;
        }

        public Criteria andNottobqIsNull() {
            addCriterion("nottobq is null");
            return (Criteria) this;
        }

        public Criteria andNottobqIsNotNull() {
            addCriterion("nottobq is not null");
            return (Criteria) this;
        }

        public Criteria andNottobqEqualTo(Boolean value) {
            addCriterion("nottobq =", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqNotEqualTo(Boolean value) {
            addCriterion("nottobq <>", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqGreaterThan(Boolean value) {
            addCriterion("nottobq >", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nottobq >=", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqLessThan(Boolean value) {
            addCriterion("nottobq <", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqLessThanOrEqualTo(Boolean value) {
            addCriterion("nottobq <=", value, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqIn(List<Boolean> values) {
            addCriterion("nottobq in", values, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqNotIn(List<Boolean> values) {
            addCriterion("nottobq not in", values, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqBetween(Boolean value1, Boolean value2) {
            addCriterion("nottobq between", value1, value2, "nottobq");
            return (Criteria) this;
        }

        public Criteria andNottobqNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nottobq not between", value1, value2, "nottobq");
            return (Criteria) this;
        }

        public Criteria andIpathIsNull() {
            addCriterion("ipath is null");
            return (Criteria) this;
        }

        public Criteria andIpathIsNotNull() {
            addCriterion("ipath is not null");
            return (Criteria) this;
        }

        public Criteria andIpathEqualTo(String value) {
            addCriterion("ipath =", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathNotEqualTo(String value) {
            addCriterion("ipath <>", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathGreaterThan(String value) {
            addCriterion("ipath >", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathGreaterThanOrEqualTo(String value) {
            addCriterion("ipath >=", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathLessThan(String value) {
            addCriterion("ipath <", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathLessThanOrEqualTo(String value) {
            addCriterion("ipath <=", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathLike(String value) {
            addCriterion("ipath like", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathNotLike(String value) {
            addCriterion("ipath not like", value, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathIn(List<String> values) {
            addCriterion("ipath in", values, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathNotIn(List<String> values) {
            addCriterion("ipath not in", values, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathBetween(String value1, String value2) {
            addCriterion("ipath between", value1, value2, "ipath");
            return (Criteria) this;
        }

        public Criteria andIpathNotBetween(String value1, String value2) {
            addCriterion("ipath not between", value1, value2, "ipath");
            return (Criteria) this;
        }

        public Criteria andAddreinfoIsNull() {
            addCriterion("addreinfo is null");
            return (Criteria) this;
        }

        public Criteria andAddreinfoIsNotNull() {
            addCriterion("addreinfo is not null");
            return (Criteria) this;
        }

        public Criteria andAddreinfoEqualTo(Boolean value) {
            addCriterion("addreinfo =", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoNotEqualTo(Boolean value) {
            addCriterion("addreinfo <>", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoGreaterThan(Boolean value) {
            addCriterion("addreinfo >", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("addreinfo >=", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoLessThan(Boolean value) {
            addCriterion("addreinfo <", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoLessThanOrEqualTo(Boolean value) {
            addCriterion("addreinfo <=", value, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoIn(List<Boolean> values) {
            addCriterion("addreinfo in", values, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoNotIn(List<Boolean> values) {
            addCriterion("addreinfo not in", values, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoBetween(Boolean value1, Boolean value2) {
            addCriterion("addreinfo between", value1, value2, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andAddreinfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("addreinfo not between", value1, value2, "addreinfo");
            return (Criteria) this;
        }

        public Criteria andHaddlistIsNull() {
            addCriterion("haddlist is null");
            return (Criteria) this;
        }

        public Criteria andHaddlistIsNotNull() {
            addCriterion("haddlist is not null");
            return (Criteria) this;
        }

        public Criteria andHaddlistEqualTo(Byte value) {
            addCriterion("haddlist =", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistNotEqualTo(Byte value) {
            addCriterion("haddlist <>", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistGreaterThan(Byte value) {
            addCriterion("haddlist >", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistGreaterThanOrEqualTo(Byte value) {
            addCriterion("haddlist >=", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistLessThan(Byte value) {
            addCriterion("haddlist <", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistLessThanOrEqualTo(Byte value) {
            addCriterion("haddlist <=", value, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistIn(List<Byte> values) {
            addCriterion("haddlist in", values, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistNotIn(List<Byte> values) {
            addCriterion("haddlist not in", values, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistBetween(Byte value1, Byte value2) {
            addCriterion("haddlist between", value1, value2, "haddlist");
            return (Criteria) this;
        }

        public Criteria andHaddlistNotBetween(Byte value1, Byte value2) {
            addCriterion("haddlist not between", value1, value2, "haddlist");
            return (Criteria) this;
        }

        public Criteria andSametitleIsNull() {
            addCriterion("sametitle is null");
            return (Criteria) this;
        }

        public Criteria andSametitleIsNotNull() {
            addCriterion("sametitle is not null");
            return (Criteria) this;
        }

        public Criteria andSametitleEqualTo(Boolean value) {
            addCriterion("sametitle =", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleNotEqualTo(Boolean value) {
            addCriterion("sametitle <>", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleGreaterThan(Boolean value) {
            addCriterion("sametitle >", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sametitle >=", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleLessThan(Boolean value) {
            addCriterion("sametitle <", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleLessThanOrEqualTo(Boolean value) {
            addCriterion("sametitle <=", value, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleIn(List<Boolean> values) {
            addCriterion("sametitle in", values, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleNotIn(List<Boolean> values) {
            addCriterion("sametitle not in", values, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleBetween(Boolean value1, Boolean value2) {
            addCriterion("sametitle between", value1, value2, "sametitle");
            return (Criteria) this;
        }

        public Criteria andSametitleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sametitle not between", value1, value2, "sametitle");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidIsNull() {
            addCriterion("definfovoteid is null");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidIsNotNull() {
            addCriterion("definfovoteid is not null");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidEqualTo(Short value) {
            addCriterion("definfovoteid =", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidNotEqualTo(Short value) {
            addCriterion("definfovoteid <>", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidGreaterThan(Short value) {
            addCriterion("definfovoteid >", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidGreaterThanOrEqualTo(Short value) {
            addCriterion("definfovoteid >=", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidLessThan(Short value) {
            addCriterion("definfovoteid <", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidLessThanOrEqualTo(Short value) {
            addCriterion("definfovoteid <=", value, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidIn(List<Short> values) {
            addCriterion("definfovoteid in", values, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidNotIn(List<Short> values) {
            addCriterion("definfovoteid not in", values, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidBetween(Short value1, Short value2) {
            addCriterion("definfovoteid between", value1, value2, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andDefinfovoteidNotBetween(Short value1, Short value2) {
            addCriterion("definfovoteid not between", value1, value2, "definfovoteid");
            return (Criteria) this;
        }

        public Criteria andWburlIsNull() {
            addCriterion("wburl is null");
            return (Criteria) this;
        }

        public Criteria andWburlIsNotNull() {
            addCriterion("wburl is not null");
            return (Criteria) this;
        }

        public Criteria andWburlEqualTo(String value) {
            addCriterion("wburl =", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlNotEqualTo(String value) {
            addCriterion("wburl <>", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlGreaterThan(String value) {
            addCriterion("wburl >", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlGreaterThanOrEqualTo(String value) {
            addCriterion("wburl >=", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlLessThan(String value) {
            addCriterion("wburl <", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlLessThanOrEqualTo(String value) {
            addCriterion("wburl <=", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlLike(String value) {
            addCriterion("wburl like", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlNotLike(String value) {
            addCriterion("wburl not like", value, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlIn(List<String> values) {
            addCriterion("wburl in", values, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlNotIn(List<String> values) {
            addCriterion("wburl not in", values, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlBetween(String value1, String value2) {
            addCriterion("wburl between", value1, value2, "wburl");
            return (Criteria) this;
        }

        public Criteria andWburlNotBetween(String value1, String value2) {
            addCriterion("wburl not between", value1, value2, "wburl");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedIsNull() {
            addCriterion("qeditchecked is null");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedIsNotNull() {
            addCriterion("qeditchecked is not null");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedEqualTo(Boolean value) {
            addCriterion("qeditchecked =", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedNotEqualTo(Boolean value) {
            addCriterion("qeditchecked <>", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedGreaterThan(Boolean value) {
            addCriterion("qeditchecked >", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qeditchecked >=", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedLessThan(Boolean value) {
            addCriterion("qeditchecked <", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("qeditchecked <=", value, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedIn(List<Boolean> values) {
            addCriterion("qeditchecked in", values, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedNotIn(List<Boolean> values) {
            addCriterion("qeditchecked not in", values, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("qeditchecked between", value1, value2, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andQeditcheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qeditchecked not between", value1, value2, "qeditchecked");
            return (Criteria) this;
        }

        public Criteria andWapstyleidIsNull() {
            addCriterion("wapstyleid is null");
            return (Criteria) this;
        }

        public Criteria andWapstyleidIsNotNull() {
            addCriterion("wapstyleid is not null");
            return (Criteria) this;
        }

        public Criteria andWapstyleidEqualTo(Short value) {
            addCriterion("wapstyleid =", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidNotEqualTo(Short value) {
            addCriterion("wapstyleid <>", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidGreaterThan(Short value) {
            addCriterion("wapstyleid >", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidGreaterThanOrEqualTo(Short value) {
            addCriterion("wapstyleid >=", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidLessThan(Short value) {
            addCriterion("wapstyleid <", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidLessThanOrEqualTo(Short value) {
            addCriterion("wapstyleid <=", value, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidIn(List<Short> values) {
            addCriterion("wapstyleid in", values, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidNotIn(List<Short> values) {
            addCriterion("wapstyleid not in", values, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidBetween(Short value1, Short value2) {
            addCriterion("wapstyleid between", value1, value2, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andWapstyleidNotBetween(Short value1, Short value2) {
            addCriterion("wapstyleid not between", value1, value2, "wapstyleid");
            return (Criteria) this;
        }

        public Criteria andRepreinfoIsNull() {
            addCriterion("repreinfo is null");
            return (Criteria) this;
        }

        public Criteria andRepreinfoIsNotNull() {
            addCriterion("repreinfo is not null");
            return (Criteria) this;
        }

        public Criteria andRepreinfoEqualTo(Boolean value) {
            addCriterion("repreinfo =", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoNotEqualTo(Boolean value) {
            addCriterion("repreinfo <>", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoGreaterThan(Boolean value) {
            addCriterion("repreinfo >", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("repreinfo >=", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoLessThan(Boolean value) {
            addCriterion("repreinfo <", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoLessThanOrEqualTo(Boolean value) {
            addCriterion("repreinfo <=", value, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoIn(List<Boolean> values) {
            addCriterion("repreinfo in", values, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoNotIn(List<Boolean> values) {
            addCriterion("repreinfo not in", values, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoBetween(Boolean value1, Boolean value2) {
            addCriterion("repreinfo between", value1, value2, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andRepreinfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("repreinfo not between", value1, value2, "repreinfo");
            return (Criteria) this;
        }

        public Criteria andPltempidIsNull() {
            addCriterion("pltempid is null");
            return (Criteria) this;
        }

        public Criteria andPltempidIsNotNull() {
            addCriterion("pltempid is not null");
            return (Criteria) this;
        }

        public Criteria andPltempidEqualTo(Short value) {
            addCriterion("pltempid =", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidNotEqualTo(Short value) {
            addCriterion("pltempid <>", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidGreaterThan(Short value) {
            addCriterion("pltempid >", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidGreaterThanOrEqualTo(Short value) {
            addCriterion("pltempid >=", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidLessThan(Short value) {
            addCriterion("pltempid <", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidLessThanOrEqualTo(Short value) {
            addCriterion("pltempid <=", value, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidIn(List<Short> values) {
            addCriterion("pltempid in", values, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidNotIn(List<Short> values) {
            addCriterion("pltempid not in", values, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidBetween(Short value1, Short value2) {
            addCriterion("pltempid between", value1, value2, "pltempid");
            return (Criteria) this;
        }

        public Criteria andPltempidNotBetween(Short value1, Short value2) {
            addCriterion("pltempid not between", value1, value2, "pltempid");
            return (Criteria) this;
        }

        public Criteria andYhidIsNull() {
            addCriterion("yhid is null");
            return (Criteria) this;
        }

        public Criteria andYhidIsNotNull() {
            addCriterion("yhid is not null");
            return (Criteria) this;
        }

        public Criteria andYhidEqualTo(Short value) {
            addCriterion("yhid =", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotEqualTo(Short value) {
            addCriterion("yhid <>", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThan(Short value) {
            addCriterion("yhid >", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThanOrEqualTo(Short value) {
            addCriterion("yhid >=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThan(Short value) {
            addCriterion("yhid <", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThanOrEqualTo(Short value) {
            addCriterion("yhid <=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidIn(List<Short> values) {
            addCriterion("yhid in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotIn(List<Short> values) {
            addCriterion("yhid not in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidBetween(Short value1, Short value2) {
            addCriterion("yhid between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotBetween(Short value1, Short value2) {
            addCriterion("yhid not between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andWfidIsNull() {
            addCriterion("wfid is null");
            return (Criteria) this;
        }

        public Criteria andWfidIsNotNull() {
            addCriterion("wfid is not null");
            return (Criteria) this;
        }

        public Criteria andWfidEqualTo(Short value) {
            addCriterion("wfid =", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidNotEqualTo(Short value) {
            addCriterion("wfid <>", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidGreaterThan(Short value) {
            addCriterion("wfid >", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidGreaterThanOrEqualTo(Short value) {
            addCriterion("wfid >=", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidLessThan(Short value) {
            addCriterion("wfid <", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidLessThanOrEqualTo(Short value) {
            addCriterion("wfid <=", value, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidIn(List<Short> values) {
            addCriterion("wfid in", values, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidNotIn(List<Short> values) {
            addCriterion("wfid not in", values, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidBetween(Short value1, Short value2) {
            addCriterion("wfid between", value1, value2, "wfid");
            return (Criteria) this;
        }

        public Criteria andWfidNotBetween(Short value1, Short value2) {
            addCriterion("wfid not between", value1, value2, "wfid");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoIsNull() {
            addCriterion("cgtoinfo is null");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoIsNotNull() {
            addCriterion("cgtoinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoEqualTo(Boolean value) {
            addCriterion("cgtoinfo =", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoNotEqualTo(Boolean value) {
            addCriterion("cgtoinfo <>", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoGreaterThan(Boolean value) {
            addCriterion("cgtoinfo >", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cgtoinfo >=", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoLessThan(Boolean value) {
            addCriterion("cgtoinfo <", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoLessThanOrEqualTo(Boolean value) {
            addCriterion("cgtoinfo <=", value, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoIn(List<Boolean> values) {
            addCriterion("cgtoinfo in", values, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoNotIn(List<Boolean> values) {
            addCriterion("cgtoinfo not in", values, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoBetween(Boolean value1, Boolean value2) {
            addCriterion("cgtoinfo between", value1, value2, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andCgtoinfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cgtoinfo not between", value1, value2, "cgtoinfo");
            return (Criteria) this;
        }

        public Criteria andBdinfoidIsNull() {
            addCriterion("bdinfoid is null");
            return (Criteria) this;
        }

        public Criteria andBdinfoidIsNotNull() {
            addCriterion("bdinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andBdinfoidEqualTo(String value) {
            addCriterion("bdinfoid =", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidNotEqualTo(String value) {
            addCriterion("bdinfoid <>", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidGreaterThan(String value) {
            addCriterion("bdinfoid >", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("bdinfoid >=", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidLessThan(String value) {
            addCriterion("bdinfoid <", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidLessThanOrEqualTo(String value) {
            addCriterion("bdinfoid <=", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidLike(String value) {
            addCriterion("bdinfoid like", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidNotLike(String value) {
            addCriterion("bdinfoid not like", value, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidIn(List<String> values) {
            addCriterion("bdinfoid in", values, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidNotIn(List<String> values) {
            addCriterion("bdinfoid not in", values, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidBetween(String value1, String value2) {
            addCriterion("bdinfoid between", value1, value2, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andBdinfoidNotBetween(String value1, String value2) {
            addCriterion("bdinfoid not between", value1, value2, "bdinfoid");
            return (Criteria) this;
        }

        public Criteria andRepagenumIsNull() {
            addCriterion("repagenum is null");
            return (Criteria) this;
        }

        public Criteria andRepagenumIsNotNull() {
            addCriterion("repagenum is not null");
            return (Criteria) this;
        }

        public Criteria andRepagenumEqualTo(Short value) {
            addCriterion("repagenum =", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumNotEqualTo(Short value) {
            addCriterion("repagenum <>", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumGreaterThan(Short value) {
            addCriterion("repagenum >", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumGreaterThanOrEqualTo(Short value) {
            addCriterion("repagenum >=", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumLessThan(Short value) {
            addCriterion("repagenum <", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumLessThanOrEqualTo(Short value) {
            addCriterion("repagenum <=", value, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumIn(List<Short> values) {
            addCriterion("repagenum in", values, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumNotIn(List<Short> values) {
            addCriterion("repagenum not in", values, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumBetween(Short value1, Short value2) {
            addCriterion("repagenum between", value1, value2, "repagenum");
            return (Criteria) this;
        }

        public Criteria andRepagenumNotBetween(Short value1, Short value2) {
            addCriterion("repagenum not between", value1, value2, "repagenum");
            return (Criteria) this;
        }

        public Criteria andKeycidIsNull() {
            addCriterion("keycid is null");
            return (Criteria) this;
        }

        public Criteria andKeycidIsNotNull() {
            addCriterion("keycid is not null");
            return (Criteria) this;
        }

        public Criteria andKeycidEqualTo(Short value) {
            addCriterion("keycid =", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidNotEqualTo(Short value) {
            addCriterion("keycid <>", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidGreaterThan(Short value) {
            addCriterion("keycid >", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidGreaterThanOrEqualTo(Short value) {
            addCriterion("keycid >=", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidLessThan(Short value) {
            addCriterion("keycid <", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidLessThanOrEqualTo(Short value) {
            addCriterion("keycid <=", value, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidIn(List<Short> values) {
            addCriterion("keycid in", values, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidNotIn(List<Short> values) {
            addCriterion("keycid not in", values, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidBetween(Short value1, Short value2) {
            addCriterion("keycid between", value1, value2, "keycid");
            return (Criteria) this;
        }

        public Criteria andKeycidNotBetween(Short value1, Short value2) {
            addCriterion("keycid not between", value1, value2, "keycid");
            return (Criteria) this;
        }

        public Criteria andAllinfosIsNull() {
            addCriterion("allinfos is null");
            return (Criteria) this;
        }

        public Criteria andAllinfosIsNotNull() {
            addCriterion("allinfos is not null");
            return (Criteria) this;
        }

        public Criteria andAllinfosEqualTo(Integer value) {
            addCriterion("allinfos =", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosNotEqualTo(Integer value) {
            addCriterion("allinfos <>", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosGreaterThan(Integer value) {
            addCriterion("allinfos >", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosGreaterThanOrEqualTo(Integer value) {
            addCriterion("allinfos >=", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosLessThan(Integer value) {
            addCriterion("allinfos <", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosLessThanOrEqualTo(Integer value) {
            addCriterion("allinfos <=", value, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosIn(List<Integer> values) {
            addCriterion("allinfos in", values, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosNotIn(List<Integer> values) {
            addCriterion("allinfos not in", values, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosBetween(Integer value1, Integer value2) {
            addCriterion("allinfos between", value1, value2, "allinfos");
            return (Criteria) this;
        }

        public Criteria andAllinfosNotBetween(Integer value1, Integer value2) {
            addCriterion("allinfos not between", value1, value2, "allinfos");
            return (Criteria) this;
        }

        public Criteria andInfosIsNull() {
            addCriterion("infos is null");
            return (Criteria) this;
        }

        public Criteria andInfosIsNotNull() {
            addCriterion("infos is not null");
            return (Criteria) this;
        }

        public Criteria andInfosEqualTo(Integer value) {
            addCriterion("infos =", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotEqualTo(Integer value) {
            addCriterion("infos <>", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThan(Integer value) {
            addCriterion("infos >", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThanOrEqualTo(Integer value) {
            addCriterion("infos >=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThan(Integer value) {
            addCriterion("infos <", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThanOrEqualTo(Integer value) {
            addCriterion("infos <=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosIn(List<Integer> values) {
            addCriterion("infos in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotIn(List<Integer> values) {
            addCriterion("infos not in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosBetween(Integer value1, Integer value2) {
            addCriterion("infos between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotBetween(Integer value1, Integer value2) {
            addCriterion("infos not between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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