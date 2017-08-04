package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintsSuggestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintsSuggestionsExample() {
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

        public Criteria andCsOrderSnIsNull() {
            addCriterion("CS_Order_SN is null");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnIsNotNull() {
            addCriterion("CS_Order_SN is not null");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnEqualTo(String value) {
            addCriterion("CS_Order_SN =", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnNotEqualTo(String value) {
            addCriterion("CS_Order_SN <>", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnGreaterThan(String value) {
            addCriterion("CS_Order_SN >", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Order_SN >=", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnLessThan(String value) {
            addCriterion("CS_Order_SN <", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnLessThanOrEqualTo(String value) {
            addCriterion("CS_Order_SN <=", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnLike(String value) {
            addCriterion("CS_Order_SN like", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnNotLike(String value) {
            addCriterion("CS_Order_SN not like", value, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnIn(List<String> values) {
            addCriterion("CS_Order_SN in", values, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnNotIn(List<String> values) {
            addCriterion("CS_Order_SN not in", values, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnBetween(String value1, String value2) {
            addCriterion("CS_Order_SN between", value1, value2, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsOrderSnNotBetween(String value1, String value2) {
            addCriterion("CS_Order_SN not between", value1, value2, "csOrderSn");
            return (Criteria) this;
        }

        public Criteria andCsUseridIsNull() {
            addCriterion("CS_UserId is null");
            return (Criteria) this;
        }

        public Criteria andCsUseridIsNotNull() {
            addCriterion("CS_UserId is not null");
            return (Criteria) this;
        }

        public Criteria andCsUseridEqualTo(Integer value) {
            addCriterion("CS_UserId =", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridNotEqualTo(Integer value) {
            addCriterion("CS_UserId <>", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridGreaterThan(Integer value) {
            addCriterion("CS_UserId >", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CS_UserId >=", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridLessThan(Integer value) {
            addCriterion("CS_UserId <", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridLessThanOrEqualTo(Integer value) {
            addCriterion("CS_UserId <=", value, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridIn(List<Integer> values) {
            addCriterion("CS_UserId in", values, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridNotIn(List<Integer> values) {
            addCriterion("CS_UserId not in", values, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridBetween(Integer value1, Integer value2) {
            addCriterion("CS_UserId between", value1, value2, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("CS_UserId not between", value1, value2, "csUserid");
            return (Criteria) this;
        }

        public Criteria andCsTypeIsNull() {
            addCriterion("CS_Type is null");
            return (Criteria) this;
        }

        public Criteria andCsTypeIsNotNull() {
            addCriterion("CS_Type is not null");
            return (Criteria) this;
        }

        public Criteria andCsTypeEqualTo(Integer value) {
            addCriterion("CS_Type =", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeNotEqualTo(Integer value) {
            addCriterion("CS_Type <>", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeGreaterThan(Integer value) {
            addCriterion("CS_Type >", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CS_Type >=", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeLessThan(Integer value) {
            addCriterion("CS_Type <", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CS_Type <=", value, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeIn(List<Integer> values) {
            addCriterion("CS_Type in", values, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeNotIn(List<Integer> values) {
            addCriterion("CS_Type not in", values, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeBetween(Integer value1, Integer value2) {
            addCriterion("CS_Type between", value1, value2, "csType");
            return (Criteria) this;
        }

        public Criteria andCsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CS_Type not between", value1, value2, "csType");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoIsNull() {
            addCriterion("CS_Park_OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoIsNotNull() {
            addCriterion("CS_Park_OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoEqualTo(String value) {
            addCriterion("CS_Park_OrderNo =", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoNotEqualTo(String value) {
            addCriterion("CS_Park_OrderNo <>", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoGreaterThan(String value) {
            addCriterion("CS_Park_OrderNo >", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Park_OrderNo >=", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoLessThan(String value) {
            addCriterion("CS_Park_OrderNo <", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoLessThanOrEqualTo(String value) {
            addCriterion("CS_Park_OrderNo <=", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoLike(String value) {
            addCriterion("CS_Park_OrderNo like", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoNotLike(String value) {
            addCriterion("CS_Park_OrderNo not like", value, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoIn(List<String> values) {
            addCriterion("CS_Park_OrderNo in", values, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoNotIn(List<String> values) {
            addCriterion("CS_Park_OrderNo not in", values, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoBetween(String value1, String value2) {
            addCriterion("CS_Park_OrderNo between", value1, value2, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsParkOrdernoNotBetween(String value1, String value2) {
            addCriterion("CS_Park_OrderNo not between", value1, value2, "csParkOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoIsNull() {
            addCriterion("CS_Pay_OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoIsNotNull() {
            addCriterion("CS_Pay_OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoEqualTo(String value) {
            addCriterion("CS_Pay_OrderNo =", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoNotEqualTo(String value) {
            addCriterion("CS_Pay_OrderNo <>", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoGreaterThan(String value) {
            addCriterion("CS_Pay_OrderNo >", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Pay_OrderNo >=", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoLessThan(String value) {
            addCriterion("CS_Pay_OrderNo <", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoLessThanOrEqualTo(String value) {
            addCriterion("CS_Pay_OrderNo <=", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoLike(String value) {
            addCriterion("CS_Pay_OrderNo like", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoNotLike(String value) {
            addCriterion("CS_Pay_OrderNo not like", value, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoIn(List<String> values) {
            addCriterion("CS_Pay_OrderNo in", values, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoNotIn(List<String> values) {
            addCriterion("CS_Pay_OrderNo not in", values, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoBetween(String value1, String value2) {
            addCriterion("CS_Pay_OrderNo between", value1, value2, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsPayOrdernoNotBetween(String value1, String value2) {
            addCriterion("CS_Pay_OrderNo not between", value1, value2, "csPayOrderno");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseIsNull() {
            addCriterion("CS_Car_License is null");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseIsNotNull() {
            addCriterion("CS_Car_License is not null");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseEqualTo(String value) {
            addCriterion("CS_Car_License =", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseNotEqualTo(String value) {
            addCriterion("CS_Car_License <>", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseGreaterThan(String value) {
            addCriterion("CS_Car_License >", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Car_License >=", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseLessThan(String value) {
            addCriterion("CS_Car_License <", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseLessThanOrEqualTo(String value) {
            addCriterion("CS_Car_License <=", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseLike(String value) {
            addCriterion("CS_Car_License like", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseNotLike(String value) {
            addCriterion("CS_Car_License not like", value, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseIn(List<String> values) {
            addCriterion("CS_Car_License in", values, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseNotIn(List<String> values) {
            addCriterion("CS_Car_License not in", values, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseBetween(String value1, String value2) {
            addCriterion("CS_Car_License between", value1, value2, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicenseNotBetween(String value1, String value2) {
            addCriterion("CS_Car_License not between", value1, value2, "csCarLicense");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeIsNull() {
            addCriterion("CS_Car_LicenseType is null");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeIsNotNull() {
            addCriterion("CS_Car_LicenseType is not null");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeEqualTo(Integer value) {
            addCriterion("CS_Car_LicenseType =", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeNotEqualTo(Integer value) {
            addCriterion("CS_Car_LicenseType <>", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeGreaterThan(Integer value) {
            addCriterion("CS_Car_LicenseType >", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CS_Car_LicenseType >=", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeLessThan(Integer value) {
            addCriterion("CS_Car_LicenseType <", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeLessThanOrEqualTo(Integer value) {
            addCriterion("CS_Car_LicenseType <=", value, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeIn(List<Integer> values) {
            addCriterion("CS_Car_LicenseType in", values, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeNotIn(List<Integer> values) {
            addCriterion("CS_Car_LicenseType not in", values, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeBetween(Integer value1, Integer value2) {
            addCriterion("CS_Car_LicenseType between", value1, value2, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarLicensetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CS_Car_LicenseType not between", value1, value2, "csCarLicensetype");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlIsNull() {
            addCriterion("CS_Car_VehiclePicUrl is null");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlIsNotNull() {
            addCriterion("CS_Car_VehiclePicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlEqualTo(String value) {
            addCriterion("CS_Car_VehiclePicUrl =", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlNotEqualTo(String value) {
            addCriterion("CS_Car_VehiclePicUrl <>", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlGreaterThan(String value) {
            addCriterion("CS_Car_VehiclePicUrl >", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Car_VehiclePicUrl >=", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlLessThan(String value) {
            addCriterion("CS_Car_VehiclePicUrl <", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlLessThanOrEqualTo(String value) {
            addCriterion("CS_Car_VehiclePicUrl <=", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlLike(String value) {
            addCriterion("CS_Car_VehiclePicUrl like", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlNotLike(String value) {
            addCriterion("CS_Car_VehiclePicUrl not like", value, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlIn(List<String> values) {
            addCriterion("CS_Car_VehiclePicUrl in", values, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlNotIn(List<String> values) {
            addCriterion("CS_Car_VehiclePicUrl not in", values, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlBetween(String value1, String value2) {
            addCriterion("CS_Car_VehiclePicUrl between", value1, value2, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsCarVehiclepicurlNotBetween(String value1, String value2) {
            addCriterion("CS_Car_VehiclePicUrl not between", value1, value2, "csCarVehiclepicurl");
            return (Criteria) this;
        }

        public Criteria andCsContentIsNull() {
            addCriterion("CS_Content is null");
            return (Criteria) this;
        }

        public Criteria andCsContentIsNotNull() {
            addCriterion("CS_Content is not null");
            return (Criteria) this;
        }

        public Criteria andCsContentEqualTo(String value) {
            addCriterion("CS_Content =", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentNotEqualTo(String value) {
            addCriterion("CS_Content <>", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentGreaterThan(String value) {
            addCriterion("CS_Content >", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Content >=", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentLessThan(String value) {
            addCriterion("CS_Content <", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentLessThanOrEqualTo(String value) {
            addCriterion("CS_Content <=", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentLike(String value) {
            addCriterion("CS_Content like", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentNotLike(String value) {
            addCriterion("CS_Content not like", value, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentIn(List<String> values) {
            addCriterion("CS_Content in", values, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentNotIn(List<String> values) {
            addCriterion("CS_Content not in", values, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentBetween(String value1, String value2) {
            addCriterion("CS_Content between", value1, value2, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsContentNotBetween(String value1, String value2) {
            addCriterion("CS_Content not between", value1, value2, "csContent");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionIsNull() {
            addCriterion("CS_Suggestion is null");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionIsNotNull() {
            addCriterion("CS_Suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionEqualTo(String value) {
            addCriterion("CS_Suggestion =", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionNotEqualTo(String value) {
            addCriterion("CS_Suggestion <>", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionGreaterThan(String value) {
            addCriterion("CS_Suggestion >", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Suggestion >=", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionLessThan(String value) {
            addCriterion("CS_Suggestion <", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionLessThanOrEqualTo(String value) {
            addCriterion("CS_Suggestion <=", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionLike(String value) {
            addCriterion("CS_Suggestion like", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionNotLike(String value) {
            addCriterion("CS_Suggestion not like", value, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionIn(List<String> values) {
            addCriterion("CS_Suggestion in", values, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionNotIn(List<String> values) {
            addCriterion("CS_Suggestion not in", values, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionBetween(String value1, String value2) {
            addCriterion("CS_Suggestion between", value1, value2, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsSuggestionNotBetween(String value1, String value2) {
            addCriterion("CS_Suggestion not between", value1, value2, "csSuggestion");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorIsNull() {
            addCriterion("CS_Current_Operator is null");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorIsNotNull() {
            addCriterion("CS_Current_Operator is not null");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorEqualTo(String value) {
            addCriterion("CS_Current_Operator =", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorNotEqualTo(String value) {
            addCriterion("CS_Current_Operator <>", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorGreaterThan(String value) {
            addCriterion("CS_Current_Operator >", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Current_Operator >=", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorLessThan(String value) {
            addCriterion("CS_Current_Operator <", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorLessThanOrEqualTo(String value) {
            addCriterion("CS_Current_Operator <=", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorLike(String value) {
            addCriterion("CS_Current_Operator like", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorNotLike(String value) {
            addCriterion("CS_Current_Operator not like", value, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorIn(List<String> values) {
            addCriterion("CS_Current_Operator in", values, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorNotIn(List<String> values) {
            addCriterion("CS_Current_Operator not in", values, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorBetween(String value1, String value2) {
            addCriterion("CS_Current_Operator between", value1, value2, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsCurrentOperatorNotBetween(String value1, String value2) {
            addCriterion("CS_Current_Operator not between", value1, value2, "csCurrentOperator");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnIsNull() {
            addCriterion("CS_United_OrderSN is null");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnIsNotNull() {
            addCriterion("CS_United_OrderSN is not null");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnEqualTo(String value) {
            addCriterion("CS_United_OrderSN =", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnNotEqualTo(String value) {
            addCriterion("CS_United_OrderSN <>", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnGreaterThan(String value) {
            addCriterion("CS_United_OrderSN >", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnGreaterThanOrEqualTo(String value) {
            addCriterion("CS_United_OrderSN >=", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnLessThan(String value) {
            addCriterion("CS_United_OrderSN <", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnLessThanOrEqualTo(String value) {
            addCriterion("CS_United_OrderSN <=", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnLike(String value) {
            addCriterion("CS_United_OrderSN like", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnNotLike(String value) {
            addCriterion("CS_United_OrderSN not like", value, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnIn(List<String> values) {
            addCriterion("CS_United_OrderSN in", values, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnNotIn(List<String> values) {
            addCriterion("CS_United_OrderSN not in", values, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnBetween(String value1, String value2) {
            addCriterion("CS_United_OrderSN between", value1, value2, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsUnitedOrdersnNotBetween(String value1, String value2) {
            addCriterion("CS_United_OrderSN not between", value1, value2, "csUnitedOrdersn");
            return (Criteria) this;
        }

        public Criteria andCsStateIsNull() {
            addCriterion("CS_State is null");
            return (Criteria) this;
        }

        public Criteria andCsStateIsNotNull() {
            addCriterion("CS_State is not null");
            return (Criteria) this;
        }

        public Criteria andCsStateEqualTo(Integer value) {
            addCriterion("CS_State =", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateNotEqualTo(Integer value) {
            addCriterion("CS_State <>", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateGreaterThan(Integer value) {
            addCriterion("CS_State >", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CS_State >=", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateLessThan(Integer value) {
            addCriterion("CS_State <", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateLessThanOrEqualTo(Integer value) {
            addCriterion("CS_State <=", value, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateIn(List<Integer> values) {
            addCriterion("CS_State in", values, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateNotIn(List<Integer> values) {
            addCriterion("CS_State not in", values, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateBetween(Integer value1, Integer value2) {
            addCriterion("CS_State between", value1, value2, "csState");
            return (Criteria) this;
        }

        public Criteria andCsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("CS_State not between", value1, value2, "csState");
            return (Criteria) this;
        }

        public Criteria andCsResultIsNull() {
            addCriterion("CS_Result is null");
            return (Criteria) this;
        }

        public Criteria andCsResultIsNotNull() {
            addCriterion("CS_Result is not null");
            return (Criteria) this;
        }

        public Criteria andCsResultEqualTo(String value) {
            addCriterion("CS_Result =", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultNotEqualTo(String value) {
            addCriterion("CS_Result <>", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultGreaterThan(String value) {
            addCriterion("CS_Result >", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Result >=", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultLessThan(String value) {
            addCriterion("CS_Result <", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultLessThanOrEqualTo(String value) {
            addCriterion("CS_Result <=", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultLike(String value) {
            addCriterion("CS_Result like", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultNotLike(String value) {
            addCriterion("CS_Result not like", value, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultIn(List<String> values) {
            addCriterion("CS_Result in", values, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultNotIn(List<String> values) {
            addCriterion("CS_Result not in", values, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultBetween(String value1, String value2) {
            addCriterion("CS_Result between", value1, value2, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsResultNotBetween(String value1, String value2) {
            addCriterion("CS_Result not between", value1, value2, "csResult");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonIsNull() {
            addCriterion("CS_Callback_Reason is null");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonIsNotNull() {
            addCriterion("CS_Callback_Reason is not null");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonEqualTo(String value) {
            addCriterion("CS_Callback_Reason =", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonNotEqualTo(String value) {
            addCriterion("CS_Callback_Reason <>", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonGreaterThan(String value) {
            addCriterion("CS_Callback_Reason >", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CS_Callback_Reason >=", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonLessThan(String value) {
            addCriterion("CS_Callback_Reason <", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonLessThanOrEqualTo(String value) {
            addCriterion("CS_Callback_Reason <=", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonLike(String value) {
            addCriterion("CS_Callback_Reason like", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonNotLike(String value) {
            addCriterion("CS_Callback_Reason not like", value, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonIn(List<String> values) {
            addCriterion("CS_Callback_Reason in", values, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonNotIn(List<String> values) {
            addCriterion("CS_Callback_Reason not in", values, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonBetween(String value1, String value2) {
            addCriterion("CS_Callback_Reason between", value1, value2, "csCallbackReason");
            return (Criteria) this;
        }

        public Criteria andCsCallbackReasonNotBetween(String value1, String value2) {
            addCriterion("CS_Callback_Reason not between", value1, value2, "csCallbackReason");
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