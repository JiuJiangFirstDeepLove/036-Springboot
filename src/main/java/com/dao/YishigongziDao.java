package com.dao;

import com.entity.YishigongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishigongziVO;
import com.entity.view.YishigongziView;


/**
 * 医师工资
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishigongziDao extends BaseMapper<YishigongziEntity> {
	
	List<YishigongziVO> selectListVO(@Param("ew") Wrapper<YishigongziEntity> wrapper);
	
	YishigongziVO selectVO(@Param("ew") Wrapper<YishigongziEntity> wrapper);
	
	List<YishigongziView> selectListView(@Param("ew") Wrapper<YishigongziEntity> wrapper);

	List<YishigongziView> selectListView(Pagination page,@Param("ew") Wrapper<YishigongziEntity> wrapper);
	
	YishigongziView selectView(@Param("ew") Wrapper<YishigongziEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishigongziEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishigongziEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishigongziEntity> wrapper);
}
