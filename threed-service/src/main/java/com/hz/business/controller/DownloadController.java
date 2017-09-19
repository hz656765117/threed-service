package com.hz.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.base.util.JsonResult;
import com.hz.base.util.MD5Util;
import com.hz.business.service.IFileService;
import com.hz.business.service.IUserService;


 

/**
 * 文件下载
 * @author huangzhuo
 *
 */
@RestController
@RequestMapping("download")
public class DownloadController extends BaseController{
    private final static Logger logger = LoggerFactory.getLogger(DownloadController.class);

    	
    private static String prePath = "G:\\files" ;
	
 
	@Autowired
	private IFileService fileService;
    
 
	
 
	
	/**
	 * 
	 * @param model
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("getFile")
    public JsonResult  getFile(ModelMap model, HttpServletRequest request,String username,String path,String type) {
		JsonResult result = null;
		if (StringUtils.isNotBlank(type)) {
			if (type.equalsIgnoreCase("image")) {
				result = fileService.downloadFile("book/omega maz.jpg", prePath + "\\omega maz.jpg");
			}else if (type.equalsIgnoreCase("max")) {
				result = fileService.downloadFile("book/book.max", prePath + "\\book.max");
			}else {
				result = fileService.downloadFile("book/book.png", prePath + "\\book.png");
			}
			
		}else {
			result = fileService.downloadFile("2017080801/功能清单.xlsx", prePath + "\\222.xlsx");
		}
        return result;
    }
}
