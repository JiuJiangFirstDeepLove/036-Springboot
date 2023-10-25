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


import com.dao.YishixinxiDao;
import com.entity.YishixinxiEntity;
import com.service.YishixinxiService;
import com.entity.vo.YishixinxiVO;
import com.entity.view.YishixinxiView;

@Service("yishixinxiService")
public class YishixinxiServiceImpl extends ServiceImpl<YishixinxiDao, YishixinxiEntity> implements YishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishixinxiEntity> page = this.selectPage(
                new Query<YishixinxiEntity>(params).getPage(),
                new EntityWrapper<YishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishixinxiEntity> wrapper) {
		  Page<YishixinxiView> page =new Query<YishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishixinxiVO> selectListVO(Wrapper<YishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishixinxiVO selectVO(Wrapper<YishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishixinxiView> selectListView(Wrapper<YishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishixinxiView selectView(Wrapper<YishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
