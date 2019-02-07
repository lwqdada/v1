package com.hzxy.show.web.api;

import com.hzxy.domain.entity.Category;
import com.hzxy.domain.utils.ResultModel;
import com.hzxy.domain.utils.ResultTools;
import com.hzxy.show.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/show/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/selectAll")
    public  ResultModel selectAll(){
        Map<String,Object> result=new HashMap<>();
        List<Category> categories = categoryService.selectAll();
        int flag=0;
        if(categories.size()==0){
            flag=1;
        }
        result.put("data",categories);
        return ResultTools.result(flag,"",result);
    }



}