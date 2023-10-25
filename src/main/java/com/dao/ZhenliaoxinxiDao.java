package com.dao;

import com.entity.ZhenliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenliaoxinxiVO;
import com.entity.view.ZhenliaoxinxiView;


/**
 * 诊疗信息
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface ZhenliaoxinxiDao extends BaseMapper<ZhenliaoxinxiEntity> {
	
	List<ZhenliaoxinxiVO> selectListVO(@Param("ew") Wrapper<ZhenliaoxinxiEntity> wrapper);
	
	ZhenliaoxinxiVO selectVO(@Param("ew") Wrapper<ZhenliaoxinxiEntity> wrapper);
	
	List<ZhenliaoxinxiView> selectListView(@Param("ew") Wrapper<ZhenliaoxinxiEntity> wrapper);

	List<ZhenliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenliaoxinxiEntity> wrapper);
	
	ZhenliaoxinxiView selectView(@Param("ew") Wrapper<ZhenliaoxinxiEntity> wrapper);
	

}
