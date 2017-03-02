package com.orangeking.client.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_bill")
public class UserBill {
    @Id
    @Column(name = "bill_id")
    private Long billId;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 期数
     */
    private Integer stage;

    /**
     * 总期数
     */
    @Column(name = "total_stage")
    private Integer totalStage;

    /**
     * 账单本金金额
     */
    @Column(name = "bill_capital")
    private BigDecimal billCapital;

    /**
     * 账单利息金额
     */
    @Column(name = "bill_interest")
    private BigDecimal billInterest;

    /**
     * 还款本金
     */
    @Column(name = "repay_capital")
    private BigDecimal repayCapital;

    /**
     * 还款利息
     */
    @Column(name = "repay_interest")
    private BigDecimal repayInterest;

    /**
     * 账单总金额
     */
    @Column(name = "bill_total_amount")
    private BigDecimal billTotalAmount;

    /**
     * 还款总金额
     */
    @Column(name = "repay_total_amount")
    private BigDecimal repayTotalAmount;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 还款流水
     */
    @Column(name = "repay_serial")
    private Long repaySerial;

    /**
     * 滞纳金
     */
    @Column(name = "late_fee")
    private BigDecimal lateFee;

    /**
     * 账单状态：0-未还款,1-已结清,2-已逾期,3-已逾期结清,4-提前还款,5-催收结清
     */
    private Byte status;

    /**
     * 还款时间
     */
    @Column(name = "repay_time")
    private Date repayTime;

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

    public UserBill(Long billId, String orderId, Integer stage, Integer totalStage, BigDecimal billCapital, BigDecimal billInterest, BigDecimal repayCapital, BigDecimal repayInterest, BigDecimal billTotalAmount, BigDecimal repayTotalAmount, BigDecimal fee, Long repaySerial, BigDecimal lateFee, Byte status, Date repayTime, Date createdAt, Date lastUpdate) {
        this.billId = billId;
        this.orderId = orderId;
        this.stage = stage;
        this.totalStage = totalStage;
        this.billCapital = billCapital;
        this.billInterest = billInterest;
        this.repayCapital = repayCapital;
        this.repayInterest = repayInterest;
        this.billTotalAmount = billTotalAmount;
        this.repayTotalAmount = repayTotalAmount;
        this.fee = fee;
        this.repaySerial = repaySerial;
        this.lateFee = lateFee;
        this.status = status;
        this.repayTime = repayTime;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public UserBill() {
        super();
    }

    /**
     * @return bill_id
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * @param billId
     */
    public void setBillId(Long billId) {
        this.billId = billId;
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
     * 获取期数
     *
     * @return stage - 期数
     */
    public Integer getStage() {
        return stage;
    }

    /**
     * 设置期数
     *
     * @param stage 期数
     */
    public void setStage(Integer stage) {
        this.stage = stage;
    }

    /**
     * 获取总期数
     *
     * @return total_stage - 总期数
     */
    public Integer getTotalStage() {
        return totalStage;
    }

    /**
     * 设置总期数
     *
     * @param totalStage 总期数
     */
    public void setTotalStage(Integer totalStage) {
        this.totalStage = totalStage;
    }

    /**
     * 获取账单本金金额
     *
     * @return bill_capital - 账单本金金额
     */
    public BigDecimal getBillCapital() {
        return billCapital;
    }

    /**
     * 设置账单本金金额
     *
     * @param billCapital 账单本金金额
     */
    public void setBillCapital(BigDecimal billCapital) {
        this.billCapital = billCapital;
    }

    /**
     * 获取账单利息金额
     *
     * @return bill_interest - 账单利息金额
     */
    public BigDecimal getBillInterest() {
        return billInterest;
    }

    /**
     * 设置账单利息金额
     *
     * @param billInterest 账单利息金额
     */
    public void setBillInterest(BigDecimal billInterest) {
        this.billInterest = billInterest;
    }

    /**
     * 获取还款本金
     *
     * @return repay_capital - 还款本金
     */
    public BigDecimal getRepayCapital() {
        return repayCapital;
    }

    /**
     * 设置还款本金
     *
     * @param repayCapital 还款本金
     */
    public void setRepayCapital(BigDecimal repayCapital) {
        this.repayCapital = repayCapital;
    }

    /**
     * 获取还款利息
     *
     * @return repay_interest - 还款利息
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * 设置还款利息
     *
     * @param repayInterest 还款利息
     */
    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

    /**
     * 获取账单总金额
     *
     * @return bill_total_amount - 账单总金额
     */
    public BigDecimal getBillTotalAmount() {
        return billTotalAmount;
    }

    /**
     * 设置账单总金额
     *
     * @param billTotalAmount 账单总金额
     */
    public void setBillTotalAmount(BigDecimal billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }

    /**
     * 获取还款总金额
     *
     * @return repay_total_amount - 还款总金额
     */
    public BigDecimal getRepayTotalAmount() {
        return repayTotalAmount;
    }

    /**
     * 设置还款总金额
     *
     * @param repayTotalAmount 还款总金额
     */
    public void setRepayTotalAmount(BigDecimal repayTotalAmount) {
        this.repayTotalAmount = repayTotalAmount;
    }

    /**
     * 获取手续费
     *
     * @return fee - 手续费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置手续费
     *
     * @param fee 手续费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取还款流水
     *
     * @return repay_serial - 还款流水
     */
    public Long getRepaySerial() {
        return repaySerial;
    }

    /**
     * 设置还款流水
     *
     * @param repaySerial 还款流水
     */
    public void setRepaySerial(Long repaySerial) {
        this.repaySerial = repaySerial;
    }

    /**
     * 获取滞纳金
     *
     * @return late_fee - 滞纳金
     */
    public BigDecimal getLateFee() {
        return lateFee;
    }

    /**
     * 设置滞纳金
     *
     * @param lateFee 滞纳金
     */
    public void setLateFee(BigDecimal lateFee) {
        this.lateFee = lateFee;
    }

    /**
     * 获取账单状态：0-未还款,1-已结清,2-已逾期,3-已逾期结清,4-提前还款,5-催收结清
     *
     * @return status - 账单状态：0-未还款,1-已结清,2-已逾期,3-已逾期结清,4-提前还款,5-催收结清
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置账单状态：0-未还款,1-已结清,2-已逾期,3-已逾期结清,4-提前还款,5-催收结清
     *
     * @param status 账单状态：0-未还款,1-已结清,2-已逾期,3-已逾期结清,4-提前还款,5-催收结清
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取还款时间
     *
     * @return repay_time - 还款时间
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * 设置还款时间
     *
     * @param repayTime 还款时间
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
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