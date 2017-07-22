package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 申诉建议表
 * @author DL
 * @date 2017年7月19日 下午5:26:13
 */
public class ComplaintsSuggestions {

	private Integer ID;// 纪录ID
	private String csOrderSN;// 申诉建议订单号
	private String csUserId;// 提交申诉建议的用户ID
	private Integer csType;// 申诉建议类型：1.建议，2停车订单申诉，3.绑定车辆信息申诉，9支付订单申诉
	private String csParkOrderNo;// 申诉停车订单号
	private String csPayOrderNo;// 申诉支付订单号
	private String csCarLicense;// 申诉车辆车牌号
	private Integer csCarLicenseType;// 申诉车辆类型
	private String csCarVehiclePicUrl1;// 申诉行驶证照片1
	private String csCarVehiclePicUrl2;// 申诉行驶证照片2
	private String csContent;// 申诉内容说明
	private String csSuggestion;// 申诉处理建议
	private String csCurrentOperator;// 申诉当前处理人
	private String csUnitedOrderSN;// 申诉关联的申诉单号
	private Integer csState;// 申诉订单状态：1.未处理，2.处理中，3.驳回，4处理完成
	private String csResult;// 申诉处理结果说明
	private String csCallbackReason;// 申诉驳回缘由
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

	public String getCsOrderSN() {
		return csOrderSN;
	}

	public void setCsOrderSN(String csOrderSN) {
		this.csOrderSN = csOrderSN;
	}

	public String getCsUserId() {
		return csUserId;
	}

	public void setCsUserId(String csUserId) {
		this.csUserId = csUserId;
	}

	public Integer getCsType() {
		return csType;
	}

	public void setCsType(Integer csType) {
		this.csType = csType;
	}

	public String getCsParkOrderNo() {
		return csParkOrderNo;
	}

	public void setCsParkOrderNo(String csParkOrderNo) {
		this.csParkOrderNo = csParkOrderNo;
	}

	public String getCsPayOrderNo() {
		return csPayOrderNo;
	}

	public void setCsPayOrderNo(String csPayOrderNo) {
		this.csPayOrderNo = csPayOrderNo;
	}

	public String getCsCarLicense() {
		return csCarLicense;
	}

	public void setCsCarLicense(String csCarLicense) {
		this.csCarLicense = csCarLicense;
	}

	public Integer getCsCarLicenseType() {
		return csCarLicenseType;
	}

	public void setCsCarLicenseType(Integer csCarLicenseType) {
		this.csCarLicenseType = csCarLicenseType;
	}

	public String getCsCarVehiclePicUrl1() {
		return csCarVehiclePicUrl1;
	}

	public void setCsCarVehiclePicUrl1(String csCarVehiclePicUrl1) {
		this.csCarVehiclePicUrl1 = csCarVehiclePicUrl1;
	}

	public String getCsCarVehiclePicUrl2() {
		return csCarVehiclePicUrl2;
	}

	public void setCsCarVehiclePicUrl2(String csCarVehiclePicUrl2) {
		this.csCarVehiclePicUrl2 = csCarVehiclePicUrl2;
	}

	public String getCsContent() {
		return csContent;
	}

	public void setCsContent(String csContent) {
		this.csContent = csContent;
	}

	public String getCsSuggestion() {
		return csSuggestion;
	}

	public void setCsSuggestion(String csSuggestion) {
		this.csSuggestion = csSuggestion;
	}

	public String getCsCurrentOperator() {
		return csCurrentOperator;
	}

	public void setCsCurrentOperator(String csCurrentOperator) {
		this.csCurrentOperator = csCurrentOperator;
	}

	public String getCsUnitedOrderSN() {
		return csUnitedOrderSN;
	}

	public void setCsUnitedOrderSN(String csUnitedOrderSN) {
		this.csUnitedOrderSN = csUnitedOrderSN;
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
		this.csResult = csResult;
	}

	public String getCsCallbackReason() {
		return csCallbackReason;
	}

	public void setCsCallbackReason(String csCallbackReason) {
		this.csCallbackReason = csCallbackReason;
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
