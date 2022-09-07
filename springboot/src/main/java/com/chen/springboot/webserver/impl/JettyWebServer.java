package com.chen.springboot.webserver.impl;

import com.chen.springboot.webserver.WebServer;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author fanchen
 * @Date 2022/9/7 11:01
 */
public class JettyWebServer implements WebServer {
    @Override
    public void start(WebApplicationContext applicationContext) {
        System.out.println("启动Jetty");
    }
}
