package com.dlkj.demo.controller;

import com.dlkj.demo.config.Layui;
import com.dlkj.demo.entity.Department;
import com.dlkj.demo.result.Result;
import com.dlkj.demo.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "部门管理")
@RequestMapping("/admin/dep")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/findId/{id}")
    @ApiOperation("根据id查询列表")
    public Result findAll(@PathVariable("id") Long id){
        List<Department> data = departmentService.findData(id);
        return Result.ok(data);
    }

    @GetMapping("/findAll")
    @ApiOperation("查询所有部门")
    @ResponseBody
    public Result findAll(){
        List<Department> data = departmentService.list();
        return Result.ok(data);
    }
}
