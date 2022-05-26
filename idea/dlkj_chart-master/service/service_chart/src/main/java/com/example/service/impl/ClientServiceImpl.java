package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Client;
import com.example.entity.Type;
import com.example.mapper.ClientMapper;
import com.example.mapper.RuMapper;
import com.example.service.ClientService;
import com.example.until.ClientQuery;
import com.example.until.Ru;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client>implements ClientService {
    @Override
    public void findPageBook(Page<Client> clientPage, Ru ru) {
        QueryWrapper<Client> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(ru)) {
            String cname = ru.getCname();
            if (!ObjectUtils.isEmpty(cname)) {
                queryWrapper.like("cname", cname);
            }
        }
        queryWrapper.orderByDesc("create_time");
        baseMapper.selectPage(clientPage,queryWrapper);
    }
    }
