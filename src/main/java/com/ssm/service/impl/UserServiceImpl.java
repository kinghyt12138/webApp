package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:king
 * FileName:UserServiceImpl
 * Date:2021/6/7  16:07
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired //成员属性字段使用 @Autowired，无需字段的 set 方法
    private UserDao userDao;

    @Override
    public String findAll() {
        return userDao.findAll();
    }

    @Override
    public Integer login(String name, String password) {
        return userDao.login(name,password);
    }


}
