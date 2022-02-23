package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")

public class Person {
  private int pid;
  private String pname;
  private String tech;
  
// @Autowired
//  private Laptop laptop; 
 
 // DI via field(property)
 @Autowired
 private Address addr;
 

 
// DI via setter method
@Autowired
public void setAddr(Address addr) {
	this.addr = addr;
}


//DI via constructor
@Autowired
public Person(Address addr)
  {
	  this.addr=addr;
	  addr.Weather();
	  
  }
  


public void show() {
	System.out.println("inside person class show method...");
	
  }

public void showWeather() {
	
	addr.Weather();
  }

public Address getAddr() {
	return addr;
}
  public int getPid() {
	return pid;
  }
  
  public void setPid(int pid) {
	
	this.pid = pid;
  }
  public String getPname() {
	return pname;
  }
  public void setPname(String pname) {
	this.pname = pname;
  }
  public String getTech() {
	return tech;
  }
  public void setTech(String tech) {
	this.tech = tech;
  }
	
  
  
//public Laptop getLaptop() {
//	return laptop;
//}
//
//
//public void setLaptop(Laptop laptop) {
//	this.laptop = laptop;
//}
//
//public String  showLaptop() {
//	this.laptop.setBrand("Lenovo Think Book");
//	return this.laptop.getBrand();
//}





}
