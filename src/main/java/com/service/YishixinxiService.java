package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishixinxiView;


/**
 * 医师信息
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishixinxiService extends IService<YishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishixinxiVO> selectListVO(Wrapper<YishixinxiEntity> wrapper);
   	
   	YishixinxiVO selectVO(@Param("ew") Wrapper<YishixinxiEntity> wrapper);
   	
   	List<YishixinxiView> selectListView(Wrapper<YishixinxiEntity> wrapper);
   	
   	YishixinxiView selectView(@Param("ew") Wrapper<YishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishixinxiEntity> wrapper);
   	

}

