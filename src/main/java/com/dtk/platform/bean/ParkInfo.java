package com.dtk.platform.bean;

import java.util.Date;

/**
 * 
 * <p>Description: 停车场信息表 </p>
 * @author wy
 * @date 2017年8月4日 上午10:40:50
 */
public class ParkInfo {
    private Integer id;// 纪录ID

    private String parkName;// 停车场名称

    private String parkSn;// 停车场编号

    private String parkAddress;// 停车场地址

    private Integer parkTotalSpaces;// 停车场总车位数

    private Integer parkRemainSpaces;// 停车场剩余车位数

    private Integer state;// 纪录状态

    private String descript;// 描述

    private Date createTime;// 创建时间

    private Date operateTime;// 操作纪录时间

    private String keepField;// 保留字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getParkSn() {
        return parkSn;
    }

    public void setParkSn(String parkSn) {
        this.parkSn = parkSn == null ? null : parkSn.trim();
    }

    public String getParkAddress() {
        return parkAddress;
    }

    public void setParkAddress(String parkAddress) {
        this.parkAddress = parkAddress == null ? null : parkAddress.trim();
    }

    public Integer getParkTotalSpaces() {
        return parkTotalSpaces;
    }

    public void setParkTotalSpaces(Integer parkTotalSpaces) {
        this.parkTotalSpaces = parkTotalSpaces;
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