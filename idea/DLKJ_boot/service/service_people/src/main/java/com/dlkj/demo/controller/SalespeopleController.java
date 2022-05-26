package com.dlkj.demo.controller;

import com.dlkj.demo.entity.Salespeople;
import com.dlkj.demo.mapper.SalespeopleMapper;
import com.dlkj.demo.result.Result;
import com.dlkj.demo.service.SalespeopleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@CrossOrigin
@Api(tags = "人员管理")
@RestController
@RequestMapping("/admin/sales")
public class SalespeopleController {
    @Resource
    SalespeopleMapper salespeopleMapper;
    @Autowired
    private SalespeopleService salespeopleService;
    @ApiOperation(value = "查询数据")
    @GetMapping("/sec")
    public Result findAll(HttpServletResponse response){
        List<Salespeople> list=  salespeopleService.list();
        response.setHeader("Access-Control-Allow-Origin","*");
        return  Result.ok(list);
    }
    @ApiOperation(value = "新增人员")
    @PostMapping("savePeople")
    public Result saveBook(@RequestBody Salespeople salespeople) {
        boolean flag = salespeopleService.save(salespeople);
        if (flag)
            return Result.ok();
        else
            return Result.fail() ;
    }
    @ApiOperation(value = "修改人员信息")
    @PutMapping("updatePeople")

    public Result updateBook(@RequestBody Salespeople salespeople) {
        boolean flag = salespeopleService.updateById(salespeople);
        if (flag)
            return Result.ok();
        else
            return Result.fail();
    }
    @ApiOperation(value = "根据 ID 查询人员信息")
    @GetMapping("ret/{peopleId}")
    public Result getBookById(@PathVariable("peopleId") String peopleId) {
        Salespeople people = salespeopleService.getById(peopleId);
        return Result.ok(people);
    }
//    @RequestMapping(value = "/delete")
//    @ResponseBody()
//    public void deleteBookById(int id) {
//        int num=salespeopleMapper.delbyid(id);
//        if (num>0){
//            System.out.println("删除成功");
//        }else {
//            System.out.println("删除失败");
//        }
//    }
    @ApiOperation(value = "根据 ID 删除人员信息")
    @DeleteMapping("del/{peopleId}")
    @ResponseBody()
    @CrossOrigin
    public Result deleteBookById(@PathVariable("peopleId") String peopleId ) {
        boolean flag = salespeopleService.removeById(peopleId);
        if (flag)
            return Result.ok();
        else
            return Result.fail();
    }
}
