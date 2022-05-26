package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "使用人员-实体类")
@TableName(value = "buildinguser")
public class buildinguser {
    @TableId(value = "uid")
    private int uid;
    @TableId(value = "uname")
    private String uname;
    @TableId(value = "shortpost")
    private int shortpost;
    @TableId(value = "longest")
    private int longest;
    @TableId(value = "visible")
    private int visible;
    @TableId(value = "usernum")
    private int usernum;
    @TableId(value = "carnum")
    private int carnum;
    @TableId(value = "permissions")
    private int permissions;
    @TableId(value = "uuid")
    private int uuid;
    @TableId(value = "vname")
    private String vname;
}
