package com.dao;

import com.entity.YishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishiVO;
import com.entity.view.YishiView;


/**
 * 医师
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:40
 */
public interface YishiDao extends BaseMapper<YishiEntity> {
	
	List<YishiVO> selectListVO(@Param("ew") Wrapper<YishiEntity> wrapper);
	
	YishiVO selectVO(@Param("ew") Wrapper<YishiEntity> wrapper);
	
	List<YishiView> selectListView(@Param("ew") Wrapper<YishiEntity> wrapper);

	List<YishiView> selectListView(Pagination page,@Param("ew") Wrapper<YishiEntity> wrapper);
	
	YishiView selectView(@Param("ew") Wrapper<YishiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiEntity> wrapper);
}
