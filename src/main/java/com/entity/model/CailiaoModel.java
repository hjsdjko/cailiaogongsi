package com.entity.model;

import com.entity.CailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 材料
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CailiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 仓库
     */
    private Integer cangkuId;


    /**
     * 材料编号
     */
    private String cailiaoUuidNumber;


    /**
     * 材料名称
     */
    private String cailiaoName;


    /**
     * 材料照片
     */
    private String cailiaoPhoto;


    /**
     * 材料类型
     */
    private Integer cailiaoTypes;


    /**
     * 材料数量
     */
    private Integer cailiaoNumber;


    /**
     * 材料介绍
     */
    private String cailiaoContent;


    /**
     * 逻辑删除
     */
    private Integer cailiaoDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：仓库
	 */
    public Integer getCangkuId() {
        return cangkuId;
    }


    /**
	 * 设置：仓库
	 */
    public void setCangkuId(Integer cangkuId) {
        this.cangkuId = cangkuId;
    }
    /**
	 * 获取：材料编号
	 */
    public String getCailiaoUuidNumber() {
        return cailiaoUuidNumber;
    }


    /**
	 * 设置：材料编号
	 */
    public void setCailiaoUuidNumber(String cailiaoUuidNumber) {
        this.cailiaoUuidNumber = cailiaoUuidNumber;
    }
    /**
	 * 获取：材料名称
	 */
    public String getCailiaoName() {
        return cailiaoName;
    }


    /**
	 * 设置：材料名称
	 */
    public void setCailiaoName(String cailiaoName) {
        this.cailiaoName = cailiaoName;
    }
    /**
	 * 获取：材料照片
	 */
    public String getCailiaoPhoto() {
        return cailiaoPhoto;
    }


    /**
	 * 设置：材料照片
	 */
    public void setCailiaoPhoto(String cailiaoPhoto) {
        this.cailiaoPhoto = cailiaoPhoto;
    }
    /**
	 * 获取：材料类型
	 */
    public Integer getCailiaoTypes() {
        return cailiaoTypes;
    }


    /**
	 * 设置：材料类型
	 */
    public void setCailiaoTypes(Integer cailiaoTypes) {
        this.cailiaoTypes = cailiaoTypes;
    }
    /**
	 * 获取：材料数量
	 */
    public Integer getCailiaoNumber() {
        return cailiaoNumber;
    }


    /**
	 * 设置：材料数量
	 */
    public void setCailiaoNumber(Integer cailiaoNumber) {
        this.cailiaoNumber = cailiaoNumber;
    }
    /**
	 * 获取：材料介绍
	 */
    public String getCailiaoContent() {
        return cailiaoContent;
    }


    /**
	 * 设置：材料介绍
	 */
    public void setCailiaoContent(String cailiaoContent) {
        this.cailiaoContent = cailiaoContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getCailiaoDelete() {
        return cailiaoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setCailiaoDelete(Integer cailiaoDelete) {
        this.cailiaoDelete = cailiaoDelete;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：最后更新时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
