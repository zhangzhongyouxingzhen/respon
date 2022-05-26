package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Type;
import com.example.until.Ru;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RuMapper extends BaseMapper<Ru> {
    @Select("select client.*,type.tname  from client,type where client.tid = type.tid")
    public List<Ru> getTypeName();
}
