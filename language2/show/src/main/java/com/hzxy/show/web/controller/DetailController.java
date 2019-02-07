package com.hzxy.show.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DetailController {

    @RequestMapping("/category")
    @GetMapping(value={"/平桂话","/八步话"})
    public String pinggui(){

        return "detail";
    }
}
