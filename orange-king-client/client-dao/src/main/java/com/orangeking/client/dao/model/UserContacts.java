package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_contacts")
public class UserContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 所属关系:父亲,母亲,配偶,子女,同事,朋友,亲戚
     */
    private Integer relationship;

    /**
     * 名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

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

    public UserContacts(Long id, String userId, Integer relationship, String userName, String phoneNumber, Date createdAt, Date lastUpdate) {
        this.id = id;
        this.userId = userId;
        this.relationship = relationship;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public UserContacts() {
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
     * 获取所属关系:父亲,母亲,配偶,子女,同事,朋友,亲戚
     *
     * @return relationship - 所属关系:父亲,母亲,配偶,子女,同事,朋友,亲戚
     */
    public Integer getRelationship() {
        return relationship;
    }

    /**
     * 设置所属关系:父亲,母亲,配偶,子女,同事,朋友,亲戚
     *
     * @param relationship 所属关系:父亲,母亲,配偶,子女,同事,朋友,亲戚
     */
    public void setRelationship(Integer relationship) {
        this.relationship = relationship;
    }

    /**
     * 获取名称
     *
     * @return user_name - 名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置名称
     *
     * @param userName 名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取联系电话
     *
     * @return phone_number - 联系电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNumber 联系电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
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