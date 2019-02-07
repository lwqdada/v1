package com.hzxy.show.service;

import com.hzxy.domain.entity.User;

/**
 * @Auther:lwq
 * @Date:2019/2/7
 * @Description:com.hzxy.show.service
 * @version:1.0
 */

public interface UserService {
    /*用户登录*/
    User login(String username, String password);

    /*新增用户*/
    int add(User user);
}
