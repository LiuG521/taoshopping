package com.cssl.service.impl;

import com.cssl.dao.userDao;
import com.cssl.pojo.user;
import com.cssl.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: taoshopping01
 * @Date: 2018/9/10 19:31
 * @Author: misliu
 * @Description:
 */
@Service
@Transactional
@AutoConfigureAfter(userService.class)
public class userServiceImpl implements userService {


    @Autowired
    private userDao usDao;


    //新增用户
    @Override
    public int insertUser(user user) {
        return usDao.insertUser(user);
    }

    //Ajax验证用户名
    @Override
    public int checkUser(String username) {
        return usDao.checkUser(username);
    }


    //用户登陆
    @Override
    public user userLogin(user user) {
        return usDao.userLogin(user);
    }
}
