package com.spring.prac.beanXmlPrac;

public class TestBeanC {

    private TestBeanA testBeanA;

    public void setTestBeanA(TestBeanA testBeanA){
        this.testBeanA = testBeanA;
    }
    public void executeTestBeanAMessage(){
        System.out.println("Here TestBeanC printing message from TestBeanA : " + testBeanA.getMessage());
    }

}
