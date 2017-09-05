package com.hz.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hz.base.util.JsonResult;
import com.hz.business.dao.UserMapper;
import com.hz.business.pojo.User;
import com.hz.business.pojo.UserExample;
import com.hz.business.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService {
	
	@Autowired
	UserMapper userMapper;
	
	
	public JsonResult validUser(String username, String password) {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		if(list == null || list.size() <= 0){
			result.setMsg("用户名不存在");
			return result;
		}
		example.clear();
		example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		list = userMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			result.setSuccess(true);
			result.setMsg("登录成功");
		}else{
			result.setMsg("密码错误，请重新登录");
		}
		
		return result;
	}

}
