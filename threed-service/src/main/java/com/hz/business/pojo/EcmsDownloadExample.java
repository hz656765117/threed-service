package com.hz.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class EcmsDownloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcmsDownloadExample() {
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

        public Criteria andTtidIsNull() {
            addCriterion("ttid is null");
            return (Criteria) this;
        }

        public Criteria andTtidIsNotNull() {
            addCriterion("ttid is not null");
            return (Criteria) this;
        }

        public Criteria andTtidEqualTo(Short value) {
            addCriterion("ttid =", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotEqualTo(Short value) {
            addCriterion("ttid <>", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThan(Short value) {
            addCriterion("ttid >", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThanOrEqualTo(Short value) {
            addCriterion("ttid >=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThan(Short value) {
            addCriterion("ttid <", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThanOrEqualTo(Short value) {
            addCriterion("ttid <=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidIn(List<Short> values) {
            addCriterion("ttid in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotIn(List<Short> values) {
            addCriterion("ttid not in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidBetween(Short value1, Short value2) {
            addCriterion("ttid between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotBetween(Short value1, Short value2) {
            addCriterion("ttid not between", value1, value2, "ttid");
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

        public Criteria andPlnumIsNull() {
            addCriterion("plnum is null");
            return (Criteria) this;
        }

        public Criteria andPlnumIsNotNull() {
            addCriterion("plnum is not null");
            return (Criteria) this;
        }

        public Criteria andPlnumEqualTo(Integer value) {
            addCriterion("plnum =", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumNotEqualTo(Integer value) {
            addCriterion("plnum <>", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumGreaterThan(Integer value) {
            addCriterion("plnum >", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("plnum >=", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumLessThan(Integer value) {
            addCriterion("plnum <", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumLessThanOrEqualTo(Integer value) {
            addCriterion("plnum <=", value, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumIn(List<Integer> values) {
            addCriterion("plnum in", values, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumNotIn(List<Integer> values) {
            addCriterion("plnum not in", values, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumBetween(Integer value1, Integer value2) {
            addCriterion("plnum between", value1, value2, "plnum");
            return (Criteria) this;
        }

        public Criteria andPlnumNotBetween(Integer value1, Integer value2) {
            addCriterion("plnum not between", value1, value2, "plnum");
            return (Criteria) this;
        }

        public Criteria andTotaldownIsNull() {
            addCriterion("totaldown is null");
            return (Criteria) this;
        }

        public Criteria andTotaldownIsNotNull() {
            addCriterion("totaldown is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldownEqualTo(Integer value) {
            addCriterion("totaldown =", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownNotEqualTo(Integer value) {
            addCriterion("totaldown <>", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownGreaterThan(Integer value) {
            addCriterion("totaldown >", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownGreaterThanOrEqualTo(Integer value) {
            addCriterion("totaldown >=", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownLessThan(Integer value) {
            addCriterion("totaldown <", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownLessThanOrEqualTo(Integer value) {
            addCriterion("totaldown <=", value, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownIn(List<Integer> values) {
            addCriterion("totaldown in", values, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownNotIn(List<Integer> values) {
            addCriterion("totaldown not in", values, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownBetween(Integer value1, Integer value2) {
            addCriterion("totaldown between", value1, value2, "totaldown");
            return (Criteria) this;
        }

        public Criteria andTotaldownNotBetween(Integer value1, Integer value2) {
            addCriterion("totaldown not between", value1, value2, "totaldown");
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

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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

        public Criteria andFirsttitleIsNull() {
            addCriterion("firsttitle is null");
            return (Criteria) this;
        }

        public Criteria andFirsttitleIsNotNull() {
            addCriterion("firsttitle is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttitleEqualTo(Boolean value) {
            addCriterion("firsttitle =", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleNotEqualTo(Boolean value) {
            addCriterion("firsttitle <>", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleGreaterThan(Boolean value) {
            addCriterion("firsttitle >", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("firsttitle >=", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleLessThan(Boolean value) {
            addCriterion("firsttitle <", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleLessThanOrEqualTo(Boolean value) {
            addCriterion("firsttitle <=", value, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleIn(List<Boolean> values) {
            addCriterion("firsttitle in", values, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleNotIn(List<Boolean> values) {
            addCriterion("firsttitle not in", values, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleBetween(Boolean value1, Boolean value2) {
            addCriterion("firsttitle between", value1, value2, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andFirsttitleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("firsttitle not between", value1, value2, "firsttitle");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNull() {
            addCriterion("isgood is null");
            return (Criteria) this;
        }

        public Criteria andIsgoodIsNotNull() {
            addCriterion("isgood is not null");
            return (Criteria) this;
        }

        public Criteria andIsgoodEqualTo(Boolean value) {
            addCriterion("isgood =", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotEqualTo(Boolean value) {
            addCriterion("isgood <>", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThan(Boolean value) {
            addCriterion("isgood >", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isgood >=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThan(Boolean value) {
            addCriterion("isgood <", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodLessThanOrEqualTo(Boolean value) {
            addCriterion("isgood <=", value, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodIn(List<Boolean> values) {
            addCriterion("isgood in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotIn(List<Boolean> values) {
            addCriterion("isgood not in", values, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodBetween(Boolean value1, Boolean value2) {
            addCriterion("isgood between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andIsgoodNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isgood not between", value1, value2, "isgood");
            return (Criteria) this;
        }

        public Criteria andIspicIsNull() {
            addCriterion("ispic is null");
            return (Criteria) this;
        }

        public Criteria andIspicIsNotNull() {
            addCriterion("ispic is not null");
            return (Criteria) this;
        }

        public Criteria andIspicEqualTo(Boolean value) {
            addCriterion("ispic =", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicNotEqualTo(Boolean value) {
            addCriterion("ispic <>", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicGreaterThan(Boolean value) {
            addCriterion("ispic >", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ispic >=", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicLessThan(Boolean value) {
            addCriterion("ispic <", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicLessThanOrEqualTo(Boolean value) {
            addCriterion("ispic <=", value, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicIn(List<Boolean> values) {
            addCriterion("ispic in", values, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicNotIn(List<Boolean> values) {
            addCriterion("ispic not in", values, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicBetween(Boolean value1, Boolean value2) {
            addCriterion("ispic between", value1, value2, "ispic");
            return (Criteria) this;
        }

        public Criteria andIspicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ispic not between", value1, value2, "ispic");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("istop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("istop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Boolean value) {
            addCriterion("istop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Boolean value) {
            addCriterion("istop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Boolean value) {
            addCriterion("istop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("istop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Boolean value) {
            addCriterion("istop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Boolean value) {
            addCriterion("istop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Boolean> values) {
            addCriterion("istop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Boolean> values) {
            addCriterion("istop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Boolean value1, Boolean value2) {
            addCriterion("istop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("istop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIsqfIsNull() {
            addCriterion("isqf is null");
            return (Criteria) this;
        }

        public Criteria andIsqfIsNotNull() {
            addCriterion("isqf is not null");
            return (Criteria) this;
        }

        public Criteria andIsqfEqualTo(Boolean value) {
            addCriterion("isqf =", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfNotEqualTo(Boolean value) {
            addCriterion("isqf <>", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfGreaterThan(Boolean value) {
            addCriterion("isqf >", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isqf >=", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfLessThan(Boolean value) {
            addCriterion("isqf <", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfLessThanOrEqualTo(Boolean value) {
            addCriterion("isqf <=", value, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfIn(List<Boolean> values) {
            addCriterion("isqf in", values, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfNotIn(List<Boolean> values) {
            addCriterion("isqf not in", values, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfBetween(Boolean value1, Boolean value2) {
            addCriterion("isqf between", value1, value2, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsqfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isqf not between", value1, value2, "isqf");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNull() {
            addCriterion("ismember is null");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNotNull() {
            addCriterion("ismember is not null");
            return (Criteria) this;
        }

        public Criteria andIsmemberEqualTo(Boolean value) {
            addCriterion("ismember =", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotEqualTo(Boolean value) {
            addCriterion("ismember <>", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThan(Boolean value) {
            addCriterion("ismember >", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ismember >=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThan(Boolean value) {
            addCriterion("ismember <", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThanOrEqualTo(Boolean value) {
            addCriterion("ismember <=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberIn(List<Boolean> values) {
            addCriterion("ismember in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotIn(List<Boolean> values) {
            addCriterion("ismember not in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberBetween(Boolean value1, Boolean value2) {
            addCriterion("ismember between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ismember not between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsurlIsNull() {
            addCriterion("isurl is null");
            return (Criteria) this;
        }

        public Criteria andIsurlIsNotNull() {
            addCriterion("isurl is not null");
            return (Criteria) this;
        }

        public Criteria andIsurlEqualTo(Boolean value) {
            addCriterion("isurl =", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlNotEqualTo(Boolean value) {
            addCriterion("isurl <>", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlGreaterThan(Boolean value) {
            addCriterion("isurl >", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isurl >=", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlLessThan(Boolean value) {
            addCriterion("isurl <", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlLessThanOrEqualTo(Boolean value) {
            addCriterion("isurl <=", value, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlIn(List<Boolean> values) {
            addCriterion("isurl in", values, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlNotIn(List<Boolean> values) {
            addCriterion("isurl not in", values, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlBetween(Boolean value1, Boolean value2) {
            addCriterion("isurl between", value1, value2, "isurl");
            return (Criteria) this;
        }

        public Criteria andIsurlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isurl not between", value1, value2, "isurl");
            return (Criteria) this;
        }

        public Criteria andTruetimeIsNull() {
            addCriterion("truetime is null");
            return (Criteria) this;
        }

        public Criteria andTruetimeIsNotNull() {
            addCriterion("truetime is not null");
            return (Criteria) this;
        }

        public Criteria andTruetimeEqualTo(Integer value) {
            addCriterion("truetime =", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeNotEqualTo(Integer value) {
            addCriterion("truetime <>", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeGreaterThan(Integer value) {
            addCriterion("truetime >", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("truetime >=", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeLessThan(Integer value) {
            addCriterion("truetime <", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeLessThanOrEqualTo(Integer value) {
            addCriterion("truetime <=", value, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeIn(List<Integer> values) {
            addCriterion("truetime in", values, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeNotIn(List<Integer> values) {
            addCriterion("truetime not in", values, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeBetween(Integer value1, Integer value2) {
            addCriterion("truetime between", value1, value2, "truetime");
            return (Criteria) this;
        }

        public Criteria andTruetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("truetime not between", value1, value2, "truetime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeIsNull() {
            addCriterion("lastdotime is null");
            return (Criteria) this;
        }

        public Criteria andLastdotimeIsNotNull() {
            addCriterion("lastdotime is not null");
            return (Criteria) this;
        }

        public Criteria andLastdotimeEqualTo(Integer value) {
            addCriterion("lastdotime =", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeNotEqualTo(Integer value) {
            addCriterion("lastdotime <>", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeGreaterThan(Integer value) {
            addCriterion("lastdotime >", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastdotime >=", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeLessThan(Integer value) {
            addCriterion("lastdotime <", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastdotime <=", value, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeIn(List<Integer> values) {
            addCriterion("lastdotime in", values, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeNotIn(List<Integer> values) {
            addCriterion("lastdotime not in", values, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeBetween(Integer value1, Integer value2) {
            addCriterion("lastdotime between", value1, value2, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andLastdotimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastdotime not between", value1, value2, "lastdotime");
            return (Criteria) this;
        }

        public Criteria andHavehtmlIsNull() {
            addCriterion("havehtml is null");
            return (Criteria) this;
        }

        public Criteria andHavehtmlIsNotNull() {
            addCriterion("havehtml is not null");
            return (Criteria) this;
        }

        public Criteria andHavehtmlEqualTo(Boolean value) {
            addCriterion("havehtml =", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlNotEqualTo(Boolean value) {
            addCriterion("havehtml <>", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlGreaterThan(Boolean value) {
            addCriterion("havehtml >", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("havehtml >=", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlLessThan(Boolean value) {
            addCriterion("havehtml <", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlLessThanOrEqualTo(Boolean value) {
            addCriterion("havehtml <=", value, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlIn(List<Boolean> values) {
            addCriterion("havehtml in", values, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlNotIn(List<Boolean> values) {
            addCriterion("havehtml not in", values, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlBetween(Boolean value1, Boolean value2) {
            addCriterion("havehtml between", value1, value2, "havehtml");
            return (Criteria) this;
        }

        public Criteria andHavehtmlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("havehtml not between", value1, value2, "havehtml");
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

        public Criteria andUserfenEqualTo(Short value) {
            addCriterion("userfen =", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotEqualTo(Short value) {
            addCriterion("userfen <>", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenGreaterThan(Short value) {
            addCriterion("userfen >", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenGreaterThanOrEqualTo(Short value) {
            addCriterion("userfen >=", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenLessThan(Short value) {
            addCriterion("userfen <", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenLessThanOrEqualTo(Short value) {
            addCriterion("userfen <=", value, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenIn(List<Short> values) {
            addCriterion("userfen in", values, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotIn(List<Short> values) {
            addCriterion("userfen not in", values, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenBetween(Short value1, Short value2) {
            addCriterion("userfen between", value1, value2, "userfen");
            return (Criteria) this;
        }

        public Criteria andUserfenNotBetween(Short value1, Short value2) {
            addCriterion("userfen not between", value1, value2, "userfen");
            return (Criteria) this;
        }

        public Criteria andTitlefontIsNull() {
            addCriterion("titlefont is null");
            return (Criteria) this;
        }

        public Criteria andTitlefontIsNotNull() {
            addCriterion("titlefont is not null");
            return (Criteria) this;
        }

        public Criteria andTitlefontEqualTo(String value) {
            addCriterion("titlefont =", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontNotEqualTo(String value) {
            addCriterion("titlefont <>", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontGreaterThan(String value) {
            addCriterion("titlefont >", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontGreaterThanOrEqualTo(String value) {
            addCriterion("titlefont >=", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontLessThan(String value) {
            addCriterion("titlefont <", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontLessThanOrEqualTo(String value) {
            addCriterion("titlefont <=", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontLike(String value) {
            addCriterion("titlefont like", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontNotLike(String value) {
            addCriterion("titlefont not like", value, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontIn(List<String> values) {
            addCriterion("titlefont in", values, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontNotIn(List<String> values) {
            addCriterion("titlefont not in", values, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontBetween(String value1, String value2) {
            addCriterion("titlefont between", value1, value2, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitlefontNotBetween(String value1, String value2) {
            addCriterion("titlefont not between", value1, value2, "titlefont");
            return (Criteria) this;
        }

        public Criteria andTitleurlIsNull() {
            addCriterion("titleurl is null");
            return (Criteria) this;
        }

        public Criteria andTitleurlIsNotNull() {
            addCriterion("titleurl is not null");
            return (Criteria) this;
        }

        public Criteria andTitleurlEqualTo(String value) {
            addCriterion("titleurl =", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlNotEqualTo(String value) {
            addCriterion("titleurl <>", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlGreaterThan(String value) {
            addCriterion("titleurl >", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlGreaterThanOrEqualTo(String value) {
            addCriterion("titleurl >=", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlLessThan(String value) {
            addCriterion("titleurl <", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlLessThanOrEqualTo(String value) {
            addCriterion("titleurl <=", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlLike(String value) {
            addCriterion("titleurl like", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlNotLike(String value) {
            addCriterion("titleurl not like", value, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlIn(List<String> values) {
            addCriterion("titleurl in", values, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlNotIn(List<String> values) {
            addCriterion("titleurl not in", values, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlBetween(String value1, String value2) {
            addCriterion("titleurl between", value1, value2, "titleurl");
            return (Criteria) this;
        }

        public Criteria andTitleurlNotBetween(String value1, String value2) {
            addCriterion("titleurl not between", value1, value2, "titleurl");
            return (Criteria) this;
        }

        public Criteria andStbIsNull() {
            addCriterion("stb is null");
            return (Criteria) this;
        }

        public Criteria andStbIsNotNull() {
            addCriterion("stb is not null");
            return (Criteria) this;
        }

        public Criteria andStbEqualTo(Byte value) {
            addCriterion("stb =", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbNotEqualTo(Byte value) {
            addCriterion("stb <>", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbGreaterThan(Byte value) {
            addCriterion("stb >", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbGreaterThanOrEqualTo(Byte value) {
            addCriterion("stb >=", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbLessThan(Byte value) {
            addCriterion("stb <", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbLessThanOrEqualTo(Byte value) {
            addCriterion("stb <=", value, "stb");
            return (Criteria) this;
        }

        public Criteria andStbIn(List<Byte> values) {
            addCriterion("stb in", values, "stb");
            return (Criteria) this;
        }

        public Criteria andStbNotIn(List<Byte> values) {
            addCriterion("stb not in", values, "stb");
            return (Criteria) this;
        }

        public Criteria andStbBetween(Byte value1, Byte value2) {
            addCriterion("stb between", value1, value2, "stb");
            return (Criteria) this;
        }

        public Criteria andStbNotBetween(Byte value1, Byte value2) {
            addCriterion("stb not between", value1, value2, "stb");
            return (Criteria) this;
        }

        public Criteria andFstbIsNull() {
            addCriterion("fstb is null");
            return (Criteria) this;
        }

        public Criteria andFstbIsNotNull() {
            addCriterion("fstb is not null");
            return (Criteria) this;
        }

        public Criteria andFstbEqualTo(Byte value) {
            addCriterion("fstb =", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbNotEqualTo(Byte value) {
            addCriterion("fstb <>", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbGreaterThan(Byte value) {
            addCriterion("fstb >", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbGreaterThanOrEqualTo(Byte value) {
            addCriterion("fstb >=", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbLessThan(Byte value) {
            addCriterion("fstb <", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbLessThanOrEqualTo(Byte value) {
            addCriterion("fstb <=", value, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbIn(List<Byte> values) {
            addCriterion("fstb in", values, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbNotIn(List<Byte> values) {
            addCriterion("fstb not in", values, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbBetween(Byte value1, Byte value2) {
            addCriterion("fstb between", value1, value2, "fstb");
            return (Criteria) this;
        }

        public Criteria andFstbNotBetween(Byte value1, Byte value2) {
            addCriterion("fstb not between", value1, value2, "fstb");
            return (Criteria) this;
        }

        public Criteria andRestbIsNull() {
            addCriterion("restb is null");
            return (Criteria) this;
        }

        public Criteria andRestbIsNotNull() {
            addCriterion("restb is not null");
            return (Criteria) this;
        }

        public Criteria andRestbEqualTo(Byte value) {
            addCriterion("restb =", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbNotEqualTo(Byte value) {
            addCriterion("restb <>", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbGreaterThan(Byte value) {
            addCriterion("restb >", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbGreaterThanOrEqualTo(Byte value) {
            addCriterion("restb >=", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbLessThan(Byte value) {
            addCriterion("restb <", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbLessThanOrEqualTo(Byte value) {
            addCriterion("restb <=", value, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbIn(List<Byte> values) {
            addCriterion("restb in", values, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbNotIn(List<Byte> values) {
            addCriterion("restb not in", values, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbBetween(Byte value1, Byte value2) {
            addCriterion("restb between", value1, value2, "restb");
            return (Criteria) this;
        }

        public Criteria andRestbNotBetween(Byte value1, Byte value2) {
            addCriterion("restb not between", value1, value2, "restb");
            return (Criteria) this;
        }

        public Criteria andKeyboardIsNull() {
            addCriterion("keyboard is null");
            return (Criteria) this;
        }

        public Criteria andKeyboardIsNotNull() {
            addCriterion("keyboard is not null");
            return (Criteria) this;
        }

        public Criteria andKeyboardEqualTo(String value) {
            addCriterion("keyboard =", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardNotEqualTo(String value) {
            addCriterion("keyboard <>", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardGreaterThan(String value) {
            addCriterion("keyboard >", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardGreaterThanOrEqualTo(String value) {
            addCriterion("keyboard >=", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardLessThan(String value) {
            addCriterion("keyboard <", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardLessThanOrEqualTo(String value) {
            addCriterion("keyboard <=", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardLike(String value) {
            addCriterion("keyboard like", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardNotLike(String value) {
            addCriterion("keyboard not like", value, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardIn(List<String> values) {
            addCriterion("keyboard in", values, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardNotIn(List<String> values) {
            addCriterion("keyboard not in", values, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardBetween(String value1, String value2) {
            addCriterion("keyboard between", value1, value2, "keyboard");
            return (Criteria) this;
        }

        public Criteria andKeyboardNotBetween(String value1, String value2) {
            addCriterion("keyboard not between", value1, value2, "keyboard");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("newstime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("newstime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(Integer value) {
            addCriterion("newstime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(Integer value) {
            addCriterion("newstime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(Integer value) {
            addCriterion("newstime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("newstime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(Integer value) {
            addCriterion("newstime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(Integer value) {
            addCriterion("newstime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<Integer> values) {
            addCriterion("newstime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<Integer> values) {
            addCriterion("newstime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(Integer value1, Integer value2) {
            addCriterion("newstime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("newstime not between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNull() {
            addCriterion("titlepic is null");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNotNull() {
            addCriterion("titlepic is not null");
            return (Criteria) this;
        }

        public Criteria andTitlepicEqualTo(String value) {
            addCriterion("titlepic =", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotEqualTo(String value) {
            addCriterion("titlepic <>", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThan(String value) {
            addCriterion("titlepic >", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThanOrEqualTo(String value) {
            addCriterion("titlepic >=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThan(String value) {
            addCriterion("titlepic <", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThanOrEqualTo(String value) {
            addCriterion("titlepic <=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLike(String value) {
            addCriterion("titlepic like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotLike(String value) {
            addCriterion("titlepic not like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicIn(List<String> values) {
            addCriterion("titlepic in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotIn(List<String> values) {
            addCriterion("titlepic not in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicBetween(String value1, String value2) {
            addCriterion("titlepic between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotBetween(String value1, String value2) {
            addCriterion("titlepic not between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andSoftfjIsNull() {
            addCriterion("softfj is null");
            return (Criteria) this;
        }

        public Criteria andSoftfjIsNotNull() {
            addCriterion("softfj is not null");
            return (Criteria) this;
        }

        public Criteria andSoftfjEqualTo(String value) {
            addCriterion("softfj =", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjNotEqualTo(String value) {
            addCriterion("softfj <>", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjGreaterThan(String value) {
            addCriterion("softfj >", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjGreaterThanOrEqualTo(String value) {
            addCriterion("softfj >=", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjLessThan(String value) {
            addCriterion("softfj <", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjLessThanOrEqualTo(String value) {
            addCriterion("softfj <=", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjLike(String value) {
            addCriterion("softfj like", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjNotLike(String value) {
            addCriterion("softfj not like", value, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjIn(List<String> values) {
            addCriterion("softfj in", values, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjNotIn(List<String> values) {
            addCriterion("softfj not in", values, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjBetween(String value1, String value2) {
            addCriterion("softfj between", value1, value2, "softfj");
            return (Criteria) this;
        }

        public Criteria andSoftfjNotBetween(String value1, String value2) {
            addCriterion("softfj not between", value1, value2, "softfj");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNull() {
            addCriterion("softtype is null");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNotNull() {
            addCriterion("softtype is not null");
            return (Criteria) this;
        }

        public Criteria andSofttypeEqualTo(String value) {
            addCriterion("softtype =", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotEqualTo(String value) {
            addCriterion("softtype <>", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThan(String value) {
            addCriterion("softtype >", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThanOrEqualTo(String value) {
            addCriterion("softtype >=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThan(String value) {
            addCriterion("softtype <", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThanOrEqualTo(String value) {
            addCriterion("softtype <=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLike(String value) {
            addCriterion("softtype like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotLike(String value) {
            addCriterion("softtype not like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeIn(List<String> values) {
            addCriterion("softtype in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotIn(List<String> values) {
            addCriterion("softtype not in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeBetween(String value1, String value2) {
            addCriterion("softtype between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotBetween(String value1, String value2) {
            addCriterion("softtype not between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSoftsqIsNull() {
            addCriterion("softsq is null");
            return (Criteria) this;
        }

        public Criteria andSoftsqIsNotNull() {
            addCriterion("softsq is not null");
            return (Criteria) this;
        }

        public Criteria andSoftsqEqualTo(String value) {
            addCriterion("softsq =", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqNotEqualTo(String value) {
            addCriterion("softsq <>", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqGreaterThan(String value) {
            addCriterion("softsq >", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqGreaterThanOrEqualTo(String value) {
            addCriterion("softsq >=", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqLessThan(String value) {
            addCriterion("softsq <", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqLessThanOrEqualTo(String value) {
            addCriterion("softsq <=", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqLike(String value) {
            addCriterion("softsq like", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqNotLike(String value) {
            addCriterion("softsq not like", value, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqIn(List<String> values) {
            addCriterion("softsq in", values, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqNotIn(List<String> values) {
            addCriterion("softsq not in", values, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqBetween(String value1, String value2) {
            addCriterion("softsq between", value1, value2, "softsq");
            return (Criteria) this;
        }

        public Criteria andSoftsqNotBetween(String value1, String value2) {
            addCriterion("softsq not between", value1, value2, "softsq");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Boolean value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Boolean value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Boolean value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Boolean value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Boolean value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Boolean value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Boolean> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Boolean> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Boolean value1, Boolean value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Boolean value1, Boolean value2) {
            addCriterion("star not between", value1, value2, "star");
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

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("filesize like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("filesize not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSonsortIsNull() {
            addCriterion("sonsort is null");
            return (Criteria) this;
        }

        public Criteria andSonsortIsNotNull() {
            addCriterion("sonsort is not null");
            return (Criteria) this;
        }

        public Criteria andSonsortEqualTo(Integer value) {
            addCriterion("sonsort =", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortNotEqualTo(Integer value) {
            addCriterion("sonsort <>", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortGreaterThan(Integer value) {
            addCriterion("sonsort >", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sonsort >=", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortLessThan(Integer value) {
            addCriterion("sonsort <", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortLessThanOrEqualTo(Integer value) {
            addCriterion("sonsort <=", value, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortIn(List<Integer> values) {
            addCriterion("sonsort in", values, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortNotIn(List<Integer> values) {
            addCriterion("sonsort not in", values, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortBetween(Integer value1, Integer value2) {
            addCriterion("sonsort between", value1, value2, "sonsort");
            return (Criteria) this;
        }

        public Criteria andSonsortNotBetween(Integer value1, Integer value2) {
            addCriterion("sonsort not between", value1, value2, "sonsort");
            return (Criteria) this;
        }

        public Criteria andJifenIsNull() {
            addCriterion("jifen is null");
            return (Criteria) this;
        }

        public Criteria andJifenIsNotNull() {
            addCriterion("jifen is not null");
            return (Criteria) this;
        }

        public Criteria andJifenEqualTo(String value) {
            addCriterion("jifen =", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotEqualTo(String value) {
            addCriterion("jifen <>", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThan(String value) {
            addCriterion("jifen >", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThanOrEqualTo(String value) {
            addCriterion("jifen >=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThan(String value) {
            addCriterion("jifen <", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThanOrEqualTo(String value) {
            addCriterion("jifen <=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLike(String value) {
            addCriterion("jifen like", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotLike(String value) {
            addCriterion("jifen not like", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenIn(List<String> values) {
            addCriterion("jifen in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotIn(List<String> values) {
            addCriterion("jifen not in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenBetween(String value1, String value2) {
            addCriterion("jifen between", value1, value2, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotBetween(String value1, String value2) {
            addCriterion("jifen not between", value1, value2, "jifen");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
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