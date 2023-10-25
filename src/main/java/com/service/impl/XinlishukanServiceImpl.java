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


import com.dao.XinlishukanDao;
import com.entity.XinlishukanEntity;
import com.service.XinlishukanService;
import com.entity.vo.XinlishukanVO;
import com.entity.view.XinlishukanView;

@Service("xinlishukanService")
public class XinlishukanServiceImpl extends ServiceImpl<XinlishukanDao, XinlishukanEntity> implements XinlishukanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlishukanEntity> page = this.selectPage(
                new Query<XinlishukanEntity>(params).getPage(),
                new EntityWrapper<XinlishukanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlishukanEntity> wrapper) {
		  Page<XinlishukanView> page =new Query<XinlishukanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlishukanVO> selectListVO(Wrapper<XinlishukanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlishukanVO selectVO(Wrapper<XinlishukanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlishukanView> selectListView(Wrapper<XinlishukanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlishukanView selectView(Wrapper<XinlishukanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
