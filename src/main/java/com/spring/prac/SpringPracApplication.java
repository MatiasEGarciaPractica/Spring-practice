package com.spring.prac;

import com.spring.prac.beanXmlPrac.TestBeanB;
import com.spring.prac.beanXmlPrac.TestBeanC;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringPracApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //we'll use this bean configuration for the IOC container
		context.getBean("testBeanB", TestBeanB.class).executeTestBeanAMessage();
		context.getBean("testBeanC", TestBeanC.class).executeTestBeanAMessage();

	}

}
