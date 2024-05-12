package com.entity.view;

import com.entity.ZaixianjiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
@TableName("zaixianjiaofei")
public class ZaixianjiaofeiView  extends ZaixianjiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixianjiaofeiView(){
	}
 
 	public ZaixianjiaofeiView(ZaixianjiaofeiEntity zaixianjiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, zaixianjiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
