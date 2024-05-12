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


import com.dao.JiaoshifenpeiDao;
import com.entity.JiaoshifenpeiEntity;
import com.service.JiaoshifenpeiService;
import com.entity.vo.JiaoshifenpeiVO;
import com.entity.view.JiaoshifenpeiView;

@Service("jiaoshifenpeiService")
public class JiaoshifenpeiServiceImpl extends ServiceImpl<JiaoshifenpeiDao, JiaoshifenpeiEntity> implements JiaoshifenpeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshifenpeiEntity> page = this.selectPage(
                new Query<JiaoshifenpeiEntity>(params).getPage(),
                new EntityWrapper<JiaoshifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshifenpeiEntity> wrapper) {
		  Page<JiaoshifenpeiView> page =new Query<JiaoshifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshifenpeiVO> selectListVO(Wrapper<JiaoshifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshifenpeiVO selectVO(Wrapper<JiaoshifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshifenpeiView> selectListView(Wrapper<JiaoshifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshifenpeiView selectView(Wrapper<JiaoshifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
