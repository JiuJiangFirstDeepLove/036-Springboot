package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShukanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShukanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShukanfenleiView;


/**
 * 书刊分类
 *
 * @author 
 * @email 
 * @date 2023-03-16 23:06:41
 */
public interface ShukanfenleiService extends IService<ShukanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShukanfenleiVO> selectListVO(Wrapper<ShukanfenleiEntity> wrapper);
   	
   	ShukanfenleiVO selectVO(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
   	
   	List<ShukanfenleiView> selectListView(Wrapper<ShukanfenleiEntity> wrapper);
   	
   	ShukanfenleiView selectView(@Param("ew") Wrapper<ShukanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShukanfenleiEntity> wrapper);
   	

}

