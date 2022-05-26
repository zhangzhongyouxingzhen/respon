package com.dlkj.demo.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dlkj.demo.vo.PeopleQuery;
import com.dlkj.demo.mapper.SalespeopleMapper;
import com.dlkj.demo.entity.Salespeople;
import com.dlkj.demo.service.SalespeopleService;
import org.springframework.stereotype.Service;

/**
 * 人员信息(Salespeople)表服务实现类
 *
 * @author makejava
 * @since 2022-03-31 10:53:01
 */
@Service
public class SalespeopleServiceImpl extends ServiceImpl<SalespeopleMapper, Salespeople> implements SalespeopleService {


    @Override
    public void findPagePeople(Page<Salespeople> bookPage, PeopleQuery peopleQuery) {

    }
}
