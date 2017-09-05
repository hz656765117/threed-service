package com.hz.business.service;

import com.hz.base.util.JsonResult;

public interface IUserService {
	
	/**
	 * 校验用户是否存在
	 * @param username
	 * @param password
	 * @return
	 */
	public JsonResult validUser(String username, String password);
	
	
	
}
