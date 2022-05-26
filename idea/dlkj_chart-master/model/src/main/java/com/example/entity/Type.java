package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "使用單位-实体类")
@TableName(value = "type")
public class Type {
    @TableId(value = "tid")
    private  int  tid;
    @TableField(value = "tname")
    private  String tname;
}
