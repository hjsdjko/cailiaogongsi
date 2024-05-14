package com.entity.view;

import com.entity.CailiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 材料
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cailiao")
public class CailiaoView extends CailiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 材料类型的值
		*/
		private String cailiaoValue;



		//级联表 cangku
			/**
			* 仓库 的 用户
			*/
			private Integer cangkuYonghuId;
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
				* 仓库类型的值
				*/
				private String cangkuValue;
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

		//级联表 yonghu
			/**
			* 用户编号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 年龄
			*/
			private Integer age;
			/**
			* 学历
			*/
			private Integer xueliTypes;
				/**
				* 学历的值
				*/
				private String xueliValue;
			/**
			* 毕业学校
			*/
			private String yonghuXuexiao;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public CailiaoView() {

	}

	public CailiaoView(CailiaoEntity cailiaoEntity) {
		try {
			BeanUtils.copyProperties(this, cailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 材料类型的值
			*/
			public String getCailiaoValue() {
				return cailiaoValue;
			}
			/**
			* 设置： 材料类型的值
			*/
			public void setCailiaoValue(String cailiaoValue) {
				this.cailiaoValue = cailiaoValue;
			}








				//级联表的get和set cangku

					/**
					* 获取：仓库 的 用户
					*/
					public Integer getCangkuYonghuId() {
						return cangkuYonghuId;
					}
					/**
					* 设置：仓库 的 用户
					*/
					public void setCangkuYonghuId(Integer cangkuYonghuId) {
						this.cangkuYonghuId = cangkuYonghuId;
					}


					/**
					* 获取： 仓库编号
					*/
					public String getCangkuUuidNumber() {
						return cangkuUuidNumber;
					}
					/**
					* 设置： 仓库编号
					*/
					public void setCangkuUuidNumber(String cangkuUuidNumber) {
						this.cangkuUuidNumber = cangkuUuidNumber;
					}

					/**
					* 获取： 仓库名称
					*/
					public String getCangkuName() {
						return cangkuName;
					}
					/**
					* 设置： 仓库名称
					*/
					public void setCangkuName(String cangkuName) {
						this.cangkuName = cangkuName;
					}

					/**
					* 获取： 仓库照片
					*/
					public String getCangkuPhoto() {
						return cangkuPhoto;
					}
					/**
					* 设置： 仓库照片
					*/
					public void setCangkuPhoto(String cangkuPhoto) {
						this.cangkuPhoto = cangkuPhoto;
					}

					/**
					* 获取： 仓库类型
					*/
					public Integer getCangkuTypes() {
						return cangkuTypes;
					}
					/**
					* 设置： 仓库类型
					*/
					public void setCangkuTypes(Integer cangkuTypes) {
						this.cangkuTypes = cangkuTypes;
					}


						/**
						* 获取： 仓库类型的值
						*/
						public String getCangkuValue() {
							return cangkuValue;
						}
						/**
						* 设置： 仓库类型的值
						*/
						public void setCangkuValue(String cangkuValue) {
							this.cangkuValue = cangkuValue;
						}

					/**
					* 获取： 仓库面积(平米)
					*/
					public Double getCangkuMianji() {
						return cangkuMianji;
					}
					/**
					* 设置： 仓库面积(平米)
					*/
					public void setCangkuMianji(Double cangkuMianji) {
						this.cangkuMianji = cangkuMianji;
					}

					/**
					* 获取： 仓库介绍
					*/
					public String getCangkuContent() {
						return cangkuContent;
					}
					/**
					* 设置： 仓库介绍
					*/
					public void setCangkuContent(String cangkuContent) {
						this.cangkuContent = cangkuContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getCangkuDelete() {
						return cangkuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setCangkuDelete(Integer cangkuDelete) {
						this.cangkuDelete = cangkuDelete;
					}








				//级联表的get和set yonghu

					/**
					* 获取： 用户编号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 用户编号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 年龄
					*/
					public Integer getAge() {
						return age;
					}
					/**
					* 设置： 年龄
					*/
					public void setAge(Integer age) {
						this.age = age;
					}

					/**
					* 获取： 学历
					*/
					public Integer getXueliTypes() {
						return xueliTypes;
					}
					/**
					* 设置： 学历
					*/
					public void setXueliTypes(Integer xueliTypes) {
						this.xueliTypes = xueliTypes;
					}


						/**
						* 获取： 学历的值
						*/
						public String getXueliValue() {
							return xueliValue;
						}
						/**
						* 设置： 学历的值
						*/
						public void setXueliValue(String xueliValue) {
							this.xueliValue = xueliValue;
						}

					/**
					* 获取： 毕业学校
					*/
					public String getYonghuXuexiao() {
						return yonghuXuexiao;
					}
					/**
					* 设置： 毕业学校
					*/
					public void setYonghuXuexiao(String yonghuXuexiao) {
						this.yonghuXuexiao = yonghuXuexiao;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}




}
