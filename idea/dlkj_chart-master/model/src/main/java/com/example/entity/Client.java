package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@ApiModel(description = "客户-实体类")
@TableName(value = "client")
public class Client {
    @TableId(value = "cid")
    private int cid;
    @TableField(value = "cname")
    private  String  cname;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "name")
    private  String  name;
    @TableField(value = "organ_num")
    private int organNum;
    @TableField(value = "law_person")
    private String lawPerson;
    @TableField(value = "phone")
    private  String phone;
    @TableField(value = "tid")
    private  int tid;
    @TableField(value = "staff")
    private  int staff;
    @TableField(value = "now_location")
    private  String nowLocation;
    @TableField(value = "location")
    private String location;
    @TableField(value = "comment")
    private  String comment;
    @TableField(value = "password")
    private String password;
    @TableField(value = "username")
    private  String username;
}
