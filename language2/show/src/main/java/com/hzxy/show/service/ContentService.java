package com.hzxy.show.service;

import com.hzxy.domain.entity.AreaContent;

import java.util.List;

public interface ContentService {
    //查询所有内容信息
    List<AreaContent> selectAll();

    //根据分类id查找内容信息
    List<AreaContent> selectAllByCategoryId(Long id);

    //根据id查找内容信息
    AreaContent selectById(Long id);

}