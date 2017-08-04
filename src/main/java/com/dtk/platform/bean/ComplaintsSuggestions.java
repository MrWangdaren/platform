package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 申诉建议表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:25:34
 */
public class ComplaintsSuggestions {
    private Integer id;// 纪录ID

    private String csOrderSn;// 申诉建议订单号

    private Integer csUserId;// 提交申诉建议的用户ID

    private Integer csType;// 申诉建议类型：1.建议，2停车订单申诉，3.绑定车辆信息申诉，9支付订单申诉

    private String csParkOrderno;// 申诉停车订单号

    private String csPayOrderno;// 申诉支付订单号

    private String csCarLicense;// 申诉车辆车牌号

    private Integer csCarLicenseType;// 申诉车辆类型

    private String csCarVehiclePicUrl;// 申诉行驶证照片1

    private String csContent;// 申诉内容说明

    private String csSuggestion;// 申诉处理建议

    private String csCurrentOperator;// 申诉当前处理人

    private String csUnitedOrderSn;// 申诉关联的申诉单号

    private Integer csState;// 申诉订单状态：1.未处理，2.处理中，3.驳回，4处理完成

    private String csResult;// 申诉处理结果说明

    private String csCallbackReason;// 申诉驳回缘由

    private Integer state;// 纪录状态

    private String descript;// 描述

    private Date createTime;// 创建时间

    private Date operateTime;// 操作纪录时间

    private String keepField;// 保留字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCsOrderSn() {
        return csOrderSn;
    }

    public void setCsOrderSn(String csOrderSn) {
        this.csOrderSn = csOrderSn == null ? null : csOrderSn.trim();
    }

    public Integer getCsUserId() {
        return csUserId;
    }

    public void setCsUserId(Integer csUserId) {
        this.csUserId = csUserId;
    }

    public Integer getCsType() {
        return csType;
    }

    public void setCsType(Integer csType) {
        this.csType = csType;
    }

    public String getCsParkOrderno() {
        return csParkOrderno;
    }

    public void setCsParkOrderno(String csParkOrderno) {
        this.csParkOrderno = csParkOrderno == null ? null : csParkOrderno.trim();
    }

    public String getCsPayOrderno() {
        return csPayOrderno;
    }

    public void setCsPayOrderno(String csPayOrderno) {
        this.csPayOrderno = csPayOrderno == null ? null : csPayOrderno.trim();
    }

    public String getCsCarLicense() {
        return csCarLicense;
    }

    public void setCsCarLicense(String csCarLicense) {
        this.csCarLicense = csCarLicense == null ? null : csCarLicense.trim();
    }

    public Integer getCsCarLicenseType() {
        return csCarLicenseType;
    }

    public void setCsCarLicenseType(Integer csCarLicenseType) {
        this.csCarLicenseType = csCarLicenseType;
    }

    public String getCsCarVehiclePicUrl() {
        return csCarVehiclePicUrl;
    }

    public void setCsCarVehiclePicUrl(String csCarVehiclePicUrl) {
        this.csCarVehiclePicUrl = csCarVehiclePicUrl == null ? null : csCarVehiclePicUrl.trim();
    }

    public String getCsContent() {
        return csContent;
    }

    public void setCsContent(String csContent) {
        this.csContent = csContent == null ? null : csContent.trim();
    }

    public String getCsSuggestion() {
        return csSuggestion;
    }

    public void setCsSuggestion(String csSuggestion) {
        this.csSuggestion = csSuggestion == null ? null : csSuggestion.trim();
    }

    public String getCsCurrentOperator() {
        return csCurrentOperator;
    }

    public void setCsCurrentOperator(String csCurrentOperator) {
        this.csCurrentOperator = csCurrentOperator == null ? null : csCurrentOperator.trim();
    }

    public String getCsUnitedOrderSn() {
        return csUnitedOrderSn;
    }

    public void setCsUnitedOrderSn(String csUnitedOrderSn) {
        this.csUnitedOrderSn = csUnitedOrderSn == null ? null : csUnitedOrderSn.trim();
    }

    public Integer getCsState() {
        return csState;
    }

    public void setCsState(Integer csState) {
        this.csState = csState;
    }

    public String getCsResult() {
        return csResult;
    }

    public void setCsResult(String csResult) {
        this.csResult = csResult == null ? null : csResult.trim();
    }

    public String getCsCallbackReason() {
        return csCallbackReason;
    }

    public void setCsCallbackReason(String csCallbackReason) {
        this.csCallbackReason = csCallbackReason == null ? null : csCallbackReason.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getKeepField() {
        return keepField;
    }

    public void setKeepField(String keepField) {
        this.keepField = keepField == null ? null : keepField.trim();
    }
}