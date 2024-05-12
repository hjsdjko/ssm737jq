package com.entity.view;

import com.entity.DiscussshizililiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师资力量评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
@TableName("discussshizililiang")
public class DiscussshizililiangView  extends DiscussshizililiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshizililiangView(){
	}
 
 	public DiscussshizililiangView(DiscussshizililiangEntity discussshizililiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussshizililiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
