package com.dlkj.demo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijian
 * @create 2021-04-24 17:42
 */
@Configuration
@MapperScan("com.dlkj.demo.mapper")
public class DepConfig {
    public class HospConfig {
        /**
         * 分页插件
         */
        @Bean
        public PaginationInterceptor paginationInterceptor() {
            return new PaginationInterceptor();
        }
    }
}
