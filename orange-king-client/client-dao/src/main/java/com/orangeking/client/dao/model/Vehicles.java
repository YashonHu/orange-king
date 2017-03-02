package com.orangeking.client.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 车辆品牌
     */
    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    /**
     * 车辆类型
     */
    @Column(name = "vehicle_type")
    private String vehicleType;

    /**
     * 车辆配置
     */
    @Column(name = "vehicle_config")
    private String vehicleConfig;

    /**
     * 公里数（公里）
     */
    private BigDecimal miles;

    @Column(name = "vin_no")
    private String vinNo;

    /**
     * 首次上牌日期
     */
    @Column(name = "first_card_date")
    private Date firstCardDate;

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

    public Vehicles(Long id, String orderId, String vehicleBrand, String vehicleType, String vehicleConfig, BigDecimal miles, String vinNo, Date firstCardDate, Date createdAt, Date lastUpdate) {
        this.id = id;
        this.orderId = orderId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleType = vehicleType;
        this.vehicleConfig = vehicleConfig;
        this.miles = miles;
        this.vinNo = vinNo;
        this.firstCardDate = firstCardDate;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public Vehicles() {
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
     * 获取车辆品牌
     *
     * @return vehicle_brand - 车辆品牌
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * 设置车辆品牌
     *
     * @param vehicleBrand 车辆品牌
     */
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand == null ? null : vehicleBrand.trim();
    }

    /**
     * 获取车辆类型
     *
     * @return vehicle_type - 车辆类型
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置车辆类型
     *
     * @param vehicleType 车辆类型
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    /**
     * 获取车辆配置
     *
     * @return vehicle_config - 车辆配置
     */
    public String getVehicleConfig() {
        return vehicleConfig;
    }

    /**
     * 设置车辆配置
     *
     * @param vehicleConfig 车辆配置
     */
    public void setVehicleConfig(String vehicleConfig) {
        this.vehicleConfig = vehicleConfig == null ? null : vehicleConfig.trim();
    }

    /**
     * 获取公里数（公里）
     *
     * @return miles - 公里数（公里）
     */
    public BigDecimal getMiles() {
        return miles;
    }

    /**
     * 设置公里数（公里）
     *
     * @param miles 公里数（公里）
     */
    public void setMiles(BigDecimal miles) {
        this.miles = miles;
    }

    /**
     * @return vin_no
     */
    public String getVinNo() {
        return vinNo;
    }

    /**
     * @param vinNo
     */
    public void setVinNo(String vinNo) {
        this.vinNo = vinNo == null ? null : vinNo.trim();
    }

    /**
     * 获取首次上牌日期
     *
     * @return first_card_date - 首次上牌日期
     */
    public Date getFirstCardDate() {
        return firstCardDate;
    }

    /**
     * 设置首次上牌日期
     *
     * @param firstCardDate 首次上牌日期
     */
    public void setFirstCardDate(Date firstCardDate) {
        this.firstCardDate = firstCardDate;
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