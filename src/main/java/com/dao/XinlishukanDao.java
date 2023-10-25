package com.dao;

import com.entity.XinlishukanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlishukanVO;
import com.entity.view.XinlishukanView;


/**
 * 心理书刊
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface XinlishukanDao extends BaseMapper<XinlishukanEntity> {
	
	List<XinlishukanVO> selectListVO(@Param("ew") Wrapper<XinlishukanEntity> wrapper);
	
	XinlishukanVO selectVO(@Param("ew") Wrapper<XinlishukanEntity> wrapper);
	
	List<XinlishukanView> selectListView(@Param("ew") Wrapper<XinlishukanEntity> wrapper);

	List<XinlishukanView> selectListView(Pagination page,@Param("ew") Wrapper<XinlishukanEntity> wrapper);
	
	XinlishukanView selectView(@Param("ew") Wrapper<XinlishukanEntity> wrapper);
	

}
