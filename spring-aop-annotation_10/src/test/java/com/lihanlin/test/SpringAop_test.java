package com.lihanlin.test;

import com.lihanlin.config.JavaConfig;
import com.lihanlin.service.Calculator;
import com.lihanlin.service.impl.CalculatorPureImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring.xml")
public class SpringAop_test {
    @Autowired
    private Calculator calculator;

    @Test
    public void test1(){
        int add = calculator.add(1,2);
        System.out.println(add);
    }
}
