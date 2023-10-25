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


import com.dao.DiscussxinlishukanDao;
import com.entity.DiscussxinlishukanEntity;
import com.service.DiscussxinlishukanService;
import com.entity.vo.DiscussxinlishukanVO;
import com.entity.view.DiscussxinlishukanView;

@Service("discussxinlishukanService")
public class DiscussxinlishukanServiceImpl extends ServiceImpl<DiscussxinlishukanDao, DiscussxinlishukanEntity> implements DiscussxinlishukanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinlishukanEntity> page = this.selectPage(
                new Query<DiscussxinlishukanEntity>(params).getPage(),
                new EntityWrapper<DiscussxinlishukanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinlishukanEntity> wrapper) {
		  Page<DiscussxinlishukanView> page =new Query<DiscussxinlishukanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinlishukanVO> selectListVO(Wrapper<DiscussxinlishukanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinlishukanVO selectVO(Wrapper<DiscussxinlishukanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinlishukanView> selectListView(Wrapper<DiscussxinlishukanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinlishukanView selectView(Wrapper<DiscussxinlishukanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
