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


import com.dao.YishiDao;
import com.entity.YishiEntity;
import com.service.YishiService;
import com.entity.vo.YishiVO;
import com.entity.view.YishiView;

@Service("yishiService")
public class YishiServiceImpl extends ServiceImpl<YishiDao, YishiEntity> implements YishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishiEntity> page = this.selectPage(
                new Query<YishiEntity>(params).getPage(),
                new EntityWrapper<YishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishiEntity> wrapper) {
		  Page<YishiView> page =new Query<YishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishiVO> selectListVO(Wrapper<YishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishiVO selectVO(Wrapper<YishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishiView> selectListView(Wrapper<YishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishiView selectView(Wrapper<YishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YishiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YishiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YishiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
