package com.ssm.dao;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * author:king
 * FileName:UserDao
 * Date:2021/6/7  16:38
 */
public interface UserDao {
    String findAll();
    Integer login(@Param("name") String name, @Param("password") String password);
}
