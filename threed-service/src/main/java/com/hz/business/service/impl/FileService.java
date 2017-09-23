package com.hz.business.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hz.base.oss.StorageService;
import com.hz.base.util.JsonResult;
import com.hz.base.utils.DateUtil;
import com.hz.base.utils.FileUtil;
import com.hz.base.utils.StringUtil;
import com.hz.base.utils.ZipUtil;
import com.hz.business.dao.EcmsDownloadMapper;
import com.hz.business.pojo.EcmsDownload;
import com.hz.business.service.IFileService;

@Service
@Transactional
public class FileService implements IFileService {
	 private final static Logger logger = LoggerFactory.getLogger(FileService.class);
	@Autowired
	StorageService storageService;
	
	@Autowired
	EcmsDownloadMapper ecmsDownloadMapper;
	
    private static String prePath = "/home/pkg/files/" ;
    
    
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


	public JsonResult downloadFileById(String username, String id, String type) {
		
//		EcmsDownloadExample example = new EcmsDownloadExample();
//		example.createCriteria().andIdEqualTo(Integer.valueOf(id));
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		
//		EcmsDownload  ecmsDownloadMapper.selectByPrimaryKey(Integer.valueOf(id));
		List<EcmsDownload> list = ecmsDownloadMapper.listFilesById(Integer.valueOf(id));
		
		if ( list == null ||  list.size() <= 0) {
			result.setMsg("下载失败，找不到下载记录");
		}  
		Map<String,Object> map = new HashMap<String,Object>();
		
		EcmsDownload download = list.get(0);
//		prePath = "G:\\files\\";
		String baseStr = null;
		String realName = download.getTitle() + "-" +download.getId();
		if (StringUtils.isNotBlank(type)) {
			if (type.equalsIgnoreCase("image")) {
				 realName += "-pic.zip";
				 baseStr = downloadFileStr(download.getPicdown(),   prePath +realName);
			}else if (type.equalsIgnoreCase("max")) {
				 realName += "-max.zip";
				 baseStr = downloadFileStr( StringUtil.getStrBySplit(download.getDownpath()),prePath +realName);
			}else {
				 realName += "-max.zip";
				 baseStr = downloadFileStr( StringUtil.getStrBySplit(download.getDownpath()),prePath +realName);
			}
		}else {
			 realName += "-max.zip";
			 baseStr = downloadFileStr( StringUtil.getStrBySplit(download.getDownpath()),prePath +realName);
		}
		
		map.put("baseStr", baseStr);
		map.put("fileName", realName);
		
		
		result.setObj(map);
		result.setSuccess(true);
		result.setMsg("下载成功");
		return result;
	}
	
	
	public   String downloadFileStr(String ossPath, String path){
		
		String fileStr = null;
		try {
			storageService.download(ossPath, path);
//			File file = ZipUtil.zip(path);
			File file = new File(path);
			fileStr = FileUtil.getBaseStrByFile(file);
			
			logger.debug(path+" 的base64字符串为："+fileStr);
			System.out.println(fileStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			FileUtil.delFile(path);
		}
		return fileStr;
	}

	
	public static void main(String[] args) {
		
	//	"downpath":"下载地址1::::::file/models/2017-09-15/f0c23da4d14b6397cdccae963584d5b3.zip::::::0::::::0::::::","picdown":"file/models/2017-09-15/4598b42ea20c158a3d75f1359c451628.zip"
		String downpath = "下载地址1::::::file/models/2017-09-15/f0c23da4d14b6397cdccae963584d5b3.zip::::::0::::::0::::::" ;
		
//		
//		String[] strs = downpath.split("::::::");
//		
//		for ( int i=0 ; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
		
		System.out.println(DateUtil.getMillis());
		String ss = StringUtil.getStrBySplit(downpath);
		
		System.out.println(ss);
		
	}
}
