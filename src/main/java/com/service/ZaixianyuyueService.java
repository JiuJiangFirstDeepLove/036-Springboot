package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianyuyueView;


/**
 * 在线预约
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface ZaixianyuyueService extends IService<ZaixianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianyuyueVO> selectListVO(Wrapper<ZaixianyuyueEntity> wrapper);
   	
   	ZaixianyuyueVO selectVO(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
   	
   	List<ZaixianyuyueView> selectListView(Wrapper<ZaixianyuyueEntity> wrapper);
   	
   	ZaixianyuyueView selectView(@Param("ew") Wrapper<ZaixianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZaixianyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZaixianyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZaixianyuyueEntity> wrapper);
}

