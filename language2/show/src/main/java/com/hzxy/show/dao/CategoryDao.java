package com.hzxy.show.dao;

import com.hzxy.domain.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
    /*查看所有分类*/
    List<Category> selectAll();

    /*根据id查找分类*/
    Category selectById();
}
