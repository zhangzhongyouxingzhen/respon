package com.dlkj.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dlkj.demo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
