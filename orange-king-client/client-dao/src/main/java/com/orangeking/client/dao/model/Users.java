package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

public class Users {
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 性别：0 女 1 男
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证卡号
     */
    @Column(name = "card_id")
    private String cardId;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 服务密码
     */
    @Column(name = "service_pwd")
    private String servicePwd;

    /**
     * 登录密码：预留字段
     */
    private String passwd;

    /**
     * 籍贯
     */
    @Column(name = "micile_of_origin")
    private String micileOfOrigin;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 工作类型:1-在职人员;2-个体经营
     */
    @Column(name = "work_type")
    private Byte workType;

    /**
     * 婚姻状态:1 已婚,2 未婚,3 离异,4 丧偶
     */
    @Column(name = "marital_status")
    private Byte maritalStatus;

    /**
     * 是否有驾照:0 无,1 有
     */
    @Column(name = "driving_license")
    private Byte drivingLicense;

    /**
     * 是否有车:0 无,1 有
     */
    @Column(name = "is_has_car")
    private Byte isHasCar;

    /**
     * 车牌号，is_has_car=1时必输
     */
    @Column(name = "plate_number")
    private String plateNumber;

    /**
     * 开户人
     */
    @Column(name = "account_holder")
    private String accountHolder;

    /**
     * 开户行
     */
    @Column(name = "account_bank")
    private String accountBank;

    /**
     * 账户
     */
    private String account;

    /**
     * 预留手机号
     */
    @Column(name = "re_phone_number")
    private String rePhoneNumber;

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

    public Users(String userId, String userName, Integer sex, Integer age, String cardId, String phoneNumber, String servicePwd, String passwd, String micileOfOrigin, String address, Byte workType, Byte maritalStatus, Byte drivingLicense, Byte isHasCar, String plateNumber, String accountHolder, String accountBank, String account, String rePhoneNumber, Date createdAt, Date lastUpdate) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.cardId = cardId;
        this.phoneNumber = phoneNumber;
        this.servicePwd = servicePwd;
        this.passwd = passwd;
        this.micileOfOrigin = micileOfOrigin;
        this.address = address;
        this.workType = workType;
        this.maritalStatus = maritalStatus;
        this.drivingLicense = drivingLicense;
        this.isHasCar = isHasCar;
        this.plateNumber = plateNumber;
        this.accountHolder = accountHolder;
        this.accountBank = accountBank;
        this.account = account;
        this.rePhoneNumber = rePhoneNumber;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public Users() {
        super();
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取性别：0 女 1 男
     *
     * @return sex - 性别：0 女 1 男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别：0 女 1 男
     *
     * @param sex 性别：0 女 1 男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取身份证卡号
     *
     * @return card_id - 身份证卡号
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置身份证卡号
     *
     * @param cardId 身份证卡号
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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
     * 获取服务密码
     *
     * @return service_pwd - 服务密码
     */
    public String getServicePwd() {
        return servicePwd;
    }

    /**
     * 设置服务密码
     *
     * @param servicePwd 服务密码
     */
    public void setServicePwd(String servicePwd) {
        this.servicePwd = servicePwd == null ? null : servicePwd.trim();
    }

    /**
     * 获取登录密码：预留字段
     *
     * @return passwd - 登录密码：预留字段
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置登录密码：预留字段
     *
     * @param passwd 登录密码：预留字段
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * 获取籍贯
     *
     * @return micile_of_origin - 籍贯
     */
    public String getMicileOfOrigin() {
        return micileOfOrigin;
    }

    /**
     * 设置籍贯
     *
     * @param micileOfOrigin 籍贯
     */
    public void setMicileOfOrigin(String micileOfOrigin) {
        this.micileOfOrigin = micileOfOrigin == null ? null : micileOfOrigin.trim();
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取工作类型:1-在职人员;2-个体经营
     *
     * @return work_type - 工作类型:1-在职人员;2-个体经营
     */
    public Byte getWorkType() {
        return workType;
    }

    /**
     * 设置工作类型:1-在职人员;2-个体经营
     *
     * @param workType 工作类型:1-在职人员;2-个体经营
     */
    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    /**
     * 获取婚姻状态:1 已婚,2 未婚,3 离异,4 丧偶
     *
     * @return marital_status - 婚姻状态:1 已婚,2 未婚,3 离异,4 丧偶
     */
    public Byte getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置婚姻状态:1 已婚,2 未婚,3 离异,4 丧偶
     *
     * @param maritalStatus 婚姻状态:1 已婚,2 未婚,3 离异,4 丧偶
     */
    public void setMaritalStatus(Byte maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取是否有驾照:0 无,1 有
     *
     * @return driving_license - 是否有驾照:0 无,1 有
     */
    public Byte getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * 设置是否有驾照:0 无,1 有
     *
     * @param drivingLicense 是否有驾照:0 无,1 有
     */
    public void setDrivingLicense(Byte drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    /**
     * 获取是否有车:0 无,1 有
     *
     * @return is_has_car - 是否有车:0 无,1 有
     */
    public Byte getIsHasCar() {
        return isHasCar;
    }

    /**
     * 设置是否有车:0 无,1 有
     *
     * @param isHasCar 是否有车:0 无,1 有
     */
    public void setIsHasCar(Byte isHasCar) {
        this.isHasCar = isHasCar;
    }

    /**
     * 获取车牌号，is_has_car=1时必输
     *
     * @return plate_number - 车牌号，is_has_car=1时必输
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号，is_has_car=1时必输
     *
     * @param plateNumber 车牌号，is_has_car=1时必输
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    /**
     * 获取开户人
     *
     * @return account_holder - 开户人
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * 设置开户人
     *
     * @param accountHolder 开户人
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder == null ? null : accountHolder.trim();
    }

    /**
     * 获取开户行
     *
     * @return account_bank - 开户行
     */
    public String getAccountBank() {
        return accountBank;
    }

    /**
     * 设置开户行
     *
     * @param accountBank 开户行
     */
    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    /**
     * 获取账户
     *
     * @return account - 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账户
     *
     * @param account 账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取预留手机号
     *
     * @return re_phone_number - 预留手机号
     */
    public String getRePhoneNumber() {
        return rePhoneNumber;
    }

    /**
     * 设置预留手机号
     *
     * @param rePhoneNumber 预留手机号
     */
    public void setRePhoneNumber(String rePhoneNumber) {
        this.rePhoneNumber = rePhoneNumber == null ? null : rePhoneNumber.trim();
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