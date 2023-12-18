package com.lihanlin;


/**
 * 实现计算接口,单纯添加 + - * / 实现! 掺杂其他功能!
 */
public class CalculatorPureImpl implements Calculator {
    private Calculator calculator;
    public void StaticProxyCalculator(Calculator target){
        this.calculator = target;
    }
    
    @Override
    public int add(int i, int j) {

        System.out.println("i = " + i + ", j = " + j);

        int result = calculator.add(11, 1);

        System.out.println("result = " + result);
        return result;
    }
    
    @Override
    public int sub(int i, int j) {
    
        int result = i - j;
    
        return result;
    }
    
    @Override
    public int mul(int i, int j) {
    
        int result = i * j;
    
        return result;
    }
    
    @Override
    public int div(int i, int j) {
    
        int result = i / j;
    
        return result;
    }
}