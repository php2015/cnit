package com.cnit.yoyo.model.news;

import java.io.Serializable;
import java.util.Date;

public class NewsContent implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.content_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private Integer contentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.news_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private Integer newsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.create_time
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.last_modify
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private Date lastModify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.length
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private Integer length;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news_content.content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_news_content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.content_id
     *
     * @return the value of t_news_content.content_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.content_id
     *
     * @param contentId the value for t_news_content.content_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.news_id
     *
     * @return the value of t_news_content.news_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.news_id
     *
     * @param newsId the value for t_news_content.news_id
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.create_time
     *
     * @return the value of t_news_content.create_time
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.create_time
     *
     * @param createTime the value for t_news_content.create_time
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.last_modify
     *
     * @return the value of t_news_content.last_modify
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public Date getLastModify() {
        return lastModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.last_modify
     *
     * @param lastModify the value for t_news_content.last_modify
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.length
     *
     * @return the value of t_news_content.length
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public Integer getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.length
     *
     * @param length the value for t_news_content.length
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news_content.content
     *
     * @return the value of t_news_content.content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news_content.content
     *
     * @param content the value for t_news_content.content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contentId=").append(contentId);
        sb.append(", newsId=").append(newsId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModify=").append(lastModify);
        sb.append(", length=").append(length);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        NewsContent other = (NewsContent) that;
        return (this.getContentId() == null ? other.getContentId() == null : this.getContentId().equals(other.getContentId()))
            && (this.getNewsId() == null ? other.getNewsId() == null : this.getNewsId().equals(other.getNewsId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_content
     *
     * @mbggenerated Tue Aug 18 15:36:39 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContentId() == null) ? 0 : getContentId().hashCode());
        result = prime * result + ((getNewsId() == null) ? 0 : getNewsId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastModify() == null) ? 0 : getLastModify().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}