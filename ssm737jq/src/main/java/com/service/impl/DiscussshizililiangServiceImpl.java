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


import com.dao.DiscussshizililiangDao;
import com.entity.DiscussshizililiangEntity;
import com.service.DiscussshizililiangService;
import com.entity.vo.DiscussshizililiangVO;
import com.entity.view.DiscussshizililiangView;

@Service("discussshizililiangService")
public class DiscussshizililiangServiceImpl extends ServiceImpl<DiscussshizililiangDao, DiscussshizililiangEntity> implements DiscussshizililiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshizililiangEntity> page = this.selectPage(
                new Query<DiscussshizililiangEntity>(params).getPage(),
                new EntityWrapper<DiscussshizililiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshizililiangEntity> wrapper) {
		  Page<DiscussshizililiangView> page =new Query<DiscussshizililiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshizililiangVO> selectListVO(Wrapper<DiscussshizililiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshizililiangVO selectVO(Wrapper<DiscussshizililiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshizililiangView> selectListView(Wrapper<DiscussshizililiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshizililiangView selectView(Wrapper<DiscussshizililiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
