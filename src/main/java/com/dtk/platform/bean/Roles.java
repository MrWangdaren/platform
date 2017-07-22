package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 角色表
 * @author DL
 * @date 2017年7月19日 下午5:07:24
 */
public class Roles {

	private Integer ID; // 纪录ID
	private String roleName;// 角色名称
	private String roleKey;// 角色key
	private Integer state; // 纪录状态
	private String descript;// 角色描述
	private Date createTime;// 创建时间
	private Date operateTime;// 操作纪录时间
	private String keepField;// 保留字段

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
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
