package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_binding")
public class UserBinding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 微信公众平台OPENID
     */
    @Column(name = "wechat_openid")
    private String wechatOpenid;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 状态：0-未绑定 1-已绑定
     */
    private Byte status;

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

    public UserBinding(Long id, String phoneNumber, String wechatOpenid, String userId, Byte status, Date createdAt, Date lastUpdate) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.wechatOpenid = wechatOpenid;
        this.userId = userId;
        this.status = status;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public UserBinding() {
        super();
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取手机号码
     *
     * @return phone_number - 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取微信公众平台OPENID
     *
     * @return wechat_openid - 微信公众平台OPENID
     */
    public String getWechatOpenid() {
        return wechatOpenid;
    }

    /**
     * 设置微信公众平台OPENID
     *
     * @param wechatOpenid 微信公众平台OPENID
     */
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取状态：0-未绑定 1-已绑定
     *
     * @return status - 状态：0-未绑定 1-已绑定
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态：0-未绑定 1-已绑定
     *
     * @param status 状态：0-未绑定 1-已绑定
     */
    public void setStatus(Byte status) {
        this.status = status;
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