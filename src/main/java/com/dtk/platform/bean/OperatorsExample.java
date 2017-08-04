package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperatorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatorsExample() {
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

        public Criteria andOperatorSnIsNull() {
            addCriterion("Operator_SN is null");
            return (Criteria) this;
        }

        public Criteria andOperatorSnIsNotNull() {
            addCriterion("Operator_SN is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorSnEqualTo(String value) {
            addCriterion("Operator_SN =", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnNotEqualTo(String value) {
            addCriterion("Operator_SN <>", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnGreaterThan(String value) {
            addCriterion("Operator_SN >", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_SN >=", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnLessThan(String value) {
            addCriterion("Operator_SN <", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnLessThanOrEqualTo(String value) {
            addCriterion("Operator_SN <=", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnLike(String value) {
            addCriterion("Operator_SN like", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnNotLike(String value) {
            addCriterion("Operator_SN not like", value, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnIn(List<String> values) {
            addCriterion("Operator_SN in", values, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnNotIn(List<String> values) {
            addCriterion("Operator_SN not in", values, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnBetween(String value1, String value2) {
            addCriterion("Operator_SN between", value1, value2, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorSnNotBetween(String value1, String value2) {
            addCriterion("Operator_SN not between", value1, value2, "operatorSn");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("Operator_Name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("Operator_Name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("Operator_Name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("Operator_Name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("Operator_Name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_Name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("Operator_Name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("Operator_Name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("Operator_Name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("Operator_Name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("Operator_Name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("Operator_Name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("Operator_Name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("Operator_Name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorContactIsNull() {
            addCriterion("Operator_Contact is null");
            return (Criteria) this;
        }

        public Criteria andOperatorContactIsNotNull() {
            addCriterion("Operator_Contact is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorContactEqualTo(String value) {
            addCriterion("Operator_Contact =", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactNotEqualTo(String value) {
            addCriterion("Operator_Contact <>", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactGreaterThan(String value) {
            addCriterion("Operator_Contact >", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_Contact >=", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactLessThan(String value) {
            addCriterion("Operator_Contact <", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactLessThanOrEqualTo(String value) {
            addCriterion("Operator_Contact <=", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactLike(String value) {
            addCriterion("Operator_Contact like", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactNotLike(String value) {
            addCriterion("Operator_Contact not like", value, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactIn(List<String> values) {
            addCriterion("Operator_Contact in", values, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactNotIn(List<String> values) {
            addCriterion("Operator_Contact not in", values, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactBetween(String value1, String value2) {
            addCriterion("Operator_Contact between", value1, value2, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorContactNotBetween(String value1, String value2) {
            addCriterion("Operator_Contact not between", value1, value2, "operatorContact");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdIsNull() {
            addCriterion("Operator_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdIsNotNull() {
            addCriterion("Operator_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdEqualTo(String value) {
            addCriterion("Operator_Pwd =", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdNotEqualTo(String value) {
            addCriterion("Operator_Pwd <>", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdGreaterThan(String value) {
            addCriterion("Operator_Pwd >", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_Pwd >=", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdLessThan(String value) {
            addCriterion("Operator_Pwd <", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdLessThanOrEqualTo(String value) {
            addCriterion("Operator_Pwd <=", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdLike(String value) {
            addCriterion("Operator_Pwd like", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdNotLike(String value) {
            addCriterion("Operator_Pwd not like", value, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdIn(List<String> values) {
            addCriterion("Operator_Pwd in", values, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdNotIn(List<String> values) {
            addCriterion("Operator_Pwd not in", values, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdBetween(String value1, String value2) {
            addCriterion("Operator_Pwd between", value1, value2, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorPwdNotBetween(String value1, String value2) {
            addCriterion("Operator_Pwd not between", value1, value2, "operatorPwd");
            return (Criteria) this;
        }

        public Criteria andOperatorIconIsNull() {
            addCriterion("Operator_Icon is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIconIsNotNull() {
            addCriterion("Operator_Icon is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIconEqualTo(String value) {
            addCriterion("Operator_Icon =", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconNotEqualTo(String value) {
            addCriterion("Operator_Icon <>", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconGreaterThan(String value) {
            addCriterion("Operator_Icon >", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_Icon >=", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconLessThan(String value) {
            addCriterion("Operator_Icon <", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconLessThanOrEqualTo(String value) {
            addCriterion("Operator_Icon <=", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconLike(String value) {
            addCriterion("Operator_Icon like", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconNotLike(String value) {
            addCriterion("Operator_Icon not like", value, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconIn(List<String> values) {
            addCriterion("Operator_Icon in", values, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconNotIn(List<String> values) {
            addCriterion("Operator_Icon not in", values, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconBetween(String value1, String value2) {
            addCriterion("Operator_Icon between", value1, value2, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorIconNotBetween(String value1, String value2) {
            addCriterion("Operator_Icon not between", value1, value2, "operatorIcon");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderIsNull() {
            addCriterion("Operator_Gender is null");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderIsNotNull() {
            addCriterion("Operator_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderEqualTo(Integer value) {
            addCriterion("Operator_Gender =", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderNotEqualTo(Integer value) {
            addCriterion("Operator_Gender <>", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderGreaterThan(Integer value) {
            addCriterion("Operator_Gender >", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Operator_Gender >=", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderLessThan(Integer value) {
            addCriterion("Operator_Gender <", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Operator_Gender <=", value, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderIn(List<Integer> values) {
            addCriterion("Operator_Gender in", values, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderNotIn(List<Integer> values) {
            addCriterion("Operator_Gender not in", values, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderBetween(Integer value1, Integer value2) {
            addCriterion("Operator_Gender between", value1, value2, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOperatorGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Operator_Gender not between", value1, value2, "operatorGender");
            return (Criteria) this;
        }

        public Criteria andOpeneidIsNull() {
            addCriterion("OpeneId is null");
            return (Criteria) this;
        }

        public Criteria andOpeneidIsNotNull() {
            addCriterion("OpeneId is not null");
            return (Criteria) this;
        }

        public Criteria andOpeneidEqualTo(String value) {
            addCriterion("OpeneId =", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidNotEqualTo(String value) {
            addCriterion("OpeneId <>", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidGreaterThan(String value) {
            addCriterion("OpeneId >", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidGreaterThanOrEqualTo(String value) {
            addCriterion("OpeneId >=", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidLessThan(String value) {
            addCriterion("OpeneId <", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidLessThanOrEqualTo(String value) {
            addCriterion("OpeneId <=", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidLike(String value) {
            addCriterion("OpeneId like", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidNotLike(String value) {
            addCriterion("OpeneId not like", value, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidIn(List<String> values) {
            addCriterion("OpeneId in", values, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidNotIn(List<String> values) {
            addCriterion("OpeneId not in", values, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidBetween(String value1, String value2) {
            addCriterion("OpeneId between", value1, value2, "openeid");
            return (Criteria) this;
        }

        public Criteria andOpeneidNotBetween(String value1, String value2) {
            addCriterion("OpeneId not between", value1, value2, "openeid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidIsNull() {
            addCriterion("UnionUniqueId is null");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidIsNotNull() {
            addCriterion("UnionUniqueId is not null");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidEqualTo(String value) {
            addCriterion("UnionUniqueId =", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidNotEqualTo(String value) {
            addCriterion("UnionUniqueId <>", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidGreaterThan(String value) {
            addCriterion("UnionUniqueId >", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("UnionUniqueId >=", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidLessThan(String value) {
            addCriterion("UnionUniqueId <", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidLessThanOrEqualTo(String value) {
            addCriterion("UnionUniqueId <=", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidLike(String value) {
            addCriterion("UnionUniqueId like", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidNotLike(String value) {
            addCriterion("UnionUniqueId not like", value, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidIn(List<String> values) {
            addCriterion("UnionUniqueId in", values, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidNotIn(List<String> values) {
            addCriterion("UnionUniqueId not in", values, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidBetween(String value1, String value2) {
            addCriterion("UnionUniqueId between", value1, value2, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andUnionuniqueidNotBetween(String value1, String value2) {
            addCriterion("UnionUniqueId not between", value1, value2, "unionuniqueid");
            return (Criteria) this;
        }

        public Criteria andTpluseridIsNull() {
            addCriterion("TPLUserId is null");
            return (Criteria) this;
        }

        public Criteria andTpluseridIsNotNull() {
            addCriterion("TPLUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTpluseridEqualTo(String value) {
            addCriterion("TPLUserId =", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridNotEqualTo(String value) {
            addCriterion("TPLUserId <>", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridGreaterThan(String value) {
            addCriterion("TPLUserId >", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridGreaterThanOrEqualTo(String value) {
            addCriterion("TPLUserId >=", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridLessThan(String value) {
            addCriterion("TPLUserId <", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridLessThanOrEqualTo(String value) {
            addCriterion("TPLUserId <=", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridLike(String value) {
            addCriterion("TPLUserId like", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridNotLike(String value) {
            addCriterion("TPLUserId not like", value, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridIn(List<String> values) {
            addCriterion("TPLUserId in", values, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridNotIn(List<String> values) {
            addCriterion("TPLUserId not in", values, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridBetween(String value1, String value2) {
            addCriterion("TPLUserId between", value1, value2, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTpluseridNotBetween(String value1, String value2) {
            addCriterion("TPLUserId not between", value1, value2, "tpluserid");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("Token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("Token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("Token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("Token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("Token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("Token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("Token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("Token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("Token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("Token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("Token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("Token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("Token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdIsNull() {
            addCriterion("Operator_Role_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdIsNotNull() {
            addCriterion("Operator_Role_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdEqualTo(Integer value) {
            addCriterion("Operator_Role_ID =", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdNotEqualTo(Integer value) {
            addCriterion("Operator_Role_ID <>", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdGreaterThan(Integer value) {
            addCriterion("Operator_Role_ID >", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Operator_Role_ID >=", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdLessThan(Integer value) {
            addCriterion("Operator_Role_ID <", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Operator_Role_ID <=", value, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdIn(List<Integer> values) {
            addCriterion("Operator_Role_ID in", values, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdNotIn(List<Integer> values) {
            addCriterion("Operator_Role_ID not in", values, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("Operator_Role_ID between", value1, value2, "operatorRoleId");
            return (Criteria) this;
        }

        public Criteria andOperatorRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Operator_Role_ID not between", value1, value2, "operatorRoleId");
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