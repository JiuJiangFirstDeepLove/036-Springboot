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


import com.dao.LizhigushiDao;
import com.entity.LizhigushiEntity;
import com.service.LizhigushiService;
import com.entity.vo.LizhigushiVO;
import com.entity.view.LizhigushiView;

@Service("lizhigushiService")
public class LizhigushiServiceImpl extends ServiceImpl<LizhigushiDao, LizhigushiEntity> implements LizhigushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LizhigushiEntity> page = this.selectPage(
                new Query<LizhigushiEntity>(params).getPage(),
                new EntityWrapper<LizhigushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LizhigushiEntity> wrapper) {
		  Page<LizhigushiView> page =new Query<LizhigushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LizhigushiVO> selectListVO(Wrapper<LizhigushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LizhigushiVO selectVO(Wrapper<LizhigushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LizhigushiView> selectListView(Wrapper<LizhigushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LizhigushiView selectView(Wrapper<LizhigushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
