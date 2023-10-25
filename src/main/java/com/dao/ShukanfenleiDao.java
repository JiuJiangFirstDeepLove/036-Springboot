package com.dao;

import com.entity.ShukanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShukanfenleiVO;
import com.entity.view.ShukanfenleiView;


/**
 * 书刊分类
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface ShukanfenleiDao extends BaseMapper<ShukanfenleiEntity> {
	
	List<ShukanfenleiVO> selectListVO(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
	
	ShukanfenleiVO selectVO(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
	
	List<ShukanfenleiView> selectListView(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);

	List<ShukanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
	
	ShukanfenleiView selectView(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
	

}
