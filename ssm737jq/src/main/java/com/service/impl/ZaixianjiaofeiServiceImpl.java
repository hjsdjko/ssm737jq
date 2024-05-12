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


import com.dao.ZaixianjiaofeiDao;
import com.entity.ZaixianjiaofeiEntity;
import com.service.ZaixianjiaofeiService;
import com.entity.vo.ZaixianjiaofeiVO;
import com.entity.view.ZaixianjiaofeiView;

@Service("zaixianjiaofeiService")
public class ZaixianjiaofeiServiceImpl extends ServiceImpl<ZaixianjiaofeiDao, ZaixianjiaofeiEntity> implements ZaixianjiaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianjiaofeiEntity> page = this.selectPage(
                new Query<ZaixianjiaofeiEntity>(params).getPage(),
                new EntityWrapper<ZaixianjiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianjiaofeiEntity> wrapper) {
		  Page<ZaixianjiaofeiView> page =new Query<ZaixianjiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianjiaofeiVO> selectListVO(Wrapper<ZaixianjiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianjiaofeiVO selectVO(Wrapper<ZaixianjiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianjiaofeiView> selectListView(Wrapper<ZaixianjiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianjiaofeiView selectView(Wrapper<ZaixianjiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
