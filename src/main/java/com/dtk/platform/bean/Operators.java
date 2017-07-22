package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 操作员信息表
 * @author DL
 * @date 2017年7月19日 下午4:42:32
 */
public class Operators {

	private Integer ID;// 纪录ID
	private String operatorSN;// 操作员编号
	private String operatorName;// 操作员名称
	private String operatorContact;// 操作员联系方式
	private String operatorPwd;// 操作员登录密码
	private String operatorIcon;// 操作员会员头像地址
	private Integer operatorGender;// 操作员性别
	private String openeId;// 微信公众平台openID
	private String unionUniqueId;// 微信开放平台多渠道统一ID
	private String tplUserId;// 第三方会员系统用户ID
	private String token;// 会话校验标识
	private Integer operatorRoleID;// 角色ID
	private Integer state;// 纪录状态
	private Date createTime;// 创建时间
	private Date operateTime;// 操作纪录时间
	private String keepField;// 保留字段

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getOperatorSN() {
		return operatorSN;
	}

	public void setOperatorSN(String operatorSN) {
		this.operatorSN = operatorSN;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorContact() {
		return operatorContact;
	}

	public void setOperatorContact(String operatorContact) {
		this.operatorContact = operatorContact;
	}

	public String getOperatorPwd() {
		return operatorPwd;
	}

	public void setOperatorPwd(String operatorPwd) {
		this.operatorPwd = operatorPwd;
	}

	public String getOperatorIcon() {
		return operatorIcon;
	}

	public void setOperatorIcon(String operatorIcon) {
		this.operatorIcon = operatorIcon;
	}

	public Integer getOperatorGender() {
		return operatorGender;
	}

	public void setOperatorGender(Integer operatorGender) {
		this.operatorGender = operatorGender;
	}

	public String getOpeneId() {
		return openeId;
	}

	public void setOpeneId(String openeId) {
		this.openeId = openeId;
	}

	public String getUnionUniqueId() {
		return unionUniqueId;
	}

	public void setUnionUniqueId(String unionUniqueId) {
		this.unionUniqueId = unionUniqueId;
	}

	public String getTplUserId() {
		return tplUserId;
	}

	public void setTplUserId(String tplUserId) {
		this.tplUserId = tplUserId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getOperatorRoleID() {
		return operatorRoleID;
	}

	public void setOperatorRoleID(Integer operatorRoleID) {
		this.operatorRoleID = operatorRoleID;
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
		this.keepField = keepField;
	}
}
