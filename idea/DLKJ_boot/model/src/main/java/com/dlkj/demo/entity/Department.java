package com.dlkj.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 部门表(Department)表实体类
 *
 * @author makejava
 * @since 2022-03-31 10:23:39
 */
@Data
@ApiModel(description = "部门表")
@TableName("department")
public class Department extends Model<Department> {
    //主键
    @ApiModelProperty("id")
    @TableId
    private Long id;
    //管理员
    @ApiModelProperty("管理员")
    @TableField("admin")
    private String admin;
    //子集id
    @ApiModelProperty("子集id")
    @TableField("parent_id")
    private String parentId;
    //部门名称
    @ApiModelProperty("部门名称")
    @TableField("name")
    private String name;
    //菜单url
    @ApiModelProperty("菜单url")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "是否包含子节点")
    @TableField(exist = false)
    private boolean hasChildren;
    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
