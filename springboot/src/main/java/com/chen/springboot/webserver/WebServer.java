package com.chen.springboot.webserver;

import org.springframework.web.context.WebApplicationContext;

/**
 * @Author fanchen
 * @Date 2022/9/7 11:01
 */
public interface WebServer {
    public void start(WebApplicationContext applicationContext);
}
