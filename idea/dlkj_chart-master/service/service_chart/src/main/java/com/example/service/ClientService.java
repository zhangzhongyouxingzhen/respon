package com.example.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Client;
import com.example.entity.Type;
import com.example.until.ClientQuery;
import com.example.until.Ru;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

public interface ClientService extends IService<Client> {

    void findPageBook(Page<Client> bookPage, Ru ru);

}
