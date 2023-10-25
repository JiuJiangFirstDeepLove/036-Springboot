package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishipingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishipingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishipingjiaView;


/**
 * 医师评价
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface YishipingjiaService extends IService<YishipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishipingjiaVO> selectListVO(Wrapper<YishipingjiaEntity> wrapper);
   	
   	YishipingjiaVO selectVO(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
   	
   	List<YishipingjiaView> selectListView(Wrapper<YishipingjiaEntity> wrapper);
   	
   	YishipingjiaView selectView(@Param("ew") Wrapper<YishipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishipingjiaEntity> wrapper);
   	

}

