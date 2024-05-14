package com.entity.model;

import com.entity.CangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 仓库
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CangkuModel implements Serializable {
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
     * 仓库编号
     */
    private String cangkuUuidNumber;


    /**
     * 仓库名称
     */
    private String cangkuName;


    /**
     * 仓库照片
     */
    private String cangkuPhoto;


    /**
     * 仓库类型
     */
    private Integer cangkuTypes;


    /**
     * 仓库面积(平米)
     */
    private Double cangkuMianji;


    /**
     * 仓库介绍
     */
    private String cangkuContent;


    /**
     * 逻辑删除
     */
    private Integer cangkuDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：仓库编号
	 */
    public String getCangkuUuidNumber() {
        return cangkuUuidNumber;
    }


    /**
	 * 设置：仓库编号
	 */
    public void setCangkuUuidNumber(String cangkuUuidNumber) {
        this.cangkuUuidNumber = cangkuUuidNumber;
    }
    /**
	 * 获取：仓库名称
	 */
    public String getCangkuName() {
        return cangkuName;
    }


    /**
	 * 设置：仓库名称
	 */
    public void setCangkuName(String cangkuName) {
        this.cangkuName = cangkuName;
    }
    /**
	 * 获取：仓库照片
	 */
    public String getCangkuPhoto() {
        return cangkuPhoto;
    }


    /**
	 * 设置：仓库照片
	 */
    public void setCangkuPhoto(String cangkuPhoto) {
        this.cangkuPhoto = cangkuPhoto;
    }
    /**
	 * 获取：仓库类型
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }


    /**
	 * 设置：仓库类型
	 */
    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 获取：仓库面积(平米)
	 */
    public Double getCangkuMianji() {
        return cangkuMianji;
    }


    /**
	 * 设置：仓库面积(平米)
	 */
    public void setCangkuMianji(Double cangkuMianji) {
        this.cangkuMianji = cangkuMianji;
    }
    /**
	 * 获取：仓库介绍
	 */
    public String getCangkuContent() {
        return cangkuContent;
    }


    /**
	 * 设置：仓库介绍
	 */
    public void setCangkuContent(String cangkuContent) {
        this.cangkuContent = cangkuContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getCangkuDelete() {
        return cangkuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setCangkuDelete(Integer cangkuDelete) {
        this.cangkuDelete = cangkuDelete;
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
