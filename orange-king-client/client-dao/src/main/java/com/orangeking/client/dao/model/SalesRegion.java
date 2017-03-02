package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sales_region")
public class SalesRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "district_code")
    private String districtCode;

    private String describe;

    @Column(name = "district_type")
    private String districtType;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "last_update")
    private Date lastUpdate;

    public SalesRegion(Long id, String districtCode, String describe, String districtType, String parentId, Date createdAt, Date lastUpdate) {
        this.id = id;
        this.districtCode = districtCode;
        this.describe = describe;
        this.districtType = districtType;
        this.parentId = parentId;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public SalesRegion() {
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
     * @return district_code
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * @param districtCode
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    /**
     * @return describe
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * @param describe
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * @return district_type
     */
    public String getDistrictType() {
        return districtType;
    }

    /**
     * @param districtType
     */
    public void setDistrictType(String districtType) {
        this.districtType = districtType == null ? null : districtType.trim();
    }

    /**
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}