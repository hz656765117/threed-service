package com.hz.business.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hz.base.util.JsonResult;
import com.hz.business.dao.NewsTypeMapper;
import com.hz.business.pojo.NewsType;
import com.hz.business.pojo.NewsTypeExample;
import com.hz.business.service.INewsTypeService;

@Service
@Transactional
public class NewsTypeService implements INewsTypeService {
	
	@Autowired
	NewsTypeMapper newsTypeMapper;
	
	
	public JsonResult listModelTypeByPid(String pTypeId) {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		
		Short pid = 0;
		if (  StringUtils.isNotBlank(pTypeId) ) {
			pid =  new Short(pTypeId);
		}
		
		NewsTypeExample example = new NewsTypeExample();
		
		example.createCriteria().andBclassidEqualTo(pid);
		
		List<NewsType> list = newsTypeMapper.selectByExample(example);
		
		if(list == null || list.size() <= 0){
			result.setMsg("该分类下不存在子分类");
			return result;
		}else{
			result.setMsg("查询成功");
			result.setSuccess(true);
			result.setObj(list);
		}
		
		return result;
	}

}
