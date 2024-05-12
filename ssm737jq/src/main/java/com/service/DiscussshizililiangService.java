package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshizililiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshizililiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshizililiangView;


/**
 * 师资力量评论表
 *
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public interface DiscussshizililiangService extends IService<DiscussshizililiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshizililiangVO> selectListVO(Wrapper<DiscussshizililiangEntity> wrapper);
   	
   	DiscussshizililiangVO selectVO(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
   	
   	List<DiscussshizililiangView> selectListView(Wrapper<DiscussshizililiangEntity> wrapper);
   	
   	DiscussshizililiangView selectView(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshizililiangEntity> wrapper);
   	

}

