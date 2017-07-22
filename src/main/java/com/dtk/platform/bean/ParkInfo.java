package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 停车场信息表
 * @author DL
 * @date 2017年7月19日 下午5:12:08
 */
public class ParkInfo {

	private Integer ID;// 纪录ID
	private String parkName;// 停车场名称
	private String parkSn;// 停车场编号
	private String parkAddress;// 停车场地址
	private Integer parkTotalSpace;// 停车场总车位数
	private Integer parkRemainSpaces;// 停车场剩余车位数
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

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getParkSn() {
		return parkSn;
	}

	public void setParkSn(String parkSn) {
		this.parkSn = parkSn;
	}

	public String getParkAddress() {
		return parkAddress;
	}

	public void setParkAddress(String parkAddress) {
		this.parkAddress = parkAddress;
	}

	public Integer getParkTotalSpace() {
		return parkTotalSpace;
	}

	public void setParkTotalSpace(Integer parkTotalSpace) {
		this.parkTotalSpace = parkTotalSpace;
	}

	public Integer getParkRemainSpaces() {
		return parkRemainSpaces;
	}

	public void setParkRemainSpaces(Integer parkRemainSpaces) {
		this.parkRemainSpaces = parkRemainSpaces;
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
