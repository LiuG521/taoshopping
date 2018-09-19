package com.cssl.service;

import com.cssl.pojo.user;

/**
 * @program: taoshopping01
 * @Date: 2018/9/10 19:30
 * @Author: misliu
 * @Description:
 */

public interface userService {

    //新增用户
    int insertUser(user user);

    //验证是否有该用户 Ajax
    int checkUser(String username);

    //用户登录
    user userLogin(user user);
}
