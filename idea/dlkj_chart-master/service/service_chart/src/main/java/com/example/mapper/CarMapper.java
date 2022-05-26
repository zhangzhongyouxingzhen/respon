package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Car;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CarMapper extends BaseMapper<Car> {
    //查询全部
    @Select("select * from  car")
    List<Car> sel();
    //根据id查询
    @Select("select * from  car where caid=#{caid}")
    List<Car> selByid(@Param("caid")int caid);
    //根据id删除
    @Delete("DELETE FROM car where caid=#{caid}")
    int del(@Param("caid")int caid);
}
