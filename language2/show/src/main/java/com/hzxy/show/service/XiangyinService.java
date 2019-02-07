package com.hzxy.show.service;


import com.hzxy.domain.entity.XiangYin;

import java.util.List;

public interface XiangyinService {
    //新增
    int insert(XiangYin xiangyin);

    //展示所有信息
    List<XiangYin> selectAll();

    //跟据类型查询记录
    List<XiangYin> selectByType(String type);

    //根据Id查询记录
    XiangYin selectById(Long id);
}
