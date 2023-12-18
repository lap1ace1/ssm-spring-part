package com.lihanlin.statics;

import com.lihanlin.Calculator;

public class StaticProxyCalculator implements Calculator {
    private Calculator calculator;

    public StaticProxyCalculator(Calculator target){
        this.calculator = target;
    }

    @Override
    public int add(int i, int j) {
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
