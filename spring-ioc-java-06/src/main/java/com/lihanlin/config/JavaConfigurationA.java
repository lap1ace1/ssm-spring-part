package com.lihanlin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//导入其他配置类
@Import(value = {JavaConfigurationB.class})

@Configuration
public class JavaConfigurationA {
}
