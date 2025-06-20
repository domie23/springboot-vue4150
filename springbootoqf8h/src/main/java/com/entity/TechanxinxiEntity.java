package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特产信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
@TableName("techanxinxi")
public class TechanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TechanxinxiEntity() {
		
	}
	
	public TechanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 特产名称
	 */
					
	private String techanmingcheng;
	
	/**
	 * 特产类型
	 */
					
	private String techanleixing;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 产地
	 */
					
	private String chandi;
	
	/**
	 * 特产介绍
	 */
					
	private String techanjieshao;
	
	/**
	 * 特产图片
	 */
					
	private String techantupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：特产名称
	 */
	public void setTechanmingcheng(String techanmingcheng) {
		this.techanmingcheng = techanmingcheng;
	}
	/**
	 * 获取：特产名称
	 */
	public String getTechanmingcheng() {
		return techanmingcheng;
	}
	/**
	 * 设置：特产类型
	 */
	public void setTechanleixing(String techanleixing) {
		this.techanleixing = techanleixing;
	}
	/**
	 * 获取：特产类型
	 */
	public String getTechanleixing() {
		return techanleixing;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：产地
	 */
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
	/**
	 * 设置：特产介绍
	 */
	public void setTechanjieshao(String techanjieshao) {
		this.techanjieshao = techanjieshao;
	}
	/**
	 * 获取：特产介绍
	 */
	public String getTechanjieshao() {
		return techanjieshao;
	}
	/**
	 * 设置：特产图片
	 */
	public void setTechantupian(String techantupian) {
		this.techantupian = techantupian;
	}
	/**
	 * 获取：特产图片
	 */
	public String getTechantupian() {
		return techantupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}

}
