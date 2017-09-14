package com.hz.business.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hz.base.util.JsonResult;


@RestController
@RequestMapping("collect")
public class CollectController {
	
 
    
    
    //浏览器请求    http://localhost:8088/collect/add?userId=huangzhuo
	/**
	 * method= RequestMethod.GET 指定请求方式为get
	 * @param userId
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/add",method= RequestMethod.GET)
    public String setupForm(@RequestParam("userId") String userId, ModelMap model) {
    	System.out.println(userId);
    	JsonResult result = new JsonResult();
    	result.setSuccess(true);
    	
        return "userId is :" + userId;
    }
}
