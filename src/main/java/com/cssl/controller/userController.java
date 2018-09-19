package com.cssl.controller;

import com.cssl.httpmiaodi.IndustrySMS;
import com.cssl.pojo.user;
import com.cssl.service.userService;
import com.cssl.util.verificationCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: taoshopping01
 * @Date: 2018/9/10 19:30
 * @Author: misliu
 * @Description:
 */
//@RestController
@Controller
public class userController {

    //记时器值
    static int i =0;

    @Autowired
    private userService usSerivce;


    @RequestMapping("/userLogin")
    public String userLogin(user user){
        if(usSerivce.userLogin(user)!=null){
            return "index";
        }
        return "login";
    }

    //用户注册
    @RequestMapping("/userRegister")
    public void userRegister(user user, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(user!=null){
            if(usSerivce.insertUser(user)>0){
               out.print("<script>alert('注册成功!');location.href='login.html';</script>");
            }
        }else{
            out.print("<script>alert('注册失败!');location.href='register.html';</script>");
        }
        out.flush();
    }


    // Ajax 发送验证码
    @ResponseBody
    @RequestMapping("/Ajax-checkCode")
    public String sendCode(String phone){

        if(phone!=null&&!("".equals(phone))&&phone.length()==11) {
            //短信接口
            IndustrySMS.execute(phone);
        }
        return verificationCode.vCode.toString();
    }

    //Ajax验证用户名
    @ResponseBody
    @RequestMapping("/Ajax-checkUserName")
    public int checkUserName(String username){
        return usSerivce.checkUser(username);
    }


}
