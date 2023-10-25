package com.dao;

import com.entity.DiscussyishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyishixinxiVO;
import com.entity.view.DiscussyishixinxiView;


/**
 * 医师信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface DiscussyishixinxiDao extends BaseMapper<DiscussyishixinxiEntity> {
	
	List<DiscussyishixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
	
	DiscussyishixinxiVO selectVO(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
	
	List<DiscussyishixinxiView> selectListView(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);

	List<DiscussyishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
	
	DiscussyishixinxiView selectView(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
	

}
