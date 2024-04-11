package com.spring.prac;

import com.spring.prac.beans.TestBeanB;
import com.spring.prac.beans.TestBeanC;
import com.spring.prac.service.ServiceA;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringPracApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", "service.xml"); //we'll use these bean configuration for the IOC container
		context.getBean("testBeanB", TestBeanB.class).executeTestBeanAMessage();
		context.getBean("testBeanC", TestBeanC.class).executeTestBeanAMessage();

		ServiceA serviceA = context.getBean("serviceA", ServiceA.class);
		serviceA.executeMessage();
	}

}
