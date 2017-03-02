package com.orangeking.client.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "attachment_managed")
public class AttachmentManaged {
    /**
     * 主键
     */
    @Id
    @Column(name = "att_id")
    private Integer attId;

    /**
     * 对象唯一ID关联（用户、车商、订单)
     */
    @Column(name = "object_id")
    private String objectId;

    /**
     * 对象类型（用户、车商、订单) 等附件类型
     */
    @Column(name = "object_type")
    private Boolean objectType;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 访问文件的URI（本地或者远程）
     */
    private String uri;

    /**
     * 文件的MIME类型
     */
    private String filemime;

    /**
     * 文件大小
     */
    private String filesize;

    /**
     * 状态 0：无效 1：有效
     */
    private String status;

    /**
     * 附件创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 附件修改时间
     */
    @Column(name = "last_update")
    private Date lastUpdate;

    public AttachmentManaged(Integer attId, String objectId, Boolean objectType, String filename, String uri, String filemime, String filesize, String status, Date createdAt, Date lastUpdate) {
        this.attId = attId;
        this.objectId = objectId;
        this.objectType = objectType;
        this.filename = filename;
        this.uri = uri;
        this.filemime = filemime;
        this.filesize = filesize;
        this.status = status;
        this.createdAt = createdAt;
        this.lastUpdate = lastUpdate;
    }

    public AttachmentManaged() {
        super();
    }

    /**
     * 获取主键
     *
     * @return att_id - 主键
     */
    public Integer getAttId() {
        return attId;
    }

    /**
     * 设置主键
     *
     * @param attId 主键
     */
    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    /**
     * 获取对象唯一ID关联（用户、车商、订单)
     *
     * @return object_id - 对象唯一ID关联（用户、车商、订单)
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * 设置对象唯一ID关联（用户、车商、订单)
     *
     * @param objectId 对象唯一ID关联（用户、车商、订单)
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    /**
     * 获取对象类型（用户、车商、订单) 等附件类型
     *
     * @return object_type - 对象类型（用户、车商、订单) 等附件类型
     */
    public Boolean getObjectType() {
        return objectType;
    }

    /**
     * 设置对象类型（用户、车商、订单) 等附件类型
     *
     * @param objectType 对象类型（用户、车商、订单) 等附件类型
     */
    public void setObjectType(Boolean objectType) {
        this.objectType = objectType;
    }

    /**
     * 获取文件名
     *
     * @return filename - 文件名
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名
     *
     * @param filename 文件名
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * 获取访问文件的URI（本地或者远程）
     *
     * @return uri - 访问文件的URI（本地或者远程）
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置访问文件的URI（本地或者远程）
     *
     * @param uri 访问文件的URI（本地或者远程）
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * 获取文件的MIME类型
     *
     * @return filemime - 文件的MIME类型
     */
    public String getFilemime() {
        return filemime;
    }

    /**
     * 设置文件的MIME类型
     *
     * @param filemime 文件的MIME类型
     */
    public void setFilemime(String filemime) {
        this.filemime = filemime == null ? null : filemime.trim();
    }

    /**
     * 获取文件大小
     *
     * @return filesize - 文件大小
     */
    public String getFilesize() {
        return filesize;
    }

    /**
     * 设置文件大小
     *
     * @param filesize 文件大小
     */
    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    /**
     * 获取状态 0：无效 1：有效
     *
     * @return status - 状态 0：无效 1：有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 0：无效 1：有效
     *
     * @param status 状态 0：无效 1：有效
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取附件创建时间
     *
     * @return created_at - 附件创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置附件创建时间
     *
     * @param createdAt 附件创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取附件修改时间
     *
     * @return last_update - 附件修改时间
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置附件修改时间
     *
     * @param lastUpdate 附件修改时间
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}