package com.hz.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.base.util.JsonResult;
import com.hz.business.service.INewsTypeService;


/**
 * 模型分类
 * @author huangzhuo
 *
 */
@RestController
@RequestMapping("modelType")
public class NewsTypeController extends BaseController {
	
 
	@Autowired
	private INewsTypeService newsTypeService;
    
 
	@RequestMapping("listByPid")
    public JsonResult  setupForm(ModelMap model, HttpServletRequest request,String pid,String username) {
		JsonResult result = newsTypeService.listModelTypeByPid(pid);
        return result;
    }
}
