package com.dao;

import com.entity.LizhigushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LizhigushiVO;
import com.entity.view.LizhigushiView;


/**
 * 励志故事
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface LizhigushiDao extends BaseMapper<LizhigushiEntity> {
	
	List<LizhigushiVO> selectListVO(@Param("ew") Wrapper<LizhigushiEntity> wrapper);
	
	LizhigushiVO selectVO(@Param("ew") Wrapper<LizhigushiEntity> wrapper);
	
	List<LizhigushiView> selectListView(@Param("ew") Wrapper<LizhigushiEntity> wrapper);

	List<LizhigushiView> selectListView(Pagination page,@Param("ew") Wrapper<LizhigushiEntity> wrapper);
	
	LizhigushiView selectView(@Param("ew") Wrapper<LizhigushiEntity> wrapper);
	

}
