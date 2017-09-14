package com.hz.business.service.impl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hz.base.oss.StorageService;
import com.hz.base.util.JsonResult;
import com.hz.base.utils.FileUtil;
import com.hz.base.utils.ZipUtil;
import com.hz.business.dao.UserMapper;
import com.hz.business.pojo.User;
import com.hz.business.pojo.UserExample;
import com.hz.business.service.IFileService;
import com.hz.business.service.IUserService;

@Service
@Transactional
public class FileService implements IFileService {
	
	@Autowired
	StorageService storageService;
	
	
	public JsonResult downloadFile(String username, String path) {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		
		String baseStr = null;
		try {
			storageService.download(username, path);
			File file = ZipUtil.zip(path);
			baseStr = FileUtil.getBaseStrByFile(file);
			System.out.println(baseStr);
			result.setSuccess(true);
			result.setMsg("下载成功");
			result.setObj(baseStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			FileUtil.delFile(path);
		}
		
		
		return result;
	}

}
