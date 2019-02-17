package com.ehow.service;

import com.ehow.entity.User;

import java.util.List;

/**
 * Created by eHow on 2019/1/30.
 */
public interface UserService {
    /**
    *@Description:通过id获取用户信息
    *@Param:[id]
    *@return:com.ehow.entity.User
    *@Author:eHow
    *@Date:2019/1/30
    */
    User getById(String id);
    /**
    *@Description:获取所有用户信息
    *@Param:[]
    *@return:java.util.List<com.ehow.entity.User>
    *@Author:eHow
    *@Date:2019/1/30
    */
    List<User> getAll();
    /**
    *@Description:根据id注销对应用户
    *@Param:[id]
    *@return:java.lang.Boolean
    *@Author:eHow
    *@Date:2019/1/30
    */
    Boolean deleteById(String id);
}
