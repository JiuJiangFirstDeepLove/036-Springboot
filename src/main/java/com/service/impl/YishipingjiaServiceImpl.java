package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YishipingjiaDao;
import com.entity.YishipingjiaEntity;
import com.service.YishipingjiaService;
import com.entity.vo.YishipingjiaVO;
import com.entity.view.YishipingjiaView;

@Service("yishipingjiaService")
public class YishipingjiaServiceImpl extends ServiceImpl<YishipingjiaDao, YishipingjiaEntity> implements YishipingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishipingjiaEntity> page = this.selectPage(
                new Query<YishipingjiaEntity>(params).getPage(),
                new EntityWrapper<YishipingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishipingjiaEntity> wrapper) {
		  Page<YishipingjiaView> page =new Query<YishipingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishipingjiaVO> selectListVO(Wrapper<YishipingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishipingjiaVO selectVO(Wrapper<YishipingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishipingjiaView> selectListView(Wrapper<YishipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishipingjiaView selectView(Wrapper<YishipingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
