package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 权限表
 * @author DL
 * @date 2017年7月19日 下午5:01:13
 */
public class Permissions {

	private Integer ID;// 纪录ID
	private String permissionName;// 权限名称
	private String permissionKey;// 权限key值
	private String permissionUrl;// 权限路径
	private Integer parentID;// 父级Id
	private Integer permissionType;// 权限级别
	private Integer sort;// 菜单顺序
	private Integer state;// 纪录状态
	private String descript;// 权限描述
	private Date createTime;// 创建时间
	private Date operateTime;// 操作纪录时间
	private String keepField;// 保留字段

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionKey() {
		return permissionKey;
	}

	public void setPermissionKey(String permissionKey) {
		this.permissionKey = permissionKey;
	}

	public String getPermissionUrl() {
		return permissionUrl;
	}

	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}

	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}

	public Integer getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(Integer permissionType) {
		this.permissionType = permissionType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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
