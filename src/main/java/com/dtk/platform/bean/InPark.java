package com.dtk.platform.bean;

import java.util.Date;

public class InPark {
    private Integer id;

    private String carLicense;

    private Integer licenseType;

    private Integer carTypeId;

    private Integer parkId;

    private String comeTime;

    private String inPicPath;

    private String inPicName;

    private String inWaterNo;

    private Integer isPay;

    private String lastPayTime;

    private Integer state;

    private Date createTime;

    private Date operateTime;

    private String keepField;
    
    private Long stopTime;//停车时长（分钟） 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getInPicPath() {
        return inPicPath;
    }

    public void setInPicPath(String inPicPath) {
        this.inPicPath = inPicPath == null ? null : inPicPath.trim();
    }

    public String getInPicName() {
        return inPicName;
    }

    public void setInPicName(String inPicName) {
        this.inPicName = inPicName == null ? null : inPicName.trim();
    }

    public String getInWaterNo() {
        return inWaterNo;
    }

    public void setInWaterNo(String inWaterNo) {
        this.inWaterNo = inWaterNo == null ? null : inWaterNo.trim();
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getLastPayTime() {
        return lastPayTime;
    }

    public void setLastPayTime(String lastPayTime) {
        this.lastPayTime = lastPayTime == null ? null : lastPayTime.trim();
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

	public Long getStopTime() {
		return stopTime;
	}

	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
	}
    
    
}