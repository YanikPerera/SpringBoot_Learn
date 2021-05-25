//here we have to give pom.xml file group id then it can be identify this class from base package class
package com.BistecGlobal;

import org.springframework.boot.SpringApplication;
//once create the @SpringBootApplication application tag this will be auto generate
import org.springframework.boot.autoconfigure.SpringBootApplication;


//using below tag we can define as a this is spring boot application 
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//using below method application can be run,,it will be define as port which is open the application using tomcat		
		SpringApplication.run(Application.class,args);
		
	}

}
