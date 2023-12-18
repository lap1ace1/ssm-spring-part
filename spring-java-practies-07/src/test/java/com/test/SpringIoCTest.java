package com.test;

import com.lihanlin.config.JavaConfig;
import com.lihanlin.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController bean = applicationContext.getBean(StudentController.class);
        bean.findAll();
    }
}
