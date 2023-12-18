package com.lihanlin;

import com.lihanlin.config.JavaConfiguration;
import com.lihanlin.config.JavaConfigurationA;
import com.lihanlin.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testSpringIoCTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        StudentController bean = applicationContext.getBean(StudentController.class);

        System.out.println(bean);
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfigurationA.class);
    }
}
