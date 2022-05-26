package com.javakc.servicebase.handler;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // ##使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor
public class CustomException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;
}
