package com.chen.springboot;

import com.chen.springboot.config.WebServerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author fanchen
 * @Date 2022/9/7 10:33
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan //指定扫描路径
@Import(WebServerAutoConfiguration.class)
public @interface ChenSpringBootApplication {

}
