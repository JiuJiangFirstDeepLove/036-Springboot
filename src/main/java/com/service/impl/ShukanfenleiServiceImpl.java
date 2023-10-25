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


import com.dao.ShukanfenleiDao;
import com.entity.ShukanfenleiEntity;
import com.service.ShukanfenleiService;
import com.entity.vo.ShukanfenleiVO;
import com.entity.view.ShukanfenleiView;

@Service("shukanfenleiService")
public class ShukanfenleiServiceImpl extends ServiceImpl<ShukanfenleiDao, ShukanfenleiEntity> implements ShukanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShukanfenleiEntity> page = this.selectPage(
                new Query<ShukanfenleiEntity>(params).getPage(),
                new EntityWrapper<ShukanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShukanfenleiEntity> wrapper) {
		  Page<ShukanfenleiView> page =new Query<ShukanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShukanfenleiVO> selectListVO(Wrapper<ShukanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShukanfenleiVO selectVO(Wrapper<ShukanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShukanfenleiView> selectListView(Wrapper<ShukanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShukanfenleiView selectView(Wrapper<ShukanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
