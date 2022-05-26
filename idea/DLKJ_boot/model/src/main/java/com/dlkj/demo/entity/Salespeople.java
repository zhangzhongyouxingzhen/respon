package com.dlkj.demo.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 人员信息(Salespeople)表实体类
 *
 * @author makejava
 * @since 2022-03-31 10:54:23
 */
@SuppressWarnings("serial")
public class Salespeople extends Model<Salespeople> {
    //主键
    private Integer id;
    //名称
    private String name;
    //性别
    private Integer gender;
    //电话
    private String phone;
    //邮箱
    private String email;
    //学历
    private String degree;
    //工资
    private Integer wages;
    //密码
    private String secret;
    //入职时间
    private Object entryTime;
    //隶属部门
    private Integer subDepart;
    //人员状态
    private Integer personStatus;
    //出生日期
    private Object dateBitrh;
    //工号
    private Integer workNumber;
    //创建人
    private String createdBy;
    //创建时间
    private Date createdTime;
    //更新人
    private Integer updatedBy;
    //更新时间
    private Date updatedTime;

    private String admin;
    //子集id

    private String parentId;
    //部门名称

    private String departname;
    //菜单url

    private String url;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getWages() {
        return wages;
    }

    public void setWages(Integer wages) {
        this.wages = wages;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Object getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Object entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getSubDepart() {
        return subDepart;
    }

    public void setSubDepart(Integer subDepart) {
        this.subDepart = subDepart;
    }

    public Integer getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(Integer personStatus) {
        this.personStatus = personStatus;
    }

    public Object getDateBitrh() {
        return dateBitrh;
    }

    public void setDateBitrh(Object dateBitrh) {
        this.dateBitrh = dateBitrh;
    }

    public Integer getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(Integer workNumber) {
        this.workNumber = workNumber;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }


    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }
}
