package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstechanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstechanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstechanxinxiView;


/**
 * 特产信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
public interface DiscusstechanxinxiService extends IService<DiscusstechanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstechanxinxiVO> selectListVO(Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	DiscusstechanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	List<DiscusstechanxinxiView> selectListView(Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	DiscusstechanxinxiView selectView(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstechanxinxiEntity> wrapper);
   	

}

