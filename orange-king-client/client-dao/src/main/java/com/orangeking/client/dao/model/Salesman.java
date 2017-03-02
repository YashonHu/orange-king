package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

public class Salesman {
    @Id
    @Column(name = "salesman_id")
    private Long salesmanId;

    /**
     * 销售名称
     */
    @Column(name = "salesman_name")
    private String salesmanName;

    /**
     * 微信号
     */
    private String weichat;

    /**
     * 手机号
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 角色
     */
    private Integer role;

    /**
     * 所属地区
     */
    private String district;

    /**
     * 状态：1-正常,2-离职
     */
    private Byte status;

    /**
     * 上级id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @Column(name = "last_update")
    private Date lastUpdate;

    public Salesman(Long salesmanId, String salesmanName, String weichat, String phoneNumber, Integer role, String district, Byte status, Long parentId, Date createdAt, Date lastUpdate) {
        this.salesmanId = salesmanId;
        this.salesmanName = salesmanName;
        this.weichat = weichat;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.district = district;
        this.status = status;
        this.parentId = parentId;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public Salesman() {
        super();
    }

    /**
     * @return salesman_id
     */
    public Long getSalesmanId() {
        return salesmanId;
    }

    /**
     * @param salesmanId
     */
    public void setSalesmanId(Long salesmanId) {
        this.salesmanId = salesmanId;
    }

    /**
     * 获取销售名称
     *
     * @return salesman_name - 销售名称
     */
    public String getSalesmanName() {
        return salesmanName;
    }

    /**
     * 设置销售名称
     *
     * @param salesmanName 销售名称
     */
    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName == null ? null : salesmanName.trim();
    }

    /**
     * 获取微信号
     *
     * @return weichat - 微信号
     */
    public String getWeichat() {
        return weichat;
    }

    /**
     * 设置微信号
     *
     * @param weichat 微信号
     */
    public void setWeichat(String weichat) {
        this.weichat = weichat == null ? null : weichat.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone_number - 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号
     *
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取角色
     *
     * @return role - 角色
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色
     *
     * @param role 角色
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取所属地区
     *
     * @return district - 所属地区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置所属地区
     *
     * @param district 所属地区
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 获取状态：1-正常,2-离职
     *
     * @return status - 状态：1-正常,2-离职
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态：1-正常,2-离职
     *
     * @param status 状态：1-正常,2-离职
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取上级id
     *
     * @return parent_id - 上级id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级id
     *
     * @param parentId 上级id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取更新时间
     *
     * @return last_update - 更新时间
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpdate 更新时间
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}