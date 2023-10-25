package com.dao;

import com.entity.YishipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishipingjiaVO;
import com.entity.view.YishipingjiaView;


/**
 * 医师评价
 * 
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishipingjiaDao extends BaseMapper<YishipingjiaEntity> {
	
	List<YishipingjiaVO> selectListVO(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
	
	YishipingjiaVO selectVO(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
	
	List<YishipingjiaView> selectListView(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);

	List<YishipingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
	
	YishipingjiaView selectView(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
	

}
