package com.spring.prac.beans;

/**
 * Component declared with beans.xml. To use and get from ApplicationContext.
 */
public class TestBeanA {

    private final String message= "Hi, from TestBean A";

    public String getMessage(){
        return this.message;
    }

}
