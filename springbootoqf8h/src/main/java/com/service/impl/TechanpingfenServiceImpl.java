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


import com.dao.TechanpingfenDao;
import com.entity.TechanpingfenEntity;
import com.service.TechanpingfenService;
import com.entity.vo.TechanpingfenVO;
import com.entity.view.TechanpingfenView;

@Service("techanpingfenService")
public class TechanpingfenServiceImpl extends ServiceImpl<TechanpingfenDao, TechanpingfenEntity> implements TechanpingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TechanpingfenEntity> page = this.selectPage(
                new Query<TechanpingfenEntity>(params).getPage(),
                new EntityWrapper<TechanpingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TechanpingfenEntity> wrapper) {
		  Page<TechanpingfenView> page =new Query<TechanpingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TechanpingfenVO> selectListVO(Wrapper<TechanpingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TechanpingfenVO selectVO(Wrapper<TechanpingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TechanpingfenView> selectListView(Wrapper<TechanpingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TechanpingfenView selectView(Wrapper<TechanpingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
