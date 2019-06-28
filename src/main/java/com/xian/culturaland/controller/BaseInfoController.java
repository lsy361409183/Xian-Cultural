package com.xian.culturaland.controller;

import com.xian.culturaland.entity.BaseInfo;
import com.xian.culturaland.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseInfoController {
    @Autowired
    private BaseInfoService baseInfoService;
    //查询出文地的基本信息：区域、类别、名称、位置
    @RequestMapping("/getdata")
    @ResponseBody
    public List<BaseInfo> selectAllInfo(){
        return baseInfoService.selectAllInfo();
    }

    //根据区域查询得到文地的信息
    @RequestMapping("/getRegionData")
    @ResponseBody
    public List<BaseInfo> selectInfoByRegion(@RequestParam("CulturalRegion")String CulturalRegion){
        System.out.println(CulturalRegion);
        return baseInfoService.selectInfoByRegion(CulturalRegion);
    }
}
