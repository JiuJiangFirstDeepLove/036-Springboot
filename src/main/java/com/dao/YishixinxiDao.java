package com.dao;

import com.entity.YishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishixinxiVO;
import com.entity.view.YishixinxiView;


/**
 * 医师信息
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishixinxiDao extends BaseMapper<YishixinxiEntity> {
	
	List<YishixinxiVO> selectListVO(@Param("ew") Wrapper<YishixinxiEntity> wrapper);
	
	YishixinxiVO selectVO(@Param("ew") Wrapper<YishixinxiEntity> wrapper);
	
	List<YishixinxiView> selectListView(@Param("ew") Wrapper<YishixinxiEntity> wrapper);

	List<YishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YishixinxiEntity> wrapper);
	
	YishixinxiView selectView(@Param("ew") Wrapper<YishixinxiEntity> wrapper);
	

}
