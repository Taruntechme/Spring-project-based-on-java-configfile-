package com.pring.proj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pring.proj.entity.Student;
import com.pring.proj.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("stdId");
		
		std.display();
	}

}


//when run this application you will get the error to required aop jar file needed "Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/aop/TargetSource"
//the you wil have to download and add aop jar file in the application 