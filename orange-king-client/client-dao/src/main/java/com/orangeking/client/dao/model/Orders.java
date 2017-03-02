package com.orangeking.client.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * 订单号
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 车商id
     */
    @Column(name = "car_dealer_id")
    private String carDealerId;

    /**
     * 贷款金额
     */
    @Column(name = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 授信额度
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 贷款期限
     */
    @Column(name = "loan_term")
    private Integer loanTerm;

    /**
     * 授信期限
     */
    @Column(name = "credit_term")
    private Integer creditTerm;

    /**
     * 车辆型号
     */
    @Column(name = "vehicle_type")
    private String vehicleType;

    /**
     * 交易价格
     */
    @Column(name = "transaction_price")
    private BigDecimal transactionPrice;

    /**
     * 销售员
     */
    @Column(name = "salesman_id")
    private Long salesmanId;

    /**
     * 订单状态:-1-已拒单,0-已申请 ,1-已面审,2-已风控,3-已签合同,4-已放款,5-已结清
     */
    private Byte status;

    /**
     * 拒绝理由
     */
    @Column(name = "refusal_reason")
    private String refusalReason;

    /**
     * 还款日
     */
    @Column(name = "repayment_date")
    private Integer repaymentDate;

    /**
     * 结清时间
     */
    @Column(name = "settle_time")
    private Date settleTime;

    /**
     * 申请时间
     */
    @Column(name = "apply_time")
    private Date applyTime;

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

    public Orders(String orderId, String userId, String carDealerId, BigDecimal loanAmount, BigDecimal creditAmount, Integer loanTerm, Integer creditTerm, String vehicleType, BigDecimal transactionPrice, Long salesmanId, Byte status, String refusalReason, Integer repaymentDate, Date settleTime, Date applyTime, Date createdAt, Date lastUpdate) {
        this.orderId = orderId;
        this.userId = userId;
        this.carDealerId = carDealerId;
        this.loanAmount = loanAmount;
        this.creditAmount = creditAmount;
        this.loanTerm = loanTerm;
        this.creditTerm = creditTerm;
        this.vehicleType = vehicleType;
        this.transactionPrice = transactionPrice;
        this.salesmanId = salesmanId;
        this.status = status;
        this.refusalReason = refusalReason;
        this.repaymentDate = repaymentDate;
        this.settleTime = settleTime;
        this.applyTime = applyTime;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public Orders() {
        super();
    }

    /**
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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
     * 获取车商id
     *
     * @return car_dealer_id - 车商id
     */
    public String getCarDealerId() {
        return carDealerId;
    }

    /**
     * 设置车商id
     *
     * @param carDealerId 车商id
     */
    public void setCarDealerId(String carDealerId) {
        this.carDealerId = carDealerId == null ? null : carDealerId.trim();
    }

    /**
     * 获取贷款金额
     *
     * @return loan_amount - 贷款金额
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * 设置贷款金额
     *
     * @param loanAmount 贷款金额
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 获取授信额度
     *
     * @return credit_amount - 授信额度
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置授信额度
     *
     * @param creditAmount 授信额度
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取贷款期限
     *
     * @return loan_term - 贷款期限
     */
    public Integer getLoanTerm() {
        return loanTerm;
    }

    /**
     * 设置贷款期限
     *
     * @param loanTerm 贷款期限
     */
    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 获取授信期限
     *
     * @return credit_term - 授信期限
     */
    public Integer getCreditTerm() {
        return creditTerm;
    }

    /**
     * 设置授信期限
     *
     * @param creditTerm 授信期限
     */
    public void setCreditTerm(Integer creditTerm) {
        this.creditTerm = creditTerm;
    }

    /**
     * 获取车辆型号
     *
     * @return vehicle_type - 车辆型号
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置车辆型号
     *
     * @param vehicleType 车辆型号
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    /**
     * 获取交易价格
     *
     * @return transaction_price - 交易价格
     */
    public BigDecimal getTransactionPrice() {
        return transactionPrice;
    }

    /**
     * 设置交易价格
     *
     * @param transactionPrice 交易价格
     */
    public void setTransactionPrice(BigDecimal transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    /**
     * 获取销售员
     *
     * @return salesman_id - 销售员
     */
    public Long getSalesmanId() {
        return salesmanId;
    }

    /**
     * 设置销售员
     *
     * @param salesmanId 销售员
     */
    public void setSalesmanId(Long salesmanId) {
        this.salesmanId = salesmanId;
    }

    /**
     * 获取订单状态:-1-已拒单,0-已申请 ,1-已面审,2-已风控,3-已签合同,4-已放款,5-已结清
     *
     * @return status - 订单状态:-1-已拒单,0-已申请 ,1-已面审,2-已风控,3-已签合同,4-已放款,5-已结清
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态:-1-已拒单,0-已申请 ,1-已面审,2-已风控,3-已签合同,4-已放款,5-已结清
     *
     * @param status 订单状态:-1-已拒单,0-已申请 ,1-已面审,2-已风控,3-已签合同,4-已放款,5-已结清
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取拒绝理由
     *
     * @return refusal_reason - 拒绝理由
     */
    public String getRefusalReason() {
        return refusalReason;
    }

    /**
     * 设置拒绝理由
     *
     * @param refusalReason 拒绝理由
     */
    public void setRefusalReason(String refusalReason) {
        this.refusalReason = refusalReason == null ? null : refusalReason.trim();
    }

    /**
     * 获取还款日
     *
     * @return repayment_date - 还款日
     */
    public Integer getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 设置还款日
     *
     * @param repaymentDate 还款日
     */
    public void setRepaymentDate(Integer repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 获取结清时间
     *
     * @return settle_time - 结清时间
     */
    public Date getSettleTime() {
        return settleTime;
    }

    /**
     * 设置结清时间
     *
     * @param settleTime 结清时间
     */
    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * 获取申请时间
     *
     * @return apply_time - 申请时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 设置申请时间
     *
     * @param applyTime 申请时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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