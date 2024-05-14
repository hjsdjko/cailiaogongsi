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
 * 仓库
 *
 * @author 
 * @email
 */
@TableName("cangku")
public class CangkuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CangkuEntity() {

	}

	public CangkuEntity(T t) {
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
     * 仓库编号
     */
    @TableField(value = "cangku_uuid_number")

    private String cangkuUuidNumber;


    /**
     * 仓库名称
     */
    @TableField(value = "cangku_name")

    private String cangkuName;


    /**
     * 仓库照片
     */
    @TableField(value = "cangku_photo")

    private String cangkuPhoto;


    /**
     * 仓库类型
     */
    @TableField(value = "cangku_types")

    private Integer cangkuTypes;


    /**
     * 仓库面积(平米)
     */
    @TableField(value = "cangku_mianji")

    private Double cangkuMianji;


    /**
     * 仓库介绍
     */
    @TableField(value = "cangku_content")

    private String cangkuContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "cangku_delete")

    private Integer cangkuDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：仓库编号
	 */
    public String getCangkuUuidNumber() {
        return cangkuUuidNumber;
    }
    /**
	 * 获取：仓库编号
	 */

    public void setCangkuUuidNumber(String cangkuUuidNumber) {
        this.cangkuUuidNumber = cangkuUuidNumber;
    }
    /**
	 * 设置：仓库名称
	 */
    public String getCangkuName() {
        return cangkuName;
    }
    /**
	 * 获取：仓库名称
	 */

    public void setCangkuName(String cangkuName) {
        this.cangkuName = cangkuName;
    }
    /**
	 * 设置：仓库照片
	 */
    public String getCangkuPhoto() {
        return cangkuPhoto;
    }
    /**
	 * 获取：仓库照片
	 */

    public void setCangkuPhoto(String cangkuPhoto) {
        this.cangkuPhoto = cangkuPhoto;
    }
    /**
	 * 设置：仓库类型
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }
    /**
	 * 获取：仓库类型
	 */

    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 设置：仓库面积(平米)
	 */
    public Double getCangkuMianji() {
        return cangkuMianji;
    }
    /**
	 * 获取：仓库面积(平米)
	 */

    public void setCangkuMianji(Double cangkuMianji) {
        this.cangkuMianji = cangkuMianji;
    }
    /**
	 * 设置：仓库介绍
	 */
    public String getCangkuContent() {
        return cangkuContent;
    }
    /**
	 * 获取：仓库介绍
	 */

    public void setCangkuContent(String cangkuContent) {
        this.cangkuContent = cangkuContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCangkuDelete() {
        return cangkuDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setCangkuDelete(Integer cangkuDelete) {
        this.cangkuDelete = cangkuDelete;
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
        return "Cangku{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", cangkuUuidNumber=" + cangkuUuidNumber +
            ", cangkuName=" + cangkuName +
            ", cangkuPhoto=" + cangkuPhoto +
            ", cangkuTypes=" + cangkuTypes +
            ", cangkuMianji=" + cangkuMianji +
            ", cangkuContent=" + cangkuContent +
            ", cangkuDelete=" + cangkuDelete +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
