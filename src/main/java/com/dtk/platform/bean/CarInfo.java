package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 车辆信息表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:20:21
 */
public class CarInfo {
    private Integer id;// 纪录ID

    private Integer attributionUserId1;// 车辆归属用户ID1

    private Integer attributionUserId2;// 车辆归属用户ID2

    private String carLicense;// 车牌号

    private Integer licenseType;// 车牌类型

    private String vehiclePicUrl;// 行驶证照片地址

    private String carPicUrl;// 车辆照片地址

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

    public Integer getAttributionUserId1() {
        return attributionUserId1;
    }

    public void setAttributionUserId1(Integer attributionUserId1) {
        this.attributionUserId1 = attributionUserId1;
    }

    public Integer getAttributionUserId2() {
        return attributionUserId2;
    }

    public void setAttributionUserId2(Integer attributionUserId2) {
        this.attributionUserId2 = attributionUserId2;
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

    public String getVehiclePicUrl() {
        return vehiclePicUrl;
    }

    public void setVehiclePicUrl(String vehiclePicUrl) {
        this.vehiclePicUrl = vehiclePicUrl == null ? null : vehiclePicUrl.trim();
    }

    public String getCarPicUrl() {
        return carPicUrl;
    }

    public void setCarPicUrl(String carPicUrl) {
        this.carPicUrl = carPicUrl == null ? null : carPicUrl.trim();
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