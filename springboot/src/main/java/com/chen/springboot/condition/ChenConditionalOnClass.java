package com.chen.springboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Author fanchen
 * @Date 2022/9/7 11:09
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(ChenOnClassCondition.class)
public @interface ChenConditionalOnClass {
    String name() default "";
}
