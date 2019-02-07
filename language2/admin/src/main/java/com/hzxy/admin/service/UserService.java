package com.hzxy.admin.service;

import com.hzxy.admin.base.BaseService;
import com.hzxy.domain.entity.User;
import java.util.List;

public interface UserService extends BaseService<User> {



    List<User> selectByName(String username);



    User login(String username, String password);


}
