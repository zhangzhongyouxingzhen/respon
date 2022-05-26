package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClientMapper extends BaseMapper<Client> {


//    @Insert("INSERT INTO CLIENT (cname,create_time,name,organ_num,law_person,phone,tid,staff,now_location,location,COMMENT) VALUES (#{cname},#{create_time},#{name},#{organ_num},#{law_person},#{phone},#{tid},#{staff},#{now_location},#{location},#{COMMENT})")
//    int insert(@Param("cname")String cname,@Param("create_time")String create_time,@Param("name")String name,@Param("organ_num")int organ_num,@Param("law_person")String law_person,@Param("phone")String phone,@Param("tid")int tid,@Param("staff")int staff,@Param("now_location")String now_location,@Param("location")String location,@Param("COMMENT")String COMMENT);
    @Select("select client.*,type.tname from client,type where client.tid = type.tid")
    public List<Client> getTypeName();
}
