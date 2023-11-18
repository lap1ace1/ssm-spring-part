package com.lihanlin;

import com.lihanlin.ioc03.HappyComponent;
import com.lihanlin.ioc05.JavaBean;
import com.lihanlin.ioc05.JavaBeanFactorBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringIoCTest {
//    如何创建ioc容器并且配置文件
@Test

public void creatIoC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
    }
//    如何在IoC容器中获取Bean
    @Test
    public void getBeanFromIoC(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        //1.需要强转
       // HappyComponent happyComponent = (HappyComponent) classPathXmlApplicationContext.getBean("happyComponent");
        //2.
        HappyComponent happyComponent1 = classPathXmlApplicationContext.getBean("happyComponent", HappyComponent.class);

        happyComponent1.doWork();


    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("spring-04.xml");
        classPathXmlApplicationContext.close();
    }
    @Test
    public void test3(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean javaBean = classPathXmlApplicationContext.getBean("javaBean", JavaBean.class);
        System.out.println("javaben"+javaBean);
        classPathXmlApplicationContext.close();
    }
}
