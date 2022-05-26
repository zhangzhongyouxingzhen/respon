package com.dlkj.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dlkj.demo.entity.Salespeople;
import com.dlkj.demo.result.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 人员信息(Salespeople)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-31 10:52:59
 */
@Mapper
public interface SalespeopleMapper extends BaseMapper<Salespeople> {
//    public int delbyid(@Param("id")int id);
}
