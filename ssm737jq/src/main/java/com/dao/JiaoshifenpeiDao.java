package com.dao;

import com.entity.JiaoshifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshifenpeiVO;
import com.entity.view.JiaoshifenpeiView;


/**
 * 教室分配
 * 
 * @author 
 * @email 
 * @date 2022-03-05 08:18:47
 */
public interface JiaoshifenpeiDao extends BaseMapper<JiaoshifenpeiEntity> {
	
	List<JiaoshifenpeiVO> selectListVO(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
	
	JiaoshifenpeiVO selectVO(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
	
	List<JiaoshifenpeiView> selectListView(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);

	List<JiaoshifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
	
	JiaoshifenpeiView selectView(@Param("ew") Wrapper<JiaoshifenpeiEntity> wrapper);
	

}
