package com.dlkj.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dlkj.demo.entity.Department;
import com.dlkj.demo.mapper.DepartmentMapper;
import com.dlkj.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findData(Long id) {
        QueryWrapper<Department> dep=new QueryWrapper<>();
        dep.eq("parent_id",id);
        List<Department> list=departmentMapper.selectList(dep);
        //向list每个dict对象中设置hasChildren值
        for (Department department : list) {
            Long dictId = department.getId();
            boolean ischild = this.ischildren(dictId);
            department.setHasChildren(ischild);
        }
        return list;
    }

    //判断id下面是否有子节点
    public boolean ischildren(Long id) {
        QueryWrapper<Department> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        Integer count = baseMapper.selectCount(wrapper);
        return count > 0;
    }
}
