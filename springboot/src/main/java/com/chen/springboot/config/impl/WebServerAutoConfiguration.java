package com.chen.springboot.config.impl;

import com.chen.springboot.condition.ChenConditionalOnClass;
import com.chen.springboot.config.AutoConfiguration;
import com.chen.springboot.webserver.impl.JettyWebServer;
import com.chen.springboot.webserver.impl.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author fanchen
 * @Date 2022/9/7 11:06
 */
@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration {
    @Bean
    @ChenConditionalOnClass(name = "org.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer() {
        return new TomcatWebServer();
    }

    @Bean
    @ChenConditionalOnClass(name = "org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer() {
        return new JettyWebServer();
    }
}
