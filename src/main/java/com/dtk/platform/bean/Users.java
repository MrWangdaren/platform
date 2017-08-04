package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 会员信息表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:47:57
 */
public class Users {
    private Integer id;// 纪录ID

    private String vipSn;// 会员编号

    private String vipName;// 会员名称

    private String vipContact;// 会员联系方式

    private String vipHeaderIcon;// 会员头像地址

    private Integer vipGender;// 性别

    private String vipPassword;// 会员登录密码

    private String openId;// 微信公众平台openID

    private String unionUniqueId;// 微信开放平台多渠道统一ID

    private String tplUserId;// 第三方会员系统用户ID

    private String token;// 会话校验

    private Integer vipLevel;// 会员级别

    private Integer vipState;// 会员状态

    private Integer state;// 纪录状态

    private Date createTime;// 创建时间

    private Date operateTime;// 操作纪录时间

    private String keepField;// 保留字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVipSn() {
        return vipSn;
    }

    public void setVipSn(String vipSn) {
        this.vipSn = vipSn == null ? null : vipSn.trim();
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public String getVipContact() {
        return vipContact;
    }

    public void setVipContact(String vipContact) {
        this.vipContact = vipContact == null ? null : vipContact.trim();
    }

    public String getVipHeaderIcon() {
        return vipHeaderIcon;
    }

    public void setVipHeaderIcon(String vipHeaderIcon) {
        this.vipHeaderIcon = vipHeaderIcon == null ? null : vipHeaderIcon.trim();
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
        this.vipPassword = vipPassword == null ? null : vipPassword.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionUniqueId() {
        return unionUniqueId;
    }

    public void setUnionUniqueId(String unionUniqueId) {
        this.unionUniqueId = unionUniqueId == null ? null : unionUniqueId.trim();
    }

    public String getTplUserId() {
        return tplUserId;
    }

    public void setTplUserId(String tplUserId) {
        this.tplUserId = tplUserId == null ? null : tplUserId.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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
        this.keepField = keepField == null ? null : keepField.trim();
    }
}