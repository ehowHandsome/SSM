package com.ehow.test.dao;

import com.ehow.dao.UserDao;
import com.ehow.entity.User;
import com.ehow.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by eHow on 2019/1/30.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void testQueryById(){
        String id = "1";
        User user = userDao.queryById(id);
        System.out.println("------------"+user.toString());
    }

    @Test
    public void testQueryByAll(){
        List<User> users = userDao.queryAll(0,3);
        for (User user:users){
            System.out.println("----"+user.toString());
        }
    }
}
