package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlishukanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlishukanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlishukanView;


/**
 * 心理书刊
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface XinlishukanService extends IService<XinlishukanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlishukanVO> selectListVO(Wrapper<XinlishukanEntity> wrapper);
   	
   	XinlishukanVO selectVO(@Param("ew") Wrapper<XinlishukanEntity> wrapper);
   	
   	List<XinlishukanView> selectListView(Wrapper<XinlishukanEntity> wrapper);
   	
   	XinlishukanView selectView(@Param("ew") Wrapper<XinlishukanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlishukanEntity> wrapper);
   	

}

