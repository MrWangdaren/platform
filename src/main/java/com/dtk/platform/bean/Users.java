package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * @Description 会员信息表
 * @author DL
 * @date 2017年7月19日 下午4:52:21
 */
public class Users {

	private Integer ID;// 纪录ID
	private String vipSN;// 会员编号
	private String vipName;// 会员名称
	private String vipContact;// 会员联系方式
	private String vipHeaderIcon;// 会员头像地址
	private Integer vipGender;// 性别
	private String vipPassword;// 会员登录密码
	private String openeId;// 微信公众平台openID
	private String unionUniqueId;// 微信开放平台多渠道统一ID
	private String tplUserId;// 第三方会员系统用户ID
	private String token;// 会话校验
	private Integer vipLevel;// 会员级别
	private Integer vipState;// 会员状态
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

	public String getVipSN() {
		return vipSN;
	}

	public void setVipSN(String vipSN) {
		this.vipSN = vipSN;
	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getVipContact() {
		return vipContact;
	}

	public void setVipContact(String vipContact) {
		this.vipContact = vipContact;
	}

	public String getVipHeaderIcon() {
		return vipHeaderIcon;
	}

	public void setVipHeaderIcon(String vipHeaderIcon) {
		this.vipHeaderIcon = vipHeaderIcon;
	}

	public Integer getVipGender() {
		return vipGender;
	}

	public void setVipGender(Integer vipGender) {
		this.vipGender = vipGender;
	}

	public String getVipPassword() {
		return vipPassword;
	}

	public void setVipPassword(String vipPassword) {
		this.vipPassword = vipPassword;
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

	public Integer getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(Integer vipLevel) {
		this.vipLevel = vipLevel;
	}

	public Integer getVipState() {
		return vipState;
	}

	public void setVipState(Integer vipState) {
		this.vipState = vipState;
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
