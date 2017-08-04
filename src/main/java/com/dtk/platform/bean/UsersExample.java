package com.dtk.platform.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andVipSnIsNull() {
            addCriterion("Vip_SN is null");
            return (Criteria) this;
        }

        public Criteria andVipSnIsNotNull() {
            addCriterion("Vip_SN is not null");
            return (Criteria) this;
        }

        public Criteria andVipSnEqualTo(String value) {
            addCriterion("Vip_SN =", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnNotEqualTo(String value) {
            addCriterion("Vip_SN <>", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnGreaterThan(String value) {
            addCriterion("Vip_SN >", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnGreaterThanOrEqualTo(String value) {
            addCriterion("Vip_SN >=", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnLessThan(String value) {
            addCriterion("Vip_SN <", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnLessThanOrEqualTo(String value) {
            addCriterion("Vip_SN <=", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnLike(String value) {
            addCriterion("Vip_SN like", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnNotLike(String value) {
            addCriterion("Vip_SN not like", value, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnIn(List<String> values) {
            addCriterion("Vip_SN in", values, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnNotIn(List<String> values) {
            addCriterion("Vip_SN not in", values, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnBetween(String value1, String value2) {
            addCriterion("Vip_SN between", value1, value2, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipSnNotBetween(String value1, String value2) {
            addCriterion("Vip_SN not between", value1, value2, "vipSn");
            return (Criteria) this;
        }

        public Criteria andVipNameIsNull() {
            addCriterion("Vip_Name is null");
            return (Criteria) this;
        }

        public Criteria andVipNameIsNotNull() {
            addCriterion("Vip_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVipNameEqualTo(String value) {
            addCriterion("Vip_Name =", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotEqualTo(String value) {
            addCriterion("Vip_Name <>", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameGreaterThan(String value) {
            addCriterion("Vip_Name >", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameGreaterThanOrEqualTo(String value) {
            addCriterion("Vip_Name >=", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLessThan(String value) {
            addCriterion("Vip_Name <", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLessThanOrEqualTo(String value) {
            addCriterion("Vip_Name <=", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLike(String value) {
            addCriterion("Vip_Name like", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotLike(String value) {
            addCriterion("Vip_Name not like", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameIn(List<String> values) {
            addCriterion("Vip_Name in", values, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotIn(List<String> values) {
            addCriterion("Vip_Name not in", values, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameBetween(String value1, String value2) {
            addCriterion("Vip_Name between", value1, value2, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotBetween(String value1, String value2) {
            addCriterion("Vip_Name not between", value1, value2, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipContactIsNull() {
            addCriterion("Vip_Contact is null");
            return (Criteria) this;
        }

        public Criteria andVipContactIsNotNull() {
            addCriterion("Vip_Contact is not null");
            return (Criteria) this;
        }

        public Criteria andVipContactEqualTo(String value) {
            addCriterion("Vip_Contact =", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactNotEqualTo(String value) {
            addCriterion("Vip_Contact <>", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactGreaterThan(String value) {
            addCriterion("Vip_Contact >", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactGreaterThanOrEqualTo(String value) {
            addCriterion("Vip_Contact >=", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactLessThan(String value) {
            addCriterion("Vip_Contact <", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactLessThanOrEqualTo(String value) {
            addCriterion("Vip_Contact <=", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactLike(String value) {
            addCriterion("Vip_Contact like", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactNotLike(String value) {
            addCriterion("Vip_Contact not like", value, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactIn(List<String> values) {
            addCriterion("Vip_Contact in", values, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactNotIn(List<String> values) {
            addCriterion("Vip_Contact not in", values, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactBetween(String value1, String value2) {
            addCriterion("Vip_Contact between", value1, value2, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipContactNotBetween(String value1, String value2) {
            addCriterion("Vip_Contact not between", value1, value2, "vipContact");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconIsNull() {
            addCriterion("Vip_Header_Icon is null");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconIsNotNull() {
            addCriterion("Vip_Header_Icon is not null");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconEqualTo(String value) {
            addCriterion("Vip_Header_Icon =", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconNotEqualTo(String value) {
            addCriterion("Vip_Header_Icon <>", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconGreaterThan(String value) {
            addCriterion("Vip_Header_Icon >", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconGreaterThanOrEqualTo(String value) {
            addCriterion("Vip_Header_Icon >=", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconLessThan(String value) {
            addCriterion("Vip_Header_Icon <", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconLessThanOrEqualTo(String value) {
            addCriterion("Vip_Header_Icon <=", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconLike(String value) {
            addCriterion("Vip_Header_Icon like", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconNotLike(String value) {
            addCriterion("Vip_Header_Icon not like", value, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconIn(List<String> values) {
            addCriterion("Vip_Header_Icon in", values, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconNotIn(List<String> values) {
            addCriterion("Vip_Header_Icon not in", values, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconBetween(String value1, String value2) {
            addCriterion("Vip_Header_Icon between", value1, value2, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipHeaderIconNotBetween(String value1, String value2) {
            addCriterion("Vip_Header_Icon not between", value1, value2, "vipHeaderIcon");
            return (Criteria) this;
        }

        public Criteria andVipGenderIsNull() {
            addCriterion("Vip_Gender is null");
            return (Criteria) this;
        }

        public Criteria andVipGenderIsNotNull() {
            addCriterion("Vip_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andVipGenderEqualTo(Integer value) {
            addCriterion("Vip_Gender =", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotEqualTo(Integer value) {
            addCriterion("Vip_Gender <>", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderGreaterThan(Integer value) {
            addCriterion("Vip_Gender >", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vip_Gender >=", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderLessThan(Integer value) {
            addCriterion("Vip_Gender <", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Vip_Gender <=", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderIn(List<Integer> values) {
            addCriterion("Vip_Gender in", values, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotIn(List<Integer> values) {
            addCriterion("Vip_Gender not in", values, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Gender between", value1, value2, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Gender not between", value1, value2, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipPasswordIsNull() {
            addCriterion("Vip_Password is null");
            return (Criteria) this;
        }

        public Criteria andVipPasswordIsNotNull() {
            addCriterion("Vip_Password is not null");
            return (Criteria) this;
        }

        public Criteria andVipPasswordEqualTo(String value) {
            addCriterion("Vip_Password =", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordNotEqualTo(String value) {
            addCriterion("Vip_Password <>", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordGreaterThan(String value) {
            addCriterion("Vip_Password >", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Vip_Password >=", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordLessThan(String value) {
            addCriterion("Vip_Password <", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordLessThanOrEqualTo(String value) {
            addCriterion("Vip_Password <=", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordLike(String value) {
            addCriterion("Vip_Password like", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordNotLike(String value) {
            addCriterion("Vip_Password not like", value, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordIn(List<String> values) {
            addCriterion("Vip_Password in", values, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordNotIn(List<String> values) {
            addCriterion("Vip_Password not in", values, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordBetween(String value1, String value2) {
            addCriterion("Vip_Password between", value1, value2, "vipPassword");
            return (Criteria) this;
        }

        public Criteria andVipPasswordNotBetween(String value1, String value2) {
            addCriterion("Vip_Password not between", value1, value2, "vipPassword");
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

        public Criteria andVipLevelIsNull() {
            addCriterion("Vip_Level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("Vip_Level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("Vip_Level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("Vip_Level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("Vip_Level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vip_Level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("Vip_Level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Vip_Level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("Vip_Level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("Vip_Level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipStateIsNull() {
            addCriterion("Vip_State is null");
            return (Criteria) this;
        }

        public Criteria andVipStateIsNotNull() {
            addCriterion("Vip_State is not null");
            return (Criteria) this;
        }

        public Criteria andVipStateEqualTo(Integer value) {
            addCriterion("Vip_State =", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotEqualTo(Integer value) {
            addCriterion("Vip_State <>", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThan(Integer value) {
            addCriterion("Vip_State >", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vip_State >=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThan(Integer value) {
            addCriterion("Vip_State <", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThanOrEqualTo(Integer value) {
            addCriterion("Vip_State <=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateIn(List<Integer> values) {
            addCriterion("Vip_State in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotIn(List<Integer> values) {
            addCriterion("Vip_State not in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateBetween(Integer value1, Integer value2) {
            addCriterion("Vip_State between", value1, value2, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Vip_State not between", value1, value2, "vipState");
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