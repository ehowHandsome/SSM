package com.ehow.serviceImpl;

import com.ehow.dao.UserDao;
import com.ehow.entity.User;
import com.ehow.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;



/**
 * Created by eHow on 2019/1/30.
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;
    @Override
    public User getById(String id) {
        return userDao.queryById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.queryAll(0,20);
    }

    @Override
    public Boolean deleteById(String id) {
        return userDao.deleteUserById(id);
    }
}
