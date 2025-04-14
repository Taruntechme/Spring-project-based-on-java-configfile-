package com.pring.proj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pring.proj.entity.Student;

@Configuration
public class SpringConfigFile {
	
	//in xml file we use bean tags to defie beans
	//but in java based configuration we use method annotated with @bean to define beans
	
	//in xml configuration we provide an id attribut to specify the bean name an we specify the class name using the class attributes
	
	//in java based configuration the method name becomde the default bean name and th ereurn type of the mthod determins the class of the objects that will be created as beans 
	@Bean
	public Student stdId() {
		Student std = new Student();
		
		std.setName("Kamal");
		std.setEmail("kamal@gmail.com");
		std.setRollno(103);
		
		return std;
	}
	

}
