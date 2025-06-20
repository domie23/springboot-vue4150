package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TechanpingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TechanpingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TechanpingfenView;


/**
 * 特产评分
 *
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
public interface TechanpingfenService extends IService<TechanpingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TechanpingfenVO> selectListVO(Wrapper<TechanpingfenEntity> wrapper);
   	
   	TechanpingfenVO selectVO(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
   	
   	List<TechanpingfenView> selectListView(Wrapper<TechanpingfenEntity> wrapper);
   	
   	TechanpingfenView selectView(@Param("ew") Wrapper<TechanpingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TechanpingfenEntity> wrapper);
   	

}

