package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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

        public Criteria andAttributionUserId1IsNull() {
            addCriterion("Attribution_User_Id1 is null");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1IsNotNull() {
            addCriterion("Attribution_User_Id1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1EqualTo(Integer value) {
            addCriterion("Attribution_User_Id1 =", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1NotEqualTo(Integer value) {
            addCriterion("Attribution_User_Id1 <>", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1GreaterThan(Integer value) {
            addCriterion("Attribution_User_Id1 >", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attribution_User_Id1 >=", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1LessThan(Integer value) {
            addCriterion("Attribution_User_Id1 <", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1LessThanOrEqualTo(Integer value) {
            addCriterion("Attribution_User_Id1 <=", value, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1In(List<Integer> values) {
            addCriterion("Attribution_User_Id1 in", values, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1NotIn(List<Integer> values) {
            addCriterion("Attribution_User_Id1 not in", values, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1Between(Integer value1, Integer value2) {
            addCriterion("Attribution_User_Id1 between", value1, value2, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId1NotBetween(Integer value1, Integer value2) {
            addCriterion("Attribution_User_Id1 not between", value1, value2, "attributionUserId1");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2IsNull() {
            addCriterion("Attribution_User_Id2 is null");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2IsNotNull() {
            addCriterion("Attribution_User_Id2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2EqualTo(Integer value) {
            addCriterion("Attribution_User_Id2 =", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2NotEqualTo(Integer value) {
            addCriterion("Attribution_User_Id2 <>", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2GreaterThan(Integer value) {
            addCriterion("Attribution_User_Id2 >", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attribution_User_Id2 >=", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2LessThan(Integer value) {
            addCriterion("Attribution_User_Id2 <", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2LessThanOrEqualTo(Integer value) {
            addCriterion("Attribution_User_Id2 <=", value, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2In(List<Integer> values) {
            addCriterion("Attribution_User_Id2 in", values, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2NotIn(List<Integer> values) {
            addCriterion("Attribution_User_Id2 not in", values, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2Between(Integer value1, Integer value2) {
            addCriterion("Attribution_User_Id2 between", value1, value2, "attributionUserId2");
            return (Criteria) this;
        }

        public Criteria andAttributionUserId2NotBetween(Integer value1, Integer value2) {
            addCriterion("Attribution_User_Id2 not between", value1, value2, "attributionUserId2");
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

        public Criteria andVehiclePicUrlIsNull() {
            addCriterion("Vehicle_Pic_Url is null");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlIsNotNull() {
            addCriterion("Vehicle_Pic_Url is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlEqualTo(String value) {
            addCriterion("Vehicle_Pic_Url =", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlNotEqualTo(String value) {
            addCriterion("Vehicle_Pic_Url <>", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlGreaterThan(String value) {
            addCriterion("Vehicle_Pic_Url >", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Vehicle_Pic_Url >=", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlLessThan(String value) {
            addCriterion("Vehicle_Pic_Url <", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlLessThanOrEqualTo(String value) {
            addCriterion("Vehicle_Pic_Url <=", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlLike(String value) {
            addCriterion("Vehicle_Pic_Url like", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlNotLike(String value) {
            addCriterion("Vehicle_Pic_Url not like", value, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlIn(List<String> values) {
            addCriterion("Vehicle_Pic_Url in", values, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlNotIn(List<String> values) {
            addCriterion("Vehicle_Pic_Url not in", values, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlBetween(String value1, String value2) {
            addCriterion("Vehicle_Pic_Url between", value1, value2, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andVehiclePicUrlNotBetween(String value1, String value2) {
            addCriterion("Vehicle_Pic_Url not between", value1, value2, "vehiclePicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIsNull() {
            addCriterion("Car_Pic_Url is null");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIsNotNull() {
            addCriterion("Car_Pic_Url is not null");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlEqualTo(String value) {
            addCriterion("Car_Pic_Url =", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotEqualTo(String value) {
            addCriterion("Car_Pic_Url <>", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlGreaterThan(String value) {
            addCriterion("Car_Pic_Url >", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Car_Pic_Url >=", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLessThan(String value) {
            addCriterion("Car_Pic_Url <", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLessThanOrEqualTo(String value) {
            addCriterion("Car_Pic_Url <=", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlLike(String value) {
            addCriterion("Car_Pic_Url like", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotLike(String value) {
            addCriterion("Car_Pic_Url not like", value, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlIn(List<String> values) {
            addCriterion("Car_Pic_Url in", values, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotIn(List<String> values) {
            addCriterion("Car_Pic_Url not in", values, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlBetween(String value1, String value2) {
            addCriterion("Car_Pic_Url between", value1, value2, "carPicUrl");
            return (Criteria) this;
        }

        public Criteria andCarPicUrlNotBetween(String value1, String value2) {
            addCriterion("Car_Pic_Url not between", value1, value2, "carPicUrl");
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