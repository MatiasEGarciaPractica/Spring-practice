package com.spring.prac.service;

import com.spring.prac.beans.TestBeanA;
import com.spring.prac.beans.TestBeanC;

public class ServiceA {

    private final TestBeanA testBeanA;

    public ServiceA(TestBeanA testBeanA){
        this.testBeanA = testBeanA;
    };

    public void executeMessage(){
        System.out.println("Here in Service A,printing message from TestBeanA:" + testBeanA.getMessage());
    }
}
