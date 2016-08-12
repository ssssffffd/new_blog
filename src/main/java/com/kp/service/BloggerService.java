package com.kp.service;

import com.kp.entity.Blogger;

/**
 * 博主的服务层接口
 */
public interface BloggerService {

	/**
	 * 查询博主信息
	 */
	public Blogger find();
	
	/**
	 * 通过用户名查询用户
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * 更新博主信息
	 */
	public Integer update(Blogger blogger);
}
