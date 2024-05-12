package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoshifenpeiEntity;
import com.entity.view.JiaoshifenpeiView;

import com.service.JiaoshifenpeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 教室分配
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
@RestController
@RequestMapping("/jiaoshifenpei")
public class JiaoshifenpeiController {
    @Autowired
    private JiaoshifenpeiService jiaoshifenpeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshifenpeiEntity jiaoshifenpei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jiaoshifenpei.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshifenpeiEntity> ew = new EntityWrapper<JiaoshifenpeiEntity>();
		PageUtils page = jiaoshifenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshifenpei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshifenpeiEntity jiaoshifenpei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jiaoshifenpei.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshifenpeiEntity> ew = new EntityWrapper<JiaoshifenpeiEntity>();
		PageUtils page = jiaoshifenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshifenpei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshifenpeiEntity jiaoshifenpei){
       	EntityWrapper<JiaoshifenpeiEntity> ew = new EntityWrapper<JiaoshifenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshifenpei, "jiaoshifenpei")); 
        return R.ok().put("data", jiaoshifenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshifenpeiEntity jiaoshifenpei){
        EntityWrapper< JiaoshifenpeiEntity> ew = new EntityWrapper< JiaoshifenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshifenpei, "jiaoshifenpei")); 
		JiaoshifenpeiView jiaoshifenpeiView =  jiaoshifenpeiService.selectView(ew);
		return R.ok("查询教室分配成功").put("data", jiaoshifenpeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshifenpeiEntity jiaoshifenpei = jiaoshifenpeiService.selectById(id);
        return R.ok().put("data", jiaoshifenpei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshifenpeiEntity jiaoshifenpei = jiaoshifenpeiService.selectById(id);
        return R.ok().put("data", jiaoshifenpei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshifenpeiEntity jiaoshifenpei, HttpServletRequest request){
    	jiaoshifenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshifenpei);

        jiaoshifenpeiService.insert(jiaoshifenpei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshifenpeiEntity jiaoshifenpei, HttpServletRequest request){
    	jiaoshifenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshifenpei);
    	jiaoshifenpei.setUserid((Long)request.getSession().getAttribute("userId"));

        jiaoshifenpeiService.insert(jiaoshifenpei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoshifenpeiEntity jiaoshifenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshifenpei);
        jiaoshifenpeiService.updateById(jiaoshifenpei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshifenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaoshifenpeiEntity> wrapper = new EntityWrapper<JiaoshifenpeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaoshifenpeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
