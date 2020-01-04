package com.mtc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loads the container
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mtc.app");

		SampleBean sampleBean = applicationContext.getBean(SampleBean.class);
		
		System.out.println(sampleBean.greet());
		
		
	}

}
