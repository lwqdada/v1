package com.hzxy.show.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:lwq
 * @Date:2019/2/3
 * @Description:com.hzxy.show.web.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/content")
public class RecordController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String selectALL(){
        return "content_list";
    }

    @GetMapping("/record")
    public String record(){
        return "record";
    }

    @GetMapping("/languageMain")
    public String language(){
        return "language_main";
    }

}
