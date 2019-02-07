package com.hzxy.show.dao;

import com.hzxy.domain.entity.AreaContent;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface ConentDao {

    //查询所有内容信息
     List<AreaContent> selectAll();


     //根据分类id查找内容信息
    List<AreaContent> selectAllByCategoryId(Long id);

    //根据id查找内容信息
    AreaContent selectById(Long id);

}
