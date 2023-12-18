package com.lihanlin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("com.lihanlin.ioc_01")
@PropertySource(value="classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {
    @Value("${atguigu.url}")
    private String url;
    @Value("${atguigu.driver}")
    private String driver;
    @Value("${atguigu.username}")
    private String username;
    @Value("${atguigu.password}")
    private String password;
    @Bean(value = "lidoudou")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource lidoudodu){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //需要DataSource 需要ioc容器的其他组件
        //如果其他组件也是@Bean方法，可以直接调用
        jdbcTemplate.setDataSource(lidoudodu);
        return jdbcTemplate;
    }
}
