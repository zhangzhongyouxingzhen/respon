


package com.example.result.handler;
import com.example.result.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 统一异常数据格式返回 -  封装类
 * */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R errorHandler(Exception e){
        e.printStackTrace();
        return  R.ERROR().message("Exception:服务器异常 ");
    }
    @ExceptionHandler(com.javakc.servicebase.handler.CustomException.class)
    @ResponseBody
    public  R errorHandler(com.javakc.servicebase.handler.CustomException e){
        e.printStackTrace();
        return  R.ERROR().code(e.getCode()).message(e.getMsg());
    }
}
