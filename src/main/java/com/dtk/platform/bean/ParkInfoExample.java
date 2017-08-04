package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkInfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNull() {
            addCriterion("Park_Name is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("Park_Name is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("Park_Name =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("Park_Name <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("Park_Name >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("Park_Name >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("Park_Name <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("Park_Name <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("Park_Name like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("Park_Name not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("Park_Name in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("Park_Name not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("Park_Name between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("Park_Name not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkSnIsNull() {
            addCriterion("Park_Sn is null");
            return (Criteria) this;
        }

        public Criteria andParkSnIsNotNull() {
            addCriterion("Park_Sn is not null");
            return (Criteria) this;
        }

        public Criteria andParkSnEqualTo(String value) {
            addCriterion("Park_Sn =", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnNotEqualTo(String value) {
            addCriterion("Park_Sn <>", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnGreaterThan(String value) {
            addCriterion("Park_Sn >", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnGreaterThanOrEqualTo(String value) {
            addCriterion("Park_Sn >=", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnLessThan(String value) {
            addCriterion("Park_Sn <", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnLessThanOrEqualTo(String value) {
            addCriterion("Park_Sn <=", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnLike(String value) {
            addCriterion("Park_Sn like", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnNotLike(String value) {
            addCriterion("Park_Sn not like", value, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnIn(List<String> values) {
            addCriterion("Park_Sn in", values, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnNotIn(List<String> values) {
            addCriterion("Park_Sn not in", values, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnBetween(String value1, String value2) {
            addCriterion("Park_Sn between", value1, value2, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkSnNotBetween(String value1, String value2) {
            addCriterion("Park_Sn not between", value1, value2, "parkSn");
            return (Criteria) this;
        }

        public Criteria andParkaddressIsNull() {
            addCriterion("ParkAddress is null");
            return (Criteria) this;
        }

        public Criteria andParkaddressIsNotNull() {
            addCriterion("ParkAddress is not null");
            return (Criteria) this;
        }

        public Criteria andParkaddressEqualTo(String value) {
            addCriterion("ParkAddress =", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressNotEqualTo(String value) {
            addCriterion("ParkAddress <>", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressGreaterThan(String value) {
            addCriterion("ParkAddress >", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ParkAddress >=", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressLessThan(String value) {
            addCriterion("ParkAddress <", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressLessThanOrEqualTo(String value) {
            addCriterion("ParkAddress <=", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressLike(String value) {
            addCriterion("ParkAddress like", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressNotLike(String value) {
            addCriterion("ParkAddress not like", value, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressIn(List<String> values) {
            addCriterion("ParkAddress in", values, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressNotIn(List<String> values) {
            addCriterion("ParkAddress not in", values, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressBetween(String value1, String value2) {
            addCriterion("ParkAddress between", value1, value2, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkaddressNotBetween(String value1, String value2) {
            addCriterion("ParkAddress not between", value1, value2, "parkaddress");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesIsNull() {
            addCriterion("Park_TotalSpaces is null");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesIsNotNull() {
            addCriterion("Park_TotalSpaces is not null");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesEqualTo(Integer value) {
            addCriterion("Park_TotalSpaces =", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesNotEqualTo(Integer value) {
            addCriterion("Park_TotalSpaces <>", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesGreaterThan(Integer value) {
            addCriterion("Park_TotalSpaces >", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Park_TotalSpaces >=", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesLessThan(Integer value) {
            addCriterion("Park_TotalSpaces <", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesLessThanOrEqualTo(Integer value) {
            addCriterion("Park_TotalSpaces <=", value, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesIn(List<Integer> values) {
            addCriterion("Park_TotalSpaces in", values, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesNotIn(List<Integer> values) {
            addCriterion("Park_TotalSpaces not in", values, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesBetween(Integer value1, Integer value2) {
            addCriterion("Park_TotalSpaces between", value1, value2, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkTotalspacesNotBetween(Integer value1, Integer value2) {
            addCriterion("Park_TotalSpaces not between", value1, value2, "parkTotalspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesIsNull() {
            addCriterion("Park_RemainSpaces is null");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesIsNotNull() {
            addCriterion("Park_RemainSpaces is not null");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesEqualTo(Integer value) {
            addCriterion("Park_RemainSpaces =", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesNotEqualTo(Integer value) {
            addCriterion("Park_RemainSpaces <>", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesGreaterThan(Integer value) {
            addCriterion("Park_RemainSpaces >", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Park_RemainSpaces >=", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesLessThan(Integer value) {
            addCriterion("Park_RemainSpaces <", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesLessThanOrEqualTo(Integer value) {
            addCriterion("Park_RemainSpaces <=", value, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesIn(List<Integer> values) {
            addCriterion("Park_RemainSpaces in", values, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesNotIn(List<Integer> values) {
            addCriterion("Park_RemainSpaces not in", values, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesBetween(Integer value1, Integer value2) {
            addCriterion("Park_RemainSpaces between", value1, value2, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andParkRemainspacesNotBetween(Integer value1, Integer value2) {
            addCriterion("Park_RemainSpaces not between", value1, value2, "parkRemainspaces");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("Descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("Descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("Descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("Descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("Descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("Descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("Descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("Descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("Descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("Descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("Descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("Descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("Descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("Descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("Operate_Time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("Operate_Time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("Operate_Time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("Operate_Time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("Operate_Time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Operate_Time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("Operate_Time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Operate_Time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("Operate_Time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("Operate_Time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("Operate_Time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Operate_Time not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andKeepFieldIsNull() {
            addCriterion("Keep_Field is null");
            return (Criteria) this;
        }

        public Criteria andKeepFieldIsNotNull() {
            addCriterion("Keep_Field is not null");
            return (Criteria) this;
        }

        public Criteria andKeepFieldEqualTo(String value) {
            addCriterion("Keep_Field =", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldNotEqualTo(String value) {
            addCriterion("Keep_Field <>", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldGreaterThan(String value) {
            addCriterion("Keep_Field >", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldGreaterThanOrEqualTo(String value) {
            addCriterion("Keep_Field >=", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldLessThan(String value) {
            addCriterion("Keep_Field <", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldLessThanOrEqualTo(String value) {
            addCriterion("Keep_Field <=", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldLike(String value) {
            addCriterion("Keep_Field like", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldNotLike(String value) {
            addCriterion("Keep_Field not like", value, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldIn(List<String> values) {
            addCriterion("Keep_Field in", values, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldNotIn(List<String> values) {
            addCriterion("Keep_Field not in", values, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldBetween(String value1, String value2) {
            addCriterion("Keep_Field between", value1, value2, "keepField");
            return (Criteria) this;
        }

        public Criteria andKeepFieldNotBetween(String value1, String value2) {
            addCriterion("Keep_Field not between", value1, value2, "keepField");
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