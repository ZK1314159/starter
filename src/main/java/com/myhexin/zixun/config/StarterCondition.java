package com.myhexin.zixun.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import lombok.Data;

/**
 * Description
 *
 * @author zengkai
 * Date: 2021/12/14 15:00
 */
@Data
public class StarterCondition implements Condition {

    private Integer id;

    private String name;

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}
