package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context= SpringApplication.run(FirstProjectApplication.class, args);
     System.out.println("SpringBoot app running..");
      
     
     //before coming to this point person object is created called Person.class
   Person p1 =  Context.getBean(Person.class);
   p1.show();
   
   
   
   Address a1 = Context.getBean(Address.class);
   p1.setAddr(a1);
   p1.showWeather();
   
     
     
     
     
     
     
     
     
   
   
   
   
   
   
   
//   Laptop l1 = Context.getBean(Laptop.class);
//   p1.setLaptop(l1);
//   l1.brandname("Lenovo Think Book");
   
   
   
   
   
   
   
 
//  
//    Person p2= Context.getBean(Person.class);
//     p2.show();
//     
//     
//     Person p3= Context.getBean(Person.class);
//     p3.show();
     
	}

}
