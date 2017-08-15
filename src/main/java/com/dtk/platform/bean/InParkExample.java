package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InParkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InParkExample() {
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

        public Criteria andCarLicenseIsNull() {
            addCriterion("Car_License is null");
            return (Criteria) this;
        }

        public Criteria andCarLicenseIsNotNull() {
            addCriterion("Car_License is not null");
            return (Criteria) this;
        }

        public Criteria andCarLicenseEqualTo(String value) {
            addCriterion("Car_License =", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNotEqualTo(String value) {
            addCriterion("Car_License <>", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseGreaterThan(String value) {
            addCriterion("Car_License >", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("Car_License >=", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseLessThan(String value) {
            addCriterion("Car_License <", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseLessThanOrEqualTo(String value) {
            addCriterion("Car_License <=", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseLike(String value) {
            addCriterion("Car_License like", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNotLike(String value) {
            addCriterion("Car_License not like", value, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseIn(List<String> values) {
            addCriterion("Car_License in", values, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNotIn(List<String> values) {
            addCriterion("Car_License not in", values, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseBetween(String value1, String value2) {
            addCriterion("Car_License between", value1, value2, "carLicense");
            return (Criteria) this;
        }

        public Criteria andCarLicenseNotBetween(String value1, String value2) {
            addCriterion("Car_License not between", value1, value2, "carLicense");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNull() {
            addCriterion("License_Type is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNotNull() {
            addCriterion("License_Type is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeEqualTo(Integer value) {
            addCriterion("License_Type =", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotEqualTo(Integer value) {
            addCriterion("License_Type <>", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThan(Integer value) {
            addCriterion("License_Type >", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("License_Type >=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThan(Integer value) {
            addCriterion("License_Type <", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("License_Type <=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIn(List<Integer> values) {
            addCriterion("License_Type in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotIn(List<Integer> values) {
            addCriterion("License_Type not in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeBetween(Integer value1, Integer value2) {
            addCriterion("License_Type between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("License_Type not between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNull() {
            addCriterion("Car_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("Car_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("Car_Type_ID =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("Car_Type_ID <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("Car_Type_ID >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Car_Type_ID >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("Car_Type_ID <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Car_Type_ID <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("Car_Type_ID in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("Car_Type_ID not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Car_Type_ID between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Car_Type_ID not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNull() {
            addCriterion("Park_ID is null");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNotNull() {
            addCriterion("Park_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdEqualTo(Integer value) {
            addCriterion("Park_ID =", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotEqualTo(Integer value) {
            addCriterion("Park_ID <>", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThan(Integer value) {
            addCriterion("Park_ID >", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Park_ID >=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThan(Integer value) {
            addCriterion("Park_ID <", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThanOrEqualTo(Integer value) {
            addCriterion("Park_ID <=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdIn(List<Integer> values) {
            addCriterion("Park_ID in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotIn(List<Integer> values) {
            addCriterion("Park_ID not in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdBetween(Integer value1, Integer value2) {
            addCriterion("Park_ID between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Park_ID not between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNull() {
            addCriterion("Come_Time is null");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNotNull() {
            addCriterion("Come_Time is not null");
            return (Criteria) this;
        }

        public Criteria andComeTimeEqualTo(String value) {
            addCriterion("Come_Time =", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotEqualTo(String value) {
            addCriterion("Come_Time <>", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThan(String value) {
            addCriterion("Come_Time >", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Come_Time >=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThan(String value) {
            addCriterion("Come_Time <", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThanOrEqualTo(String value) {
            addCriterion("Come_Time <=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLike(String value) {
            addCriterion("Come_Time like", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotLike(String value) {
            addCriterion("Come_Time not like", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeIn(List<String> values) {
            addCriterion("Come_Time in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotIn(List<String> values) {
            addCriterion("Come_Time not in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeBetween(String value1, String value2) {
            addCriterion("Come_Time between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotBetween(String value1, String value2) {
            addCriterion("Come_Time not between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andInPicPathIsNull() {
            addCriterion("In_Pic_Path is null");
            return (Criteria) this;
        }

        public Criteria andInPicPathIsNotNull() {
            addCriterion("In_Pic_Path is not null");
            return (Criteria) this;
        }

        public Criteria andInPicPathEqualTo(String value) {
            addCriterion("In_Pic_Path =", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathNotEqualTo(String value) {
            addCriterion("In_Pic_Path <>", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathGreaterThan(String value) {
            addCriterion("In_Pic_Path >", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("In_Pic_Path >=", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathLessThan(String value) {
            addCriterion("In_Pic_Path <", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathLessThanOrEqualTo(String value) {
            addCriterion("In_Pic_Path <=", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathLike(String value) {
            addCriterion("In_Pic_Path like", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathNotLike(String value) {
            addCriterion("In_Pic_Path not like", value, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathIn(List<String> values) {
            addCriterion("In_Pic_Path in", values, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathNotIn(List<String> values) {
            addCriterion("In_Pic_Path not in", values, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathBetween(String value1, String value2) {
            addCriterion("In_Pic_Path between", value1, value2, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicPathNotBetween(String value1, String value2) {
            addCriterion("In_Pic_Path not between", value1, value2, "inPicPath");
            return (Criteria) this;
        }

        public Criteria andInPicNameIsNull() {
            addCriterion("In_Pic_Name is null");
            return (Criteria) this;
        }

        public Criteria andInPicNameIsNotNull() {
            addCriterion("In_Pic_Name is not null");
            return (Criteria) this;
        }

        public Criteria andInPicNameEqualTo(String value) {
            addCriterion("In_Pic_Name =", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameNotEqualTo(String value) {
            addCriterion("In_Pic_Name <>", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameGreaterThan(String value) {
            addCriterion("In_Pic_Name >", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("In_Pic_Name >=", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameLessThan(String value) {
            addCriterion("In_Pic_Name <", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameLessThanOrEqualTo(String value) {
            addCriterion("In_Pic_Name <=", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameLike(String value) {
            addCriterion("In_Pic_Name like", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameNotLike(String value) {
            addCriterion("In_Pic_Name not like", value, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameIn(List<String> values) {
            addCriterion("In_Pic_Name in", values, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameNotIn(List<String> values) {
            addCriterion("In_Pic_Name not in", values, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameBetween(String value1, String value2) {
            addCriterion("In_Pic_Name between", value1, value2, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInPicNameNotBetween(String value1, String value2) {
            addCriterion("In_Pic_Name not between", value1, value2, "inPicName");
            return (Criteria) this;
        }

        public Criteria andInWaterNoIsNull() {
            addCriterion("In_Water_No is null");
            return (Criteria) this;
        }

        public Criteria andInWaterNoIsNotNull() {
            addCriterion("In_Water_No is not null");
            return (Criteria) this;
        }

        public Criteria andInWaterNoEqualTo(String value) {
            addCriterion("In_Water_No =", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotEqualTo(String value) {
            addCriterion("In_Water_No <>", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoGreaterThan(String value) {
            addCriterion("In_Water_No >", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoGreaterThanOrEqualTo(String value) {
            addCriterion("In_Water_No >=", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLessThan(String value) {
            addCriterion("In_Water_No <", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLessThanOrEqualTo(String value) {
            addCriterion("In_Water_No <=", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLike(String value) {
            addCriterion("In_Water_No like", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotLike(String value) {
            addCriterion("In_Water_No not like", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoIn(List<String> values) {
            addCriterion("In_Water_No in", values, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotIn(List<String> values) {
            addCriterion("In_Water_No not in", values, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoBetween(String value1, String value2) {
            addCriterion("In_Water_No between", value1, value2, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotBetween(String value1, String value2) {
            addCriterion("In_Water_No not between", value1, value2, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("Is_Pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("Is_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Integer value) {
            addCriterion("Is_Pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Integer value) {
            addCriterion("Is_Pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Integer value) {
            addCriterion("Is_Pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Is_Pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Integer value) {
            addCriterion("Is_Pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Integer value) {
            addCriterion("Is_Pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Integer> values) {
            addCriterion("Is_Pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Integer> values) {
            addCriterion("Is_Pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Integer value1, Integer value2) {
            addCriterion("Is_Pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Integer value1, Integer value2) {
            addCriterion("Is_Pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNull() {
            addCriterion("Last_Pay_Time is null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNotNull() {
            addCriterion("Last_Pay_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeEqualTo(String value) {
            addCriterion("Last_Pay_Time =", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotEqualTo(String value) {
            addCriterion("Last_Pay_Time <>", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThan(String value) {
            addCriterion("Last_Pay_Time >", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Last_Pay_Time >=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThan(String value) {
            addCriterion("Last_Pay_Time <", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThanOrEqualTo(String value) {
            addCriterion("Last_Pay_Time <=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLike(String value) {
            addCriterion("Last_Pay_Time like", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotLike(String value) {
            addCriterion("Last_Pay_Time not like", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIn(List<String> values) {
            addCriterion("Last_Pay_Time in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotIn(List<String> values) {
            addCriterion("Last_Pay_Time not in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeBetween(String value1, String value2) {
            addCriterion("Last_Pay_Time between", value1, value2, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotBetween(String value1, String value2) {
            addCriterion("Last_Pay_Time not between", value1, value2, "lastPayTime");
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