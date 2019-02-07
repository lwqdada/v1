package com.hzxy.show.service.impl;

import com.hzxy.domain.entity.User;
import com.hzxy.show.dao.UserDao;
import com.hzxy.show.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther:lwq
 * @Date:2019/2/7
 * @Description:com.hzxy.show.service.impl
 * @version:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public int add(User user) {
        if(user.getId()==null){
            Date created=new Date();
            Date updated=new Date();
            user.setCreated(created);
            user.setUpdated(updated);
        }
     return userDao.insert(user);
    }
}
