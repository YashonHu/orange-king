package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "car_dealer")
public class CarDealer {
    @Id
    @Column(name = "car_dealer_id")
    private String carDealerId;

    /**
     * 车商名称
     */
    @Column(name = "car_dealer_name")
    private String carDealerName;

    /**
     * 车商邀请码
     */
    @Column(name = "car_dealer_code")
    private String carDealerCode;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "contact_card_id")
    private String contactCardId;

    /**
     * 车商地址
     */
    @Column(name = "car_dealer_address")
    private String carDealerAddress;

    /**
     * 所属车市
     */
    @Column(name = "car_dealer_district")
    private String carDealerDistrict;

    /**
     * 详细地址
     */
    @Column(name = "detailed_address")
    private String detailedAddress;

    /**
     * 车商类型:0-个人 1-公司(为1时，公司名称，法人，营业执照为必输项)
     */
    @Column(name = "car_dealer_type")
    private Byte carDealerType;

    /**
     * 开户人
     */
    @Column(name = "account_holder")
    private String accountHolder;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 法人
     */
    @Column(name = "legal_person")
    private String legalPerson;

    /**
     * 营业执照
     */
    @Column(name = "business_license")
    private String businessLicense;

    /**
     * 开户行
     */
    @Column(name = "account_bank")
    private String accountBank;

    /**
     * 放款账户
     */
    private String account;

    /**
     * 账户类型0-对私 1-对公
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 销售员id
     */
    @Column(name = "salesman_id")
    private Long salesmanId;

    /**
     * 状态
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

    public CarDealer(String carDealerId, String carDealerName, String carDealerCode, String contact, String phoneNumber, String contactCardId, String carDealerAddress, String carDealerDistrict, String detailedAddress, Byte carDealerType, String accountHolder, String company, String legalPerson, String businessLicense, String accountBank, String account, String accountType, Long salesmanId, Byte status, Date createdAt, Date lastUpdate) {
        this.carDealerId = carDealerId;
        this.carDealerName = carDealerName;
        this.carDealerCode = carDealerCode;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
        this.contactCardId = contactCardId;
        this.carDealerAddress = carDealerAddress;
        this.carDealerDistrict = carDealerDistrict;
        this.detailedAddress = detailedAddress;
        this.carDealerType = carDealerType;
        this.accountHolder = accountHolder;
        this.company = company;
        this.legalPerson = legalPerson;
        this.businessLicense = businessLicense;
        this.accountBank = accountBank;
        this.account = account;
        this.accountType = accountType;
        this.salesmanId = salesmanId;
        this.status = status;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public CarDealer() {
        super();
    }

    /**
     * @return car_dealer_id
     */
    public String getCarDealerId() {
        return carDealerId;
    }

    /**
     * @param carDealerId
     */
    public void setCarDealerId(String carDealerId) {
        this.carDealerId = carDealerId == null ? null : carDealerId.trim();
    }

    /**
     * 获取车商名称
     *
     * @return car_dealer_name - 车商名称
     */
    public String getCarDealerName() {
        return carDealerName;
    }

    /**
     * 设置车商名称
     *
     * @param carDealerName 车商名称
     */
    public void setCarDealerName(String carDealerName) {
        this.carDealerName = carDealerName == null ? null : carDealerName.trim();
    }

    /**
     * 获取车商邀请码
     *
     * @return car_dealer_code - 车商邀请码
     */
    public String getCarDealerCode() {
        return carDealerCode;
    }

    /**
     * 设置车商邀请码
     *
     * @param carDealerCode 车商邀请码
     */
    public void setCarDealerCode(String carDealerCode) {
        this.carDealerCode = carDealerCode == null ? null : carDealerCode.trim();
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
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
     * @return contact_card_id
     */
    public String getContactCardId() {
        return contactCardId;
    }

    /**
     * @param contactCardId
     */
    public void setContactCardId(String contactCardId) {
        this.contactCardId = contactCardId == null ? null : contactCardId.trim();
    }

    /**
     * 获取车商地址
     *
     * @return car_dealer_address - 车商地址
     */
    public String getCarDealerAddress() {
        return carDealerAddress;
    }

    /**
     * 设置车商地址
     *
     * @param carDealerAddress 车商地址
     */
    public void setCarDealerAddress(String carDealerAddress) {
        this.carDealerAddress = carDealerAddress == null ? null : carDealerAddress.trim();
    }

    /**
     * 获取所属车市
     *
     * @return car_dealer_district - 所属车市
     */
    public String getCarDealerDistrict() {
        return carDealerDistrict;
    }

    /**
     * 设置所属车市
     *
     * @param carDealerDistrict 所属车市
     */
    public void setCarDealerDistrict(String carDealerDistrict) {
        this.carDealerDistrict = carDealerDistrict == null ? null : carDealerDistrict.trim();
    }

    /**
     * 获取详细地址
     *
     * @return detailed_address - 详细地址
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailedAddress 详细地址
     */
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    /**
     * 获取车商类型:0-个人 1-公司(为1时，公司名称，法人，营业执照为必输项)
     *
     * @return car_dealer_type - 车商类型:0-个人 1-公司(为1时，公司名称，法人，营业执照为必输项)
     */
    public Byte getCarDealerType() {
        return carDealerType;
    }

    /**
     * 设置车商类型:0-个人 1-公司(为1时，公司名称，法人，营业执照为必输项)
     *
     * @param carDealerType 车商类型:0-个人 1-公司(为1时，公司名称，法人，营业执照为必输项)
     */
    public void setCarDealerType(Byte carDealerType) {
        this.carDealerType = carDealerType;
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
     * 获取公司名称
     *
     * @return company - 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名称
     *
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 获取法人
     *
     * @return legal_person - 法人
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * 设置法人
     *
     * @param legalPerson 法人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    /**
     * 获取营业执照
     *
     * @return business_license - 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
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
     * 获取放款账户
     *
     * @return account - 放款账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置放款账户
     *
     * @param account 放款账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取账户类型0-对私 1-对公
     *
     * @return account_type - 账户类型0-对私 1-对公
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型0-对私 1-对公
     *
     * @param accountType 账户类型0-对私 1-对公
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取销售员id
     *
     * @return salesman_id - 销售员id
     */
    public Long getSalesmanId() {
        return salesmanId;
    }

    /**
     * 设置销售员id
     *
     * @param salesmanId 销售员id
     */
    public void setSalesmanId(Long salesmanId) {
        this.salesmanId = salesmanId;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
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