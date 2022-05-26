package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.mapper.CarMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "车辆" )
@RestController
@RequestMapping("/admin/car")
public class CarController {
    @Autowired
    private CarMapper mapper;

    @GetMapping("/sel")
    @ResponseBody
    public Object seltree(){
        List list=mapper.sel();
        return list;
    }

    @GetMapping("/selCar")
    @ResponseBody
    public Object selByid(@RequestParam("caid")int caid){
        List list=mapper.selByid(caid);
        return JSON.toJSONString(list);
    }

    @GetMapping("delCar")
    @ResponseBody
    public Object del(@RequestParam("caid")int id){
        int num=mapper.del(id);
        if (num > 0) {
            return "删除成功";
        } else
            return "删除失败";
    }
}
