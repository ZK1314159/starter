package com.myhexin.zixun.config;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author zengkai
 * @Date 2020/10/5 23:34
 */
@Data
public class UserService {

    public static Logger logger = LoggerFactory.getLogger(UserService.class);

    private Integer id;

    private String name;

    public void print() {
        logger.info("test!");
    }
}
