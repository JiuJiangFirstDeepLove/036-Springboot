package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishigongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishigongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishigongziView;


/**
 * 医师工资
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishigongziService extends IService<YishigongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishigongziVO> selectListVO(Wrapper<YishigongziEntity> wrapper);
   	
   	YishigongziVO selectVO(@Param("ew") Wrapper<YishigongziEntity> wrapper);
   	
   	List<YishigongziView> selectListView(Wrapper<YishigongziEntity> wrapper);
   	
   	YishigongziView selectView(@Param("ew") Wrapper<YishigongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishigongziEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YishigongziEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YishigongziEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YishigongziEntity> wrapper);
}

