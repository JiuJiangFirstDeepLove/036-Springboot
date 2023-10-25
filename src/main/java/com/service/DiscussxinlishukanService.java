package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinlishukanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinlishukanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinlishukanView;


/**
 * 心理书刊评论表
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface DiscussxinlishukanService extends IService<DiscussxinlishukanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinlishukanVO> selectListVO(Wrapper<DiscussxinlishukanEntity> wrapper);
   	
   	DiscussxinlishukanVO selectVO(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
   	
   	List<DiscussxinlishukanView> selectListView(Wrapper<DiscussxinlishukanEntity> wrapper);
   	
   	DiscussxinlishukanView selectView(@Param("ew") Wrapper<DiscussxinlishukanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinlishukanEntity> wrapper);
   	

}

