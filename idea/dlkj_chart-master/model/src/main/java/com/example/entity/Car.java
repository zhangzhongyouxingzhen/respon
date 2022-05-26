package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "车辆-实体类")
@TableName(value = "car")
public class Car {
    @TableId(value = "caid")
    private int caid;
    @TableId(value = "plate")
    private String plate;
    @TableId(value = "simid")
    private String simid;
    @TableId(value = "eid")
    private String eid;
    @TableId(value = "cpassword")
    private String cpassword;
    @TableId(value = "cmid")
    private int cmid;
    @TableId(value = "vender")
    private String vender;
    @TableId(value = "ctype")
    private int ctype;
    @TableId(value = "iconid")
    private int iconid;
    @TableId(value = "useid")
    private int useid;
    @TableId(value = "colorid")
    private int colorid;
    @TableId(value = "timeid")
    private int timeid;
    @TableId(value = "cid")
    private int cid;
    @TableId(value = "oil")
    private int oil;
    @TableId(value = "positionid")
    private int positionid;
    @TableId(value = "time_id")
    private int time_id;
    @TableId(value = "pcid")
    private int pcid;
    @TableId(value = "comment")
    private String comment;
}
