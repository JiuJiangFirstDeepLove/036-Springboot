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


import com.dao.ZhenliaoxinxiDao;
import com.entity.ZhenliaoxinxiEntity;
import com.service.ZhenliaoxinxiService;
import com.entity.vo.ZhenliaoxinxiVO;
import com.entity.view.ZhenliaoxinxiView;

@Service("zhenliaoxinxiService")
public class ZhenliaoxinxiServiceImpl extends ServiceImpl<ZhenliaoxinxiDao, ZhenliaoxinxiEntity> implements ZhenliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhenliaoxinxiEntity> page = this.selectPage(
                new Query<ZhenliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhenliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhenliaoxinxiEntity> wrapper) {
		  Page<ZhenliaoxinxiView> page =new Query<ZhenliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhenliaoxinxiVO> selectListVO(Wrapper<ZhenliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhenliaoxinxiVO selectVO(Wrapper<ZhenliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhenliaoxinxiView> selectListView(Wrapper<ZhenliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhenliaoxinxiView selectView(Wrapper<ZhenliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
