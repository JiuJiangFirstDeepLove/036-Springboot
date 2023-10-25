package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyishixinxiView;


/**
 * 医师信息评论表
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface DiscussyishixinxiService extends IService<DiscussyishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyishixinxiVO> selectListVO(Wrapper<DiscussyishixinxiEntity> wrapper);
   	
   	DiscussyishixinxiVO selectVO(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
   	
   	List<DiscussyishixinxiView> selectListView(Wrapper<DiscussyishixinxiEntity> wrapper);
   	
   	DiscussyishixinxiView selectView(@Param("ew") Wrapper<DiscussyishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyishixinxiEntity> wrapper);
   	

}

