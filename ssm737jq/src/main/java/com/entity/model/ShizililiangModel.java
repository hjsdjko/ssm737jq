package com.entity.model;

import com.entity.ShizililiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 师资力量
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public class ShizililiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 教学时间
	 */
	
	private String jiaoxueshijian;
		
	/**
	 * 个人事迹
	 */
	
	private String gerenshiji;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：教学时间
	 */
	 
	public void setJiaoxueshijian(String jiaoxueshijian) {
		this.jiaoxueshijian = jiaoxueshijian;
	}
	
	/**
	 * 获取：教学时间
	 */
	public String getJiaoxueshijian() {
		return jiaoxueshijian;
	}
				
	
	/**
	 * 设置：个人事迹
	 */
	 
	public void setGerenshiji(String gerenshiji) {
		this.gerenshiji = gerenshiji;
	}
	
	/**
	 * 获取：个人事迹
	 */
	public String getGerenshiji() {
		return gerenshiji;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
