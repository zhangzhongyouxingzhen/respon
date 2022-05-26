package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.buildinguser;
import com.example.mapper.BuildingUserMapper;
import com.example.service.BuildingUserService;
import org.springframework.stereotype.Service;

@Service
public class BuildingUserServiceImpl extends ServiceImpl<BuildingUserMapper, buildinguser> implements BuildingUserService {
}
