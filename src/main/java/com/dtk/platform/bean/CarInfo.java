package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 车辆信息表
 * @author DL
 * @date 2017年7月19日 下午5:19:55
 */
public class CarInfo {

	private Integer ID;// 纪录ID
	private String attributionUserId1;// 车辆归属用户ID1
	private String attributionUserId2;// 车辆归属用户ID2
	private String carLicense;// 车牌号
	private Integer licenseType;// 车牌类型
	private String vehiclePicUrl;// 行驶证照片地址
	private String carPicUrl;// 车辆照片地址
	private Integer state;// 纪录状态
	private String descript;// 描述
	private Date createTime;// 创建时间
	private Date operateTime;// 操作纪录时间
	private String keepField;// 保留字段

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getAttributionUserId1() {
		return attributionUserId1;
	}

	public void setAttributionUserId1(String attributionUserId1) {
		this.attributionUserId1 = attributionUserId1;
	}

	public String getAttributionUserId2() {
		return attributionUserId2;
	}

	public void setAttributionUserId2(String attributionUserId2) {
		this.attributionUserId2 = attributionUserId2;
	}

	public String getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
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
		this.vehiclePicUrl = vehiclePicUrl;
	}

	public String getCarPicUrl() {
		return carPicUrl;
	}

	public void setCarPicUrl(String carPicUrl) {
		this.carPicUrl = carPicUrl;
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
		this.descript = descript;
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
		this.keepField = keepField;
	}
}
