package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_jobs")
public class UserJobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 工作类型：1-在职人员,2-个体经营(在职人员时,联系方式及公司信息均为必填)
     */
    @Column(name = "work_type")
    private Byte workType;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 职位
     */
    private String position;

    /**
     * 固定电话
     */
    private String telephone;

    /**
     * 手机号
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

    public UserJobs(Long id, String userId, Byte workType, String companyName, String companyAddress, String position, String telephone, String phoneNumber, Date createdAt, Date lastUpdate) {
        this.id = id;
        this.userId = userId;
        this.workType = workType;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.position = position;
        this.telephone = telephone;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public UserJobs() {
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
     * 获取工作类型：1-在职人员,2-个体经营(在职人员时,联系方式及公司信息均为必填)
     *
     * @return work_type - 工作类型：1-在职人员,2-个体经营(在职人员时,联系方式及公司信息均为必填)
     */
    public Byte getWorkType() {
        return workType;
    }

    /**
     * 设置工作类型：1-在职人员,2-个体经营(在职人员时,联系方式及公司信息均为必填)
     *
     * @param workType 工作类型：1-在职人员,2-个体经营(在职人员时,联系方式及公司信息均为必填)
     */
    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取公司地址
     *
     * @return company_address - 公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置公司地址
     *
     * @param companyAddress 公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    /**
     * 获取职位
     *
     * @return position - 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职位
     *
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 获取固定电话
     *
     * @return telephone - 固定电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置固定电话
     *
     * @param telephone 固定电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
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