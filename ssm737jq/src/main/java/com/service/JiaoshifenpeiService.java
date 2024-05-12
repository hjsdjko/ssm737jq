package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshifenpeiView;


/**
 * 教室分配
 *
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public interface JiaoshifenpeiService extends IService<JiaoshifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshifenpeiVO> selectListVO(Wrapper<JiaoshifenpeiEntity> wrapper);
   	
   	JiaoshifenpeiVO selectVO(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
   	
   	List<JiaoshifenpeiView> selectListView(Wrapper<JiaoshifenpeiEntity> wrapper);
   	
   	JiaoshifenpeiView selectView(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshifenpeiEntity> wrapper);
   	

}

