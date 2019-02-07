package com.hzxy.show.service.impl;

import com.hzxy.domain.entity.XiangYin;
import com.hzxy.show.dao.XiangyinDao;
import com.hzxy.show.service.XiangyinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class XiangyinServiceImpl implements XiangyinService {

    @Autowired
    private XiangyinDao xiangyinDao;
    @Override
    public int insert(XiangYin xiangyin) {
        if(xiangyin.getId()==null){
            xiangyin.setCreated(new Date());
            xiangyin.setUpdated(new Date());
        }
        return xiangyinDao.insert(xiangyin);
    }

    @Override
    public List<XiangYin> selectAll() {
        return xiangyinDao.selectAll();
    }

    @Override
    public List<XiangYin> selectByType(String type) {
        return xiangyinDao.selectByType(type);
    }

    @Override
    public XiangYin selectById(Long id) {
        return  xiangyinDao.selectById(id);
    }
}
