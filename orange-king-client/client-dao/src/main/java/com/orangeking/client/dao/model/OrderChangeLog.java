package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_change_log")
public class OrderChangeLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 修改状态
     */
    @Column(name = "change_status")
    private Byte changeStatus;

    /**
     * 备注
     */
    private String note;

    /**
     * 操作人员
     */
    private Long operator;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    public OrderChangeLog(Long id, String orderId, Byte changeStatus, String note, Long operator, Date createdAt) {
        this.id = id;
        this.orderId = orderId;
        this.changeStatus = changeStatus;
        this.note = note;
        this.operator = operator;
        this.createdAt = createdAt;
    }

    public OrderChangeLog() {
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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取修改状态
     *
     * @return change_status - 修改状态
     */
    public Byte getChangeStatus() {
        return changeStatus;
    }

    /**
     * 设置修改状态
     *
     * @param changeStatus 修改状态
     */
    public void setChangeStatus(Byte changeStatus) {
        this.changeStatus = changeStatus;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取操作人员
     *
     * @return operator - 操作人员
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * 设置操作人员
     *
     * @param operator 操作人员
     */
    public void setOperator(Long operator) {
        this.operator = operator;
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
}