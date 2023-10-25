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


import com.dao.DiscussyishixinxiDao;
import com.entity.DiscussyishixinxiEntity;
import com.service.DiscussyishixinxiService;
import com.entity.vo.DiscussyishixinxiVO;
import com.entity.view.DiscussyishixinxiView;

@Service("discussyishixinxiService")
public class DiscussyishixinxiServiceImpl extends ServiceImpl<DiscussyishixinxiDao, DiscussyishixinxiEntity> implements DiscussyishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyishixinxiEntity> page = this.selectPage(
                new Query<DiscussyishixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyishixinxiEntity> wrapper) {
		  Page<DiscussyishixinxiView> page =new Query<DiscussyishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyishixinxiVO> selectListVO(Wrapper<DiscussyishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyishixinxiVO selectVO(Wrapper<DiscussyishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyishixinxiView> selectListView(Wrapper<DiscussyishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyishixinxiView selectView(Wrapper<DiscussyishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
