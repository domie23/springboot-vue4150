package com.dao;

import com.entity.TechanpingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TechanpingfenVO;
import com.entity.view.TechanpingfenView;


/**
 * 特产评分
 * 
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
public interface TechanpingfenDao extends BaseMapper<TechanpingfenEntity> {
	
	List<TechanpingfenVO> selectListVO(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
	
	TechanpingfenVO selectVO(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
	
	List<TechanpingfenView> selectListView(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);

	List<TechanpingfenView> selectListView(Pagination page,@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
	
	TechanpingfenView selectView(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
	

}
