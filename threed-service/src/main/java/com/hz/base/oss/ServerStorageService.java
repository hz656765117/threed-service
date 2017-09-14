package com.hz.base.oss;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.hz.base.utils.FileUtil;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by zb on 2017/7/28.
 * 上传文件到微加服务器
 * 目前只支持图片上传
 */
public class ServerStorageService implements StorageService {

    private static final Logger logger = LoggerFactory.getLogger(ServerStorageService.class);

    private String filepath;

    public ServerStorageService(String filepath) {
        this.filepath = filepath;
    }


    public Boolean store(String key, MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String fileTail = FileUtil.getFileExt(fileName);
        if (!fileTail.toLowerCase().equals("png") && !fileTail.toLowerCase().equals("jpg")
                && !fileTail.toLowerCase().equals("jpeg") && !fileTail.toLowerCase().equals("gif")) {
            return false;
        } else {
            InputStream is;
            FileOutputStream fos = null;
            try {
                is = file.getInputStream();

                //创建入口文件夹目录
                if(StringUtils.isBlank(key)){
                    logger.error("key is blank");
                    return false;
                }
                int index = key.lastIndexOf("/");
                String path = key.substring(0,index);
                java.io.File dirPath = new java.io.File(filepath+path);
                if(!dirPath.exists())dirPath.mkdirs();

                java.io.File diskFile = new java.io.File(filepath + key);
                fos = new FileOutputStream(diskFile);
                IOUtils.copy(is, fos);
                return true;
            }catch(Exception e) {
                logger.error("文件上传通过文件复制的形式时异常："+e);
                return false;
            } finally {
                IOUtils.closeQuietly(fos);
            }
        }
    }

    public Boolean store(String key, InputStream inputStream) {
        return null;
    }

    public Boolean delete(String key) {
        return null;
    }

    public Boolean download(String key, String localFilePath) {
        return null;
    }
}
