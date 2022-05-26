package com.example.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/*
* 统一数据格式 - 封装类
*
* */
@Data
public class R {
    private  Integer code;
    private  String message;
    private  Boolean success;
    private Map<String,Object> data = new HashMap<>();
    private R(){

    }
   public static  R OK(){
     R r =new R();
     r.setCode(ResponseCode.SUCCESS);
     r.setMessage("调用成功");
     r.setSuccess(true);
     return  r;
   }
   public  static  R ERROR(){
        R r =new R();
        r.setCode(ResponseCode.ERROR);
        r.setMessage("发生意外性错误，请联系管理员");
        r.setSuccess(false);
        return  r;
   }
   public  R code(Integer code){
        this.setCode(code);
        return  this;
   }
   public  R message(String message){
        this.setMessage(message);
         return this;
    }
    public  R success(Boolean success){
        this.setSuccess(success);
         return  this;
    }
    public R data(String key,Object value){
        this.data.put(key,value);
        return this;
    }
    public R data(Map<String,Object> data){
        this.setData(data);
        return this;
    }
}
