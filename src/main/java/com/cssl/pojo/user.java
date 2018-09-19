package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: taoshopping
 * @Date: 2018/9/10 18:26
 * @Author: misliu
 * @Description:
 */

/**
 * 用户表
 */
@Getter
@Setter
public class user {
    private Integer us_id;          //用户id
    private String us_account;      //用户账号
    private String us_password;     //用户密码
    private String us_email;        //用户邮箱
    private String us_phone;        //用户电话
    private String us_head;         //用户头像
    private Integer us_authority;   //权限    (是否是管理员)
    private Integer us_state;       //用户状态 (是否登录)

}
