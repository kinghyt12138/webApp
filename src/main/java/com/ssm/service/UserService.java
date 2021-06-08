package com.ssm.service;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * author:king
 * FileName:UserService
 * Date:2021/6/7  16:07
 */
//@Service
public interface UserService {
    String findAll();
    Integer login(String name,String password);
}
