package com.lihanlin.test;

import com.lihanlin.ioc_01.XxxDao;
import com.lihanlin.ioc_01.XxxService;
import com.lihanlin.ioc_02.JavaBean;
import com.lihanlin.ioc_03.UserController;
import com.lihanlin.ioc_03.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");

        XxxDao bean = applicationContext.getBean("xxxDao", XxxDao.class);
        System.out.println(bean);

        XxxService xxxService = applicationContext.getBean("xxxService", XxxService.class);
        System.out.println("xxxService"+xxxService);

        applicationContext.close();
    }
    @Test
    public void testIoC(){
        ClassPathXmlApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("spring-02.xml");

        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);

        applicationContext.close();
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController bean = applicationContext.getBean(UserController.class);

        bean.show();

    }
    @Test
    public void test3(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-04.xml");

        com.lihanlin.ioc_4.JavaBean javaBean
                = applicationContext.getBean( com.lihanlin.ioc_4.JavaBean.class);

        System.out.println(javaBean);

    }
}
