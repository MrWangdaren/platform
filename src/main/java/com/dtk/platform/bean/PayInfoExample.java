package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayInfoExample() {
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

        public Criteria andInWaterNoIsNull() {
            addCriterion("In_Water_NO is null");
            return (Criteria) this;
        }

        public Criteria andInWaterNoIsNotNull() {
            addCriterion("In_Water_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInWaterNoEqualTo(String value) {
            addCriterion("In_Water_NO =", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotEqualTo(String value) {
            addCriterion("In_Water_NO <>", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoGreaterThan(String value) {
            addCriterion("In_Water_NO >", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoGreaterThanOrEqualTo(String value) {
            addCriterion("In_Water_NO >=", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLessThan(String value) {
            addCriterion("In_Water_NO <", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLessThanOrEqualTo(String value) {
            addCriterion("In_Water_NO <=", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoLike(String value) {
            addCriterion("In_Water_NO like", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotLike(String value) {
            addCriterion("In_Water_NO not like", value, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoIn(List<String> values) {
            addCriterion("In_Water_NO in", values, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotIn(List<String> values) {
            addCriterion("In_Water_NO not in", values, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoBetween(String value1, String value2) {
            addCriterion("In_Water_NO between", value1, value2, "inWaterNo");
            return (Criteria) this;
        }

        public Criteria andInWaterNoNotBetween(String value1, String value2) {
            addCriterion("In_Water_NO not between", value1, value2, "inWaterNo");
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

        public Criteria andPayTimeIsNull() {
            addCriterion("Pay_Time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("Pay_Time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("Pay_Time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("Pay_Time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("Pay_Time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("Pay_Time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("Pay_Time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("Pay_Time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("Pay_Time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("Pay_Time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("Pay_Time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("Pay_Time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("Pay_Time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andFeeMnyIsNull() {
            addCriterion("Fee_Mny is null");
            return (Criteria) this;
        }

        public Criteria andFeeMnyIsNotNull() {
            addCriterion("Fee_Mny is not null");
            return (Criteria) this;
        }

        public Criteria andFeeMnyEqualTo(Integer value) {
            addCriterion("Fee_Mny =", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyNotEqualTo(Integer value) {
            addCriterion("Fee_Mny <>", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyGreaterThan(Integer value) {
            addCriterion("Fee_Mny >", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fee_Mny >=", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyLessThan(Integer value) {
            addCriterion("Fee_Mny <", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyLessThanOrEqualTo(Integer value) {
            addCriterion("Fee_Mny <=", value, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyIn(List<Integer> values) {
            addCriterion("Fee_Mny in", values, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyNotIn(List<Integer> values) {
            addCriterion("Fee_Mny not in", values, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Mny between", value1, value2, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFeeMnyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Mny not between", value1, value2, "feeMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyIsNull() {
            addCriterion("Fact_Mny is null");
            return (Criteria) this;
        }

        public Criteria andFactMnyIsNotNull() {
            addCriterion("Fact_Mny is not null");
            return (Criteria) this;
        }

        public Criteria andFactMnyEqualTo(Integer value) {
            addCriterion("Fact_Mny =", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyNotEqualTo(Integer value) {
            addCriterion("Fact_Mny <>", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyGreaterThan(Integer value) {
            addCriterion("Fact_Mny >", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fact_Mny >=", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyLessThan(Integer value) {
            addCriterion("Fact_Mny <", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyLessThanOrEqualTo(Integer value) {
            addCriterion("Fact_Mny <=", value, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyIn(List<Integer> values) {
            addCriterion("Fact_Mny in", values, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyNotIn(List<Integer> values) {
            addCriterion("Fact_Mny not in", values, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyBetween(Integer value1, Integer value2) {
            addCriterion("Fact_Mny between", value1, value2, "factMny");
            return (Criteria) this;
        }

        public Criteria andFactMnyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fact_Mny not between", value1, value2, "factMny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyIsNull() {
            addCriterion("SumFreeMny is null");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyIsNotNull() {
            addCriterion("SumFreeMny is not null");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyEqualTo(Integer value) {
            addCriterion("SumFreeMny =", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyNotEqualTo(Integer value) {
            addCriterion("SumFreeMny <>", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyGreaterThan(Integer value) {
            addCriterion("SumFreeMny >", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SumFreeMny >=", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyLessThan(Integer value) {
            addCriterion("SumFreeMny <", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyLessThanOrEqualTo(Integer value) {
            addCriterion("SumFreeMny <=", value, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyIn(List<Integer> values) {
            addCriterion("SumFreeMny in", values, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyNotIn(List<Integer> values) {
            addCriterion("SumFreeMny not in", values, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyBetween(Integer value1, Integer value2) {
            addCriterion("SumFreeMny between", value1, value2, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreemnyNotBetween(Integer value1, Integer value2) {
            addCriterion("SumFreeMny not between", value1, value2, "sumfreemny");
            return (Criteria) this;
        }

        public Criteria andSumfreehourIsNull() {
            addCriterion("SumFreeHour is null");
            return (Criteria) this;
        }

        public Criteria andSumfreehourIsNotNull() {
            addCriterion("SumFreeHour is not null");
            return (Criteria) this;
        }

        public Criteria andSumfreehourEqualTo(Integer value) {
            addCriterion("SumFreeHour =", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourNotEqualTo(Integer value) {
            addCriterion("SumFreeHour <>", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourGreaterThan(Integer value) {
            addCriterion("SumFreeHour >", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourGreaterThanOrEqualTo(Integer value) {
            addCriterion("SumFreeHour >=", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourLessThan(Integer value) {
            addCriterion("SumFreeHour <", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourLessThanOrEqualTo(Integer value) {
            addCriterion("SumFreeHour <=", value, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourIn(List<Integer> values) {
            addCriterion("SumFreeHour in", values, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourNotIn(List<Integer> values) {
            addCriterion("SumFreeHour not in", values, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourBetween(Integer value1, Integer value2) {
            addCriterion("SumFreeHour between", value1, value2, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andSumfreehourNotBetween(Integer value1, Integer value2) {
            addCriterion("SumFreeHour not between", value1, value2, "sumfreehour");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("Pay_Mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("Pay_Mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(Integer value) {
            addCriterion("Pay_Mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(Integer value) {
            addCriterion("Pay_Mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(Integer value) {
            addCriterion("Pay_Mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pay_Mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(Integer value) {
            addCriterion("Pay_Mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(Integer value) {
            addCriterion("Pay_Mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<Integer> values) {
            addCriterion("Pay_Mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<Integer> values) {
            addCriterion("Pay_Mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Mode not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNull() {
            addCriterion("Pay_Flag is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("Pay_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(Integer value) {
            addCriterion("Pay_Flag =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(Integer value) {
            addCriterion("Pay_Flag <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(Integer value) {
            addCriterion("Pay_Flag >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pay_Flag >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(Integer value) {
            addCriterion("Pay_Flag <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Pay_Flag <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<Integer> values) {
            addCriterion("Pay_Flag in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<Integer> values) {
            addCriterion("Pay_Flag not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Flag between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Flag not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("Fee_Type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("Fee_Type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(Integer value) {
            addCriterion("Fee_Type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(Integer value) {
            addCriterion("Fee_Type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(Integer value) {
            addCriterion("Fee_Type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fee_Type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(Integer value) {
            addCriterion("Fee_Type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Fee_Type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<Integer> values) {
            addCriterion("Fee_Type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<Integer> values) {
            addCriterion("Fee_Type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdIsNull() {
            addCriterion("Fee_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdIsNotNull() {
            addCriterion("Fee_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdEqualTo(Integer value) {
            addCriterion("Fee_Type_Id =", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdNotEqualTo(Integer value) {
            addCriterion("Fee_Type_Id <>", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdGreaterThan(Integer value) {
            addCriterion("Fee_Type_Id >", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fee_Type_Id >=", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdLessThan(Integer value) {
            addCriterion("Fee_Type_Id <", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fee_Type_Id <=", value, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdIn(List<Integer> values) {
            addCriterion("Fee_Type_Id in", values, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdNotIn(List<Integer> values) {
            addCriterion("Fee_Type_Id not in", values, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Type_Id between", value1, value2, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fee_Type_Id not between", value1, value2, "feeTypeId");
            return (Criteria) this;
        }

        public Criteria andGoPicPathIsNull() {
            addCriterion("Go_Pic_Path is null");
            return (Criteria) this;
        }

        public Criteria andGoPicPathIsNotNull() {
            addCriterion("Go_Pic_Path is not null");
            return (Criteria) this;
        }

        public Criteria andGoPicPathEqualTo(String value) {
            addCriterion("Go_Pic_Path =", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathNotEqualTo(String value) {
            addCriterion("Go_Pic_Path <>", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathGreaterThan(String value) {
            addCriterion("Go_Pic_Path >", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("Go_Pic_Path >=", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathLessThan(String value) {
            addCriterion("Go_Pic_Path <", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathLessThanOrEqualTo(String value) {
            addCriterion("Go_Pic_Path <=", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathLike(String value) {
            addCriterion("Go_Pic_Path like", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathNotLike(String value) {
            addCriterion("Go_Pic_Path not like", value, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathIn(List<String> values) {
            addCriterion("Go_Pic_Path in", values, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathNotIn(List<String> values) {
            addCriterion("Go_Pic_Path not in", values, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathBetween(String value1, String value2) {
            addCriterion("Go_Pic_Path between", value1, value2, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicPathNotBetween(String value1, String value2) {
            addCriterion("Go_Pic_Path not between", value1, value2, "goPicPath");
            return (Criteria) this;
        }

        public Criteria andGoPicNameIsNull() {
            addCriterion("Go_Pic_Name is null");
            return (Criteria) this;
        }

        public Criteria andGoPicNameIsNotNull() {
            addCriterion("Go_Pic_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGoPicNameEqualTo(String value) {
            addCriterion("Go_Pic_Name =", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameNotEqualTo(String value) {
            addCriterion("Go_Pic_Name <>", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameGreaterThan(String value) {
            addCriterion("Go_Pic_Name >", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("Go_Pic_Name >=", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameLessThan(String value) {
            addCriterion("Go_Pic_Name <", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameLessThanOrEqualTo(String value) {
            addCriterion("Go_Pic_Name <=", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameLike(String value) {
            addCriterion("Go_Pic_Name like", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameNotLike(String value) {
            addCriterion("Go_Pic_Name not like", value, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameIn(List<String> values) {
            addCriterion("Go_Pic_Name in", values, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameNotIn(List<String> values) {
            addCriterion("Go_Pic_Name not in", values, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameBetween(String value1, String value2) {
            addCriterion("Go_Pic_Name between", value1, value2, "goPicName");
            return (Criteria) this;
        }

        public Criteria andGoPicNameNotBetween(String value1, String value2) {
            addCriterion("Go_Pic_Name not between", value1, value2, "goPicName");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("Out_Trade_No is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("Out_Trade_No is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("Out_Trade_No =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("Out_Trade_No <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("Out_Trade_No >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("Out_Trade_No >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("Out_Trade_No <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("Out_Trade_No <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("Out_Trade_No like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("Out_Trade_No not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("Out_Trade_No in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("Out_Trade_No not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("Out_Trade_No between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("Out_Trade_No not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("Transaction_Id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("Transaction_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("Transaction_Id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("Transaction_Id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("Transaction_Id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("Transaction_Id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("Transaction_Id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("Transaction_Id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("Transaction_Id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("Transaction_Id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("Transaction_Id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("Transaction_Id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("Transaction_Id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("Transaction_Id not between", value1, value2, "transactionId");
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