package com.myhexin.zixun.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author zengkai
 * @Date 2020/10/5 23:01
 */
@Conditional({StarterCondition.class})
//@ConditionalOnClass()
@Configuration
@EnableConfigurationProperties(User.class)
public class UserAutoConfiguration {

    @Bean
    public UserService getBean(User user) {
        UserService userService = new UserService();
        userService.setId(user.getId());
        userService.setName(user.getName());
        return userService;
    }

}
