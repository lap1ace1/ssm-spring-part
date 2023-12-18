package com.lihanlin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lihanlin")
@EnableAspectJAutoProxy
public class JavaConfig {

}
