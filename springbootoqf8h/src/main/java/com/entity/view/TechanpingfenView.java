package com.entity.view;

import com.entity.TechanpingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特产评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
@TableName("techanpingfen")
public class TechanpingfenView  extends TechanpingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TechanpingfenView(){
	}
 
 	public TechanpingfenView(TechanpingfenEntity techanpingfenEntity){
 	try {
			BeanUtils.copyProperties(this, techanpingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
