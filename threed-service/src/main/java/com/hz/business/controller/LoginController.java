package com.hz.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hz.base.util.JsonResult;
import com.hz.base.util.MD5Util;
import com.hz.business.service.IUserService;


/**
 * 登录校验
 * @author huangzhuo
 *
 */
@RestController
@RequestMapping("login")
public class LoginController {
	
 
	@Autowired
	private IUserService userService;
    
 
	
	/**
	 * 用户登录校验
	 * @param model
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("login")
    public JsonResult  setupForm(ModelMap model, HttpServletRequest request,String username,String password) {
		JsonResult result = userService.validUser(username, MD5Util.md5Hex(password.getBytes()));
        return result;
    }
}
