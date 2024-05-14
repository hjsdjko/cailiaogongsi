package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 材料
 *
 * @author 
 * @email
 */
@TableName("cailiao")
public class CailiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CailiaoEntity() {

	}

	public CailiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 仓库
     */
    @TableField(value = "cangku_id")

    private Integer cangkuId;


    /**
     * 材料编号
     */
    @TableField(value = "cailiao_uuid_number")

    private String cailiaoUuidNumber;


    /**
     * 材料名称
     */
    @TableField(value = "cailiao_name")

    private String cailiaoName;


    /**
     * 材料照片
     */
    @TableField(value = "cailiao_photo")

    private String cailiaoPhoto;


    /**
     * 材料类型
     */
    @TableField(value = "cailiao_types")

    private Integer cailiaoTypes;


    /**
     * 材料数量
     */
    @TableField(value = "cailiao_number")

    private Integer cailiaoNumber;


    /**
     * 材料介绍
     */
    @TableField(value = "cailiao_content")

    private String cailiaoContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "cailiao_delete")

    private Integer cailiaoDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：仓库
	 */
    public Integer getCangkuId() {
        return cangkuId;
    }
    /**
	 * 获取：仓库
	 */

    public void setCangkuId(Integer cangkuId) {
        this.cangkuId = cangkuId;
    }
    /**
	 * 设置：材料编号
	 */
    public String getCailiaoUuidNumber() {
        return cailiaoUuidNumber;
    }
    /**
	 * 获取：材料编号
	 */

    public void setCailiaoUuidNumber(String cailiaoUuidNumber) {
        this.cailiaoUuidNumber = cailiaoUuidNumber;
    }
    /**
	 * 设置：材料名称
	 */
    public String getCailiaoName() {
        return cailiaoName;
    }
    /**
	 * 获取：材料名称
	 */

    public void setCailiaoName(String cailiaoName) {
        this.cailiaoName = cailiaoName;
    }
    /**
	 * 设置：材料照片
	 */
    public String getCailiaoPhoto() {
        return cailiaoPhoto;
    }
    /**
	 * 获取：材料照片
	 */

    public void setCailiaoPhoto(String cailiaoPhoto) {
        this.cailiaoPhoto = cailiaoPhoto;
    }
    /**
	 * 设置：材料类型
	 */
    public Integer getCailiaoTypes() {
        return cailiaoTypes;
    }
    /**
	 * 获取：材料类型
	 */

    public void setCailiaoTypes(Integer cailiaoTypes) {
        this.cailiaoTypes = cailiaoTypes;
    }
    /**
	 * 设置：材料数量
	 */
    public Integer getCailiaoNumber() {
        return cailiaoNumber;
    }
    /**
	 * 获取：材料数量
	 */

    public void setCailiaoNumber(Integer cailiaoNumber) {
        this.cailiaoNumber = cailiaoNumber;
    }
    /**
	 * 设置：材料介绍
	 */
    public String getCailiaoContent() {
        return cailiaoContent;
    }
    /**
	 * 获取：材料介绍
	 */

    public void setCailiaoContent(String cailiaoContent) {
        this.cailiaoContent = cailiaoContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCailiaoDelete() {
        return cailiaoDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setCailiaoDelete(Integer cailiaoDelete) {
        this.cailiaoDelete = cailiaoDelete;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 获取：最后更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Cailiao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", cangkuId=" + cangkuId +
            ", cailiaoUuidNumber=" + cailiaoUuidNumber +
            ", cailiaoName=" + cailiaoName +
            ", cailiaoPhoto=" + cailiaoPhoto +
            ", cailiaoTypes=" + cailiaoTypes +
            ", cailiaoNumber=" + cailiaoNumber +
            ", cailiaoContent=" + cailiaoContent +
            ", cailiaoDelete=" + cailiaoDelete +
            ", insertTime=" + insertTime +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
