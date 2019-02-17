package com.ehow.test.service.impl;

import com.ehow.entity.User;
import com.ehow.service.UserService;
import com.ehow.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by eHow on 2019/1/30.
 */
public class UserServieImplTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        String id = "1";
        User  user =userService.getById(id);
        System.out.println("-----" + user);
        List<User> users = userService.getAll();
        for (User u :users){
            System.out.println("---------before:");
            System.out.println(u.toString());
            userService.deleteById(u.getId());
        }
        List<User> u1=userService.getAll();
        for (User u2:u1){
            System.out.println("---------after:");
            System.out.println(u2.toString());
        }
    }

}
