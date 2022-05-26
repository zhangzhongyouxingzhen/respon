package com.dlkj.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dlkj.demo.vo.PeopleQuery;
import com.dlkj.demo.entity.Salespeople;


/**
 * 人员信息(Salespeople)表服务接口
 *
 * @author makejava
 * @since 2022-03-31 10:53:01
 */
public interface SalespeopleService extends IService<Salespeople> {
    void findPagePeople(Page<Salespeople> bookPage, PeopleQuery peopleQuery);
}
