package com.cssl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: taoshopping01
 * @Date: 2018/9/11 10:15
 * @Author: misliu
 * @Description:
 */
public class userInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        if(path.endsWith("userRegister")||path.endsWith("userLogin")){
            return true;
        }
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            return false;
        }
        return true;
    }
}
