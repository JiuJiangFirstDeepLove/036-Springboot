package com.dao;

import com.entity.DiscussxinlishukanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinlishukanVO;
import com.entity.view.DiscussxinlishukanView;


/**
 * 心理书刊评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface DiscussxinlishukanDao extends BaseMapper<DiscussxinlishukanEntity> {
	
	List<DiscussxinlishukanVO> selectListVO(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
	
	DiscussxinlishukanVO selectVO(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
	
	List<DiscussxinlishukanView> selectListView(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);

	List<DiscussxinlishukanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
	
	DiscussxinlishukanView selectView(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
	

}
