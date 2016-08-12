package com.kp.dao;

import java.util.List;
import java.util.Map;

import com.kp.entity.Link;

/**
 * 友情链接Dao接口
 */
public interface LinkDao {

	/**
	 * 添加链接
	 */
	public int add(Link link);
	
	/**
	 * 更改链接
	 */
	public int update(Link link);
	
	/**
	 * 查找链接
	 */
	public List<Link> list(Map<String, Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);

	/**
	 * 删除链接
	 */
	public Integer delete(Integer id);
}
