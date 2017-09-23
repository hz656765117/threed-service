package com.hz.business.service;

import com.hz.base.util.JsonResult;

public interface IFileService {
	
 
	
	/**
	 * 下载文件
	 * @param username
	 * @param path
	 * @return
	 */
	public JsonResult downloadFile(String username, String path);
	
	
	public JsonResult downloadFileById(String username, String id,String type);
	
	
	
}
