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


import com.dao.YishigongziDao;
import com.entity.YishigongziEntity;
import com.service.YishigongziService;
import com.entity.vo.YishigongziVO;
import com.entity.view.YishigongziView;

@Service("yishigongziService")
public class YishigongziServiceImpl extends ServiceImpl<YishigongziDao, YishigongziEntity> implements YishigongziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishigongziEntity> page = this.selectPage(
                new Query<YishigongziEntity>(params).getPage(),
                new EntityWrapper<YishigongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishigongziEntity> wrapper) {
		  Page<YishigongziView> page =new Query<YishigongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishigongziVO> selectListVO(Wrapper<YishigongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishigongziVO selectVO(Wrapper<YishigongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishigongziView> selectListView(Wrapper<YishigongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishigongziView selectView(Wrapper<YishigongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YishigongziEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YishigongziEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YishigongziEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
