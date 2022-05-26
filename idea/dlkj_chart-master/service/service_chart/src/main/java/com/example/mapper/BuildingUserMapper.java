package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.buildinguser;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface BuildingUserMapper extends BaseMapper<buildinguser> {

    @Select("SELECT a.*,b.vname FROM buildinguser a INNER JOIN visible b WHERE a.`visible`=b.`vid`")
    List<buildinguser> selbuser();

    @Select("Select uid,uname from buildinguser")
    List<buildinguser> selbuserId();

    @Insert("INSERT INTO buildinguser (uname,shortpost,longest,visible,usernum,carnum,uuid) VALUES (#{uname},#{shortpost},#{longest},#{visible},#{usernum},#{carnum},#{uuid})")
    int insert(@Param("uname")String uname, @Param("shortpost")int shortpost, @Param("longest")int longest, @Param("visible")int visible, @Param("usernum")int usernum, @Param("carnum")int carnum, @Param("uuid")int uuid);

    @Delete("DELETE FROM buildinguser where uid=#{uid} or uuid=#{uid}")
    int del(@Param("uid")int uid);

    @Select("Select * from buildinguser where uid=#{uid}")
    List<buildinguser> selByid(@Param("uid")int uid);

    @Update("UPDATE buildinguser SET uname=#{uname},shortpost=#{shortpost},longest=#{longest},visible=#{visible},usernum=#{usernum},carnum=#{carnum},uuid=#{uuid} where uid=#{uid}")
    int update(@Param("uid")int uid,@Param("uname")String uname, @Param("shortpost")int shortpost, @Param("longest")int longest, @Param("visible")int visible, @Param("usernum")int usernum, @Param("carnum")int carnum, @Param("uuid")int uuid);
}
