package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.mapper.BuildingUserMapper;
import com.example.result.Result;
import com.towery.util.TreeMenuUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(tags = "使用者" )
@RestController
@RequestMapping("/admin/buser")
public class BuildingUserController {
    @Autowired
    private BuildingUserMapper bMapper;

    @GetMapping("/sel")
    @ResponseBody
    public Object seltree(){
        List list=bMapper.selbuser();
        JSONArray arr=JSONArray.parseArray(JSON.toJSONString(list));
        com.towery.util.TreeMenuUtil totree=new TreeMenuUtil();
        return totree.listToTree(arr,"uid","uuid","children");
    }

    @GetMapping("/getId")
    @ResponseBody
    public Object selId(){
        List list=bMapper.selbuserId();
        return list;
    }

    @GetMapping("saveBuser")
    @ResponseBody
    public Result insert(@RequestParam("uname")String uname, @RequestParam("shortpost")int shortpost, @RequestParam("longest")int longest, @RequestParam("visible")int visible, @RequestParam("usernum")int usernum, @RequestParam("carnum")int carnum, @RequestParam("uuid")int uuid) {
        int num = bMapper.insert(uname, shortpost, longest, visible, usernum, carnum, uuid);
        if (num > 0) {
            return Result.ok();
        } else
            return Result.fail();
    }

    @GetMapping("delBuser")
    @ResponseBody
    public Object del(@RequestParam("uid")int id){
        int num=bMapper.del(id);
        if (num > 0) {
            return "删除成功";
        } else
            return "删除失败";
    }

    @GetMapping("/updByid")
    @ResponseBody
    public Object update(@RequestParam("uid")int uid,@RequestParam("uname")String uname, @RequestParam("shortpost")int shortpost, @RequestParam("longest")int longest, @RequestParam("visible")int visible, @RequestParam("usernum")int usernum, @RequestParam("carnum")int carnum, @RequestParam("uuid")int uuid) {
        int num=bMapper.update(uid, uname, shortpost, longest, visible, usernum, carnum, uuid);
        if (num > 0) {
            return "修改成功";
        } else
            return "修改失败";
    }

    @GetMapping("/selByid")
    @ResponseBody
    public Object selByid(@RequestParam("uid")int id){
        List list=bMapper.selByid(id);
        return JSON.toJSONString(list);
    }
}
