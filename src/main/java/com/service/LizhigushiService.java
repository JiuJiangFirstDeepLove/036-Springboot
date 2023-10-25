package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LizhigushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LizhigushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LizhigushiView;


/**
 * 励志故事
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface LizhigushiService extends IService<LizhigushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LizhigushiVO> selectListVO(Wrapper<LizhigushiEntity> wrapper);
   	
   	LizhigushiVO selectVO(@Param("ew") Wrapper<LizhigushiEntity> wrapper);
   	
   	List<LizhigushiView> selectListView(Wrapper<LizhigushiEntity> wrapper);
   	
   	LizhigushiView selectView(@Param("ew") Wrapper<LizhigushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LizhigushiEntity> wrapper);
   	

}

