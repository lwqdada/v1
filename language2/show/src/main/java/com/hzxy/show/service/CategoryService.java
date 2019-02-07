package com.hzxy.show.service;

import com.hzxy.domain.entity.Category;

import java.util.List;

public interface CategoryService {
    /*查看所有分类*/
    List<Category> selectAll();


    /*根据id查找相应的类别*/
    Category selectById();
}
