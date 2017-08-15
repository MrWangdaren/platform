package com.dtk.platform.bean;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private String inWaterNo;

    private String carLicense;

    private Integer licenseType;

    private Integer carTypeId;

    private Integer parkId;

    private String comeTime;

    private String payTime;

    private Integer feeMny;

    private Integer factMny;

    private Integer sumfreemny;

    private Integer sumfreehour;

    private Integer payMode;

    private Integer payFlag;

    private Integer feeType;

    private Integer feeTypeId;

    private String goPicPath;

    private String goPicName;

    private String outTradeNo;

    private String transactionId;

    private Integer state;

    private Date createTime;

    private Date operateTime;

    private String keepField;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInWaterNo() {
        return inWaterNo;
    }

    public void setInWaterNo(String inWaterNo) {
        this.inWaterNo = inWaterNo == null ? null : inWaterNo.trim();
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense == null ? null : carLicense.trim();
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getComeTime() {
        return comeTime;
    }

    public void setComeTime(String comeTime) {
        this.comeTime = comeTime == null ? null : comeTime.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public Integer getFeeMny() {
        return feeMny;
    }

    public void setFeeMny(Integer feeMny) {
        this.feeMny = feeMny;
    }

    public Integer getFactMny() {
        return factMny;
    }

    public void setFactMny(Integer factMny) {
        this.factMny = factMny;
    }

    public Integer getSumfreemny() {
        return sumfreemny;
    }

    public void setSumfreemny(Integer sumfreemny) {
        this.sumfreemny = sumfreemny;
    }

    public Integer getSumfreehour() {
        return sumfreehour;
    }

    public void setSumfreehour(Integer sumfreehour) {
        this.sumfreehour = sumfreehour;
    }

    public Integer getPayMode() {
        return payMode;
    }

    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public Integer getFeeTypeId() {
        return feeTypeId;
    }

    public void setFeeTypeId(Integer feeTypeId) {
        this.feeTypeId = feeTypeId;
    }

    public String getGoPicPath() {
        return goPicPath;
    }

    public void setGoPicPath(String goPicPath) {
        this.goPicPath = goPicPath == null ? null : goPicPath.trim();
    }

    public String getGoPicName() {
        return goPicName;
    }

    public void setGoPicName(String goPicName) {
        this.goPicName = goPicName == null ? null : goPicName.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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