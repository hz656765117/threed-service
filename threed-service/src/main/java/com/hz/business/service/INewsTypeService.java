package com.hz.business.service;

import com.hz.base.util.JsonResult;

public interface INewsTypeService {
	
 
	
	/**
	 * 根据父分类id查询分类列表
	 * @param pTypeId
	 * @return
	 */
	public JsonResult listModelTypeByPid(String pTypeId);
	
	
	
}
