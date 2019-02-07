package com.hzxy.show.dao;

import com.hzxy.domain.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Auther:lwq
 * @Date:2019/2/7
 * @Description:com.hzxy.show.dao
 * @version:1.0
 */
@Repository
public interface UserDao {

    /*用户登录*/
    User login(@Param("username") String username, @Param("password") String password);

   /*新增用户*/
    int insert(User user);
}
