package com.dao;

import com.entity.ZaixianjiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianjiaofeiVO;
import com.entity.view.ZaixianjiaofeiView;


/**
 * 在线缴费
 * 
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public interface ZaixianjiaofeiDao extends BaseMapper<ZaixianjiaofeiEntity> {
	
	List<ZaixianjiaofeiVO> selectListVO(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
	
	ZaixianjiaofeiVO selectVO(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
	
	List<ZaixianjiaofeiView> selectListView(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);

	List<ZaixianjiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
	
	ZaixianjiaofeiView selectView(@Param("ew") Wrapper<ZaixianjiaofeiEntity> wrapper);
	

}
