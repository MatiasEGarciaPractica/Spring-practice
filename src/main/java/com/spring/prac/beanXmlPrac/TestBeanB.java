package com.spring.prac.beanXmlPrac;

import org.springframework.stereotype.Component;

/**
 * Component declared with beans.xml. To use and get from ApplicationContext.
 */
public class TestBeanB {

    private final TestBeanA testBeanA;


    public TestBeanB(TestBeanA testBeanA){
        this.testBeanA = testBeanA;
    }

    public void executeTestBeanAMessage(){
        System.out.println("Here TestBeanB printing message from TestBeanA : " + testBeanA.getMessage());
    }
}
