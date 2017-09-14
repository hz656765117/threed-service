package com.hz.base.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;

public class OSSStorageService implements StorageService {
    private final static Logger logger = LoggerFactory.getLogger(OSSStorageService.class);
    @Resource
    private OSSClient ossClient;
    private String bucketName;

    public OSSStorageService(String bucketName) {
        this.bucketName = bucketName;
    }

    public Boolean store(String key, MultipartFile file) {
        try {
            PutObjectResult result = ossClient.putObject(bucketName, key, file.getInputStream(), null);
            String etag = result.getETag();
            return etag != null && !etag.equals("");
        } catch(Exception e) {
            logger.error("OSS pubObject error: {}", e);
            return false;
        }
    }

    public Boolean store(String key, InputStream inputStream) {
        try {
            PutObjectResult result = ossClient.putObject(bucketName, key, inputStream, null);
            String etag = result.getETag();
            return etag != null && !etag.equals("");
        } catch(Exception e) {
            logger.error("OSS pubObject error: {}", e);
            return false;
        }
    }

    public Boolean delete(String key) {
        ossClient.deleteObject(bucketName, key);
        return true;
    }

    public Boolean download(String key, String localFilePath) {
        ObjectMetadata metadata = ossClient.getObject(new GetObjectRequest(bucketName, key), new File(localFilePath));
        return metadata != null;
    }

	public File downloadFile(String key, String localFilePath) {
		File file = new File(localFilePath);
		ObjectMetadata metadata = ossClient.getObject(new GetObjectRequest(bucketName, key), new File(localFilePath));
		return file;
	}
    
    

}
