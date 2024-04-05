package com.myhexin.zixun.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @Description
 * @Author zengkai
 * @Date 2020/10/5 23:00
 */
@ConfigurationProperties("test.user")
@Data
public class User {

    private Integer id;

    private String name;

}
