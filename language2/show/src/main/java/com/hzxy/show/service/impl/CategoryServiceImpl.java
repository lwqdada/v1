package com.hzxy.show.service.impl;

import com.hzxy.domain.entity.Category;
import com.hzxy.show.dao.CategoryDao;
import com.hzxy.show.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<Category> selectAll() {
        return categoryDao.selectAll();
    }

    @Override
    public Category selectById() {
        return  categoryDao.selectById();
    }
}
