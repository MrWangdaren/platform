package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 操作员信息表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:28:20
 */
public class Operators {
    private Integer id;// 纪录ID

    private String operatorSn;// 操作员编号

    private String operatorName;// 操作员名称

    private String operatorContact;// 操作员联系方式

    private String operatorPwd;// 操作员登录密码

    private String operatorIcon;// 操作员会员头像地址

    private Integer operatorGender;// 操作员性别

    private String openId;// 微信公众平台openID

    private String unionUniqueId;// 微信开放平台多渠道统一ID

    private String tplUserId;// 第三方会员系统用户ID

    private String token;// 会话校验标识

    private Integer operatorRoleId;// 角色ID

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

    public String getOperatorSn() {
        return operatorSn;
    }

    public void setOperatorSn(String operatorSn) {
        this.operatorSn = operatorSn == null ? null : operatorSn.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOperatorContact() {
        return operatorContact;
    }

    public void setOperatorContact(String operatorContact) {
        this.operatorContact = operatorContact == null ? null : operatorContact.trim();
    }

    public String getOperatorPwd() {
        return operatorPwd;
    }

    public void setOperatorPwd(String operatorPwd) {
        this.operatorPwd = operatorPwd == null ? null : operatorPwd.trim();
    }

    public String getOperatorIcon() {
        return operatorIcon;
    }

    public void setOperatorIcon(String operatorIcon) {
        this.operatorIcon = operatorIcon == null ? null : operatorIcon.trim();
    }

    public Integer getOperatorGender() {
        return operatorGender;
    }

    public void setOperatorGender(Integer operatorGender) {
        this.operatorGender = operatorGender;
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

    public Integer getOperatorRoleId() {
        return operatorRoleId;
    }

    public void setOperatorRoleId(Integer operatorRoleId) {
        this.operatorRoleId = operatorRoleId;
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