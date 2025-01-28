package com.BuZCalc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealSpringBeansRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			var context = new AnnotationConfigApplicationContext(RealSpringBeansRunner.class);
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
