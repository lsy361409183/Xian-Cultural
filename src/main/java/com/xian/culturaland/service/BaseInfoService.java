package com.xian.culturaland.service;

import com.xian.culturaland.entity.BaseInfo;
import com.xian.culturaland.mapper.BaseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInfoService {
    @Autowired
    private BaseInfoMapper baseInfoMapper;
    //查询出文地的基本信息：区域、类别、名称、位置
    public List<BaseInfo> selectAllInfo(){
        return baseInfoMapper.selectAllInfo();
    }
}
