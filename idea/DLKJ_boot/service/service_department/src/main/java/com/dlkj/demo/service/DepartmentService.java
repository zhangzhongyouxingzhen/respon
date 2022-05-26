package com.dlkj.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dlkj.demo.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DepartmentService extends IService<Department> {

    List<Department> findData(Long id);

    boolean ischildren(Long id);
}
