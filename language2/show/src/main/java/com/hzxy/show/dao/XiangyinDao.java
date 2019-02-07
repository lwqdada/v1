package com.hzxy.show.dao;

import com.hzxy.domain.entity.XiangYin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XiangyinDao {

    //新增
    int insert(XiangYin xiangyin);

    //展示所有信息
    List<XiangYin> selectAll();


    //跟据类型查询记录
    List<XiangYin> selectByType(String type);

    //根据Id查询记录
    XiangYin selectById(Long id);

}
