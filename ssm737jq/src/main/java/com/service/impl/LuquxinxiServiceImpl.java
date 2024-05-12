package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LuquxinxiDao;
import com.entity.LuquxinxiEntity;
import com.service.LuquxinxiService;
import com.entity.vo.LuquxinxiVO;
import com.entity.view.LuquxinxiView;

@Service("luquxinxiService")
public class LuquxinxiServiceImpl extends ServiceImpl<LuquxinxiDao, LuquxinxiEntity> implements LuquxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuquxinxiEntity> page = this.selectPage(
                new Query<LuquxinxiEntity>(params).getPage(),
                new EntityWrapper<LuquxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuquxinxiEntity> wrapper) {
		  Page<LuquxinxiView> page =new Query<LuquxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuquxinxiVO> selectListVO(Wrapper<LuquxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuquxinxiVO selectVO(Wrapper<LuquxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuquxinxiView> selectListView(Wrapper<LuquxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuquxinxiView selectView(Wrapper<LuquxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
