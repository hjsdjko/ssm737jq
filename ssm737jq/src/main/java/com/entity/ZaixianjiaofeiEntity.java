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
 * 在线缴费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
@TableName("zaixianjiaofei")
public class ZaixianjiaofeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZaixianjiaofeiEntity() {
		
	}
	
	public ZaixianjiaofeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 学费
	 */
					
	private Float xuefei;
	
	/**
	 * 住宿费
	 */
					
	private Float zhusufei;
	
	/**
	 * 水费
	 */
					
	private Float shuifei;
	
	/**
	 * 电费
	 */
					
	private Float dianfei;
	
	/**
	 * 总费用
	 */
					
	private Float zongfeiyong;
	
	/**
	 * 缴费时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiaofeishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：学费
	 */
	public void setXuefei(Float xuefei) {
		this.xuefei = xuefei;
	}
	/**
	 * 获取：学费
	 */
	public Float getXuefei() {
		return xuefei;
	}
	/**
	 * 设置：住宿费
	 */
	public void setZhusufei(Float zhusufei) {
		this.zhusufei = zhusufei;
	}
	/**
	 * 获取：住宿费
	 */
	public Float getZhusufei() {
		return zhusufei;
	}
	/**
	 * 设置：水费
	 */
	public void setShuifei(Float shuifei) {
		this.shuifei = shuifei;
	}
	/**
	 * 获取：水费
	 */
	public Float getShuifei() {
		return shuifei;
	}
	/**
	 * 设置：电费
	 */
	public void setDianfei(Float dianfei) {
		this.dianfei = dianfei;
	}
	/**
	 * 获取：电费
	 */
	public Float getDianfei() {
		return dianfei;
	}
	/**
	 * 设置：总费用
	 */
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
	}
	/**
	 * 设置：缴费时间
	 */
	public void setJiaofeishijian(Date jiaofeishijian) {
		this.jiaofeishijian = jiaofeishijian;
	}
	/**
	 * 获取：缴费时间
	 */
	public Date getJiaofeishijian() {
		return jiaofeishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}