package com.example.first;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class GPU {
	private String name;
	private int ram;
	private int benchMark;
	public GPU() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getBenchMark() {
		return benchMark;
	}
	public void setBenchMark(int benchMark) {
		this.benchMark = benchMark;
	}
	public void display() {
		System.out.println("GPU [name=" + name + ", ram=" + ram + ", benchMark=" + benchMark + "]");
	}
	
}
