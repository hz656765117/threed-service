package com.hz.business.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;


public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    private static final String USER_ID = "x-auth-userid";
    private static final String USER_NAME = "x-auth-username";

	protected String webPath;
	
    @Autowired
    private HttpServletRequest request;
    
    protected HttpServletResponse response;

	/**
	 * 所有的子类方法执行之前都要先执行此方法，子类方法不需要在model此方法中的参数
	 */
	@ModelAttribute
	public void init(ModelMap model,HttpServletRequest request,HttpServletResponse response) {
		this.response = response;
		model.addAttribute("webPath", getWebPath(request));
		logger.debug("请求为："+ webPath);
		String curIPAddr =   getIPAddr(request);
		logger.debug("请求ip地址为："+ curIPAddr);
		
		System.out.println(webPath +" " + curIPAddr);
	}
	
	public String getWebPath(HttpServletRequest request){
		String path = request.getContextPath(); 
		String basePath = request.getScheme() + "://" 
		+ request.getServerName() + ":" + request.getServerPort() 
		+ path + "/"; 
		return basePath;
	}

 
//    /**
//     * 获取用户ID
//     *
//     * @return
//     */
//    public Integer getUserId() {
//        String str = request.getHeader(USER_ID);
//        if (StringUtils.isNotBlank(str)) {
//            return Integer.parseInt(str.trim());
//        }
//        return null;
//    }
//
//    /**
//     * 获取登陆用户名
//     *
//     * @return
//     */
//    public String getUserName() {
//
//        return request.getHeader(USER_NAME);
//    }

	
	
	/** 
     * 获取http请求的真实IP地址  
     * @param request 
     * @return 
     */  
    // cjianquan 2016/8/2  
    public static String getIPAddr(HttpServletRequest request){  
        if (request == null)  
            return null;  
        String ip = request.getHeader("X-Forwarded-For");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))  
            ip = request.getHeader("Proxy-Client-IP");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))  
            ip = request.getHeader("WL-Proxy-Client-IP");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))  
            ip = request.getHeader("HTTP_CLIENT_IP");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))  
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))  
            ip = request.getRemoteAddr();  
        if ("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip))  
            try {  
                ip = InetAddress.getLocalHost().getHostAddress();  
            }  
            catch (UnknownHostException unknownhostexception) {  
            }  
        return ip;  
    }  
 
}
