package com.chen.springboot;

import com.chen.springboot.webserver.WebServer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

/**
 * @Author fanchen
 * @Date 2022/9/7 10:34
 */
public class ChenSpringApplication {

    public static void run(Class clazz) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh(); //解析类上的注解

        WebServer webServer = getWebServer(applicationContext);
        webServer.start(applicationContext);
    }

    public static  WebServer getWebServer(ApplicationContext applicationContext){
        //判断
        Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);

        if (beansOfType.isEmpty()) {
            throw new  NullPointerException();
        }

        if (beansOfType.size() > 1) {
            throw new IllegalStateException();
        }


        return beansOfType.values().stream().findFirst().get();
    }


}
