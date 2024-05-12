package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianjiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianjiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianjiaofeiView;


/**
 * 在线缴费
 *
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public interface ZaixianjiaofeiService extends IService<ZaixianjiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianjiaofeiVO> selectListVO(Wrapper<ZaixianjiaofeiEntity> wrapper);
   	
   	ZaixianjiaofeiVO selectVO(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
   	
   	List<ZaixianjiaofeiView> selectListView(Wrapper<ZaixianjiaofeiEntity> wrapper);
   	
   	ZaixianjiaofeiView selectView(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianjiaofeiEntity> wrapper);
   	

}

