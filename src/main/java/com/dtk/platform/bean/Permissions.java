package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 权限表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:43:18
 */
public class Permissions {
    private Integer id;// 纪录ID

    private String permissionName;// 权限名称

    private String permissionKey;// 权限key值

    private String permissionUrl;// 权限路径

    private Integer parentId;// 父级Id

    private Integer permissionType;// 权限级别

    private Integer sort;// 菜单顺序

    private Integer state;// 纪录状态

    private String descript;// 权限描述

    private Date createTime;// 创建时间

    private Date operateTime;// 操作纪录时间

    private String keepField;// 保留字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey == null ? null : permissionKey.trim();
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl == null ? null : permissionUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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