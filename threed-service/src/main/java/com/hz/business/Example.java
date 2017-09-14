package com.hz.business;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.aliyun.oss.OSSClient;
import com.hz.base.oss.OSSStorageService;
import com.hz.base.oss.ServerStorageService;
import com.hz.base.oss.StorageService;
import com.hz.business.websocket.MyHandler;

@SpringBootApplication
//@EnableWebSocket
public class Example {

 
    
    
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(new MyHandler(), "/myHandler").addInterceptors(new HttpSessionHandshakeInterceptor());
//    }
//    
//    
//    @Bean
//    public ServletServerContainerFactoryBean createWebSocketContainer() {
//        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
//        container.setMaxTextMessageBufferSize(8192);
//        container.setMaxBinaryMessageBufferSize(8192);
//        return container;
//    }
    
    
    
    
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(echoWebSocketHandler(),
//            "/echo").setHandshakeHandler(handshakeHandler());
//    }
//
//    @Bean
//    public DefaultHandshakeHandler handshakeHandler() {
//
//        WebSocketPolicy policy = new WebSocketPolicy(WebSocketBehavior.SERVER);
//        policy.setInputBufferSize(8192);
//        policy.setIdleTimeout(600000);
//
//        return new DefaultHandshakeHandler(
//                new JettyRequestUpgradeStrategy(new WebSocketServerFactory(policy)));
//    }
	
	
    @Bean(destroyMethod = "shutdown")
    public OSSClient ossClient(@Value("${oss.end-point}") String endPoint,
                               @Value("${oss.access-key-id}") String accessKeyId,
                               @Value("${oss.access-key-secret}") String accessKeySecret) {
    	System.out.println(endPoint);
        return new OSSClient(endPoint, accessKeyId, accessKeySecret);
    }

    @Bean
    public StorageService storageService(@Value("${oss.bucket}") String bucketName,
                                         @Value("${cs.ftp-path}") String ftpPath,
                                         @Value("${cs.project-type}") String projectType) {
        if("SAAS".equalsIgnoreCase(projectType)){
            return new OSSStorageService(bucketName);
        }
        return new ServerStorageService(ftpPath);
    }

    
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}