package com.chen.user;

import com.chen.springboot.ChenSpringApplication;
import com.chen.springboot.ChenSpringBootApplication;
import com.chen.springboot.config.WebServerAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @Author fanchen
 * @Date 2022/9/7 10:32
 */
@ChenSpringBootApplication
@Import(WebServerAutoConfiguration.class)
public class MyApplication {

    public static void main(String[] args) {
        ChenSpringApplication.run(MyApplication.class);
    }
}
