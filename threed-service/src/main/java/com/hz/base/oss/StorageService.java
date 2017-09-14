package com.hz.base.oss;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;

public interface StorageService {
	Boolean store(String key, MultipartFile file);

	Boolean store(String key, InputStream inputStream);

    Boolean delete(String key);

    Boolean download(String key, String localFilePath);
    
    File downloadFile(String key, String localFilePath);
    
}
