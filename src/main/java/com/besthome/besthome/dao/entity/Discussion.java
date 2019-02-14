package com.besthome.besthome.dao.entity;

import java.util.Date;

public class Discussion {
    private Integer id;

    private Integer contentId;

    private String discussion;

    private String discussPersion;

    private Integer agreeCount;

    private Integer disAgreeCount;

    private Date createTime;

    private Date updateTime;

    private String isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion == null ? null : discussion.trim();
    }

    public String getDiscussPersion() {
        return discussPersion;
    }

    public void setDiscussPersion(String discussPersion) {
        this.discussPersion = discussPersion == null ? null : discussPersion.trim();
    }

    public Integer getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(Integer agreeCount) {
        this.agreeCount = agreeCount;
    }

    public Integer getDisAgreeCount() {
        return disAgreeCount;
    }

    public void setDisAgreeCount(Integer disAgreeCount) {
        this.disAgreeCount = disAgreeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contentId=").append(contentId);
        sb.append(", discussion=").append(discussion);
        sb.append(", discussPersion=").append(discussPersion);
        sb.append(", agreeCount=").append(agreeCount);
        sb.append(", disAgreeCount=").append(disAgreeCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}