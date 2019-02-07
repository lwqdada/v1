package com.hzxy.show.service.impl;

import com.hzxy.domain.entity.AreaContent;
import com.hzxy.show.dao.ConentDao;
import com.hzxy.show.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  ContentServiceImpl implements ContentService {
    @Autowired
    private ConentDao conentDao;
    @Override
    public List<AreaContent> selectAll() {
        return conentDao.selectAll();
    }

    @Override
    public List<AreaContent> selectAllByCategoryId(Long id) {
        return conentDao.selectAllByCategoryId(id);
    }

    @Override
    public AreaContent selectById(Long id) {
        return conentDao.selectById(id);
    }
}
