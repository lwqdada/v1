package com.hzxy.show.web.api;

import com.hzxy.domain.entity.User;
import com.hzxy.show.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:lwq
 * @Date:2019/2/7
 * @Description:com.hzxy.show.web.api
 * @version:1.0
 */

@RestController
@RequestMapping("/show")
public class UserController {

    @Autowired
    private UserService userService;

    /*用户登录*/
    @RequestMapping("/login")
    public Map<String,Object> login(String username,String password){
        Map<String,Object> result=new HashMap<>();
        User user= userService.login(username, password);
        String msg=null;
        if(user!=null){
           msg="欢迎回来!";
        }else{
            msg="不存在此用户！";
        }
        result.put("msg",msg);
        result.put("user",user);
        return result;
    }

    /*用户注册*/
    @PostMapping("/register")
    public Map<String,Object> register(User user){
        Map<String,Object> result=new HashMap<>();
        int flag= userService.add(user);
        String msg=null;
        if(flag!=0){
            msg="用户注册成功！,请去登录！";
        }else{
            msg="用户注册失败！";
        }
        result.put("msg",msg);
        return result;

    }



    /*用户注销*/





}
