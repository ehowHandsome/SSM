package com.ehow.dao;

import com.ehow.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by eHow on 2019/1/30.
 */
public interface UserDao {
    /**
    *@Description:根据id查询用户
    *@Param:[id]
    *@return:com.ehow.entity.User
    *@Author:eHow
    *@Date:2019/1/30
    */
    User queryById(String id);
    /**
    *@Description:查询所有用户
    *@Param:[offset, limit]起始位置，查询条数
    *@return:java.util.List<com.ehow.entity.User>
    *@Author:eHow
    *@Date:2019/1/30
    */
    List<User> queryAll(@Param("offset")int offset,@Param("limit")int limit);
    /**
    *@Description:注销用户
    *@Param:[id]
    *@return:java.lang.Boolean
    *@Author:eHow
    *@Date:2019/1/30
    */
    Boolean deleteUserById(String id);
}
