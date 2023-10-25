package com.dao;

import com.entity.ZaixianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianyuyueVO;
import com.entity.view.ZaixianyuyueView;


/**
 * 在线预约
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface ZaixianyuyueDao extends BaseMapper<ZaixianyuyueEntity> {
	
	List<ZaixianyuyueVO> selectListVO(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	ZaixianyuyueVO selectVO(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	List<ZaixianyuyueView> selectListView(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);

	List<ZaixianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	
	ZaixianyuyueView selectView(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
}
