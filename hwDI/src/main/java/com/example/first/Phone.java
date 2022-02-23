package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	private String name;
	private double price;
	private String display;
	private boolean IP68;
	private double weight;
	@Autowired
	private GPU gpu;
	@Autowired
	private CPU cpu;
	public Phone() {}
	public void CPUinfo() 
	{
		cpu.display();
	}
	public void GPUinfo() 
	{
		gpu.display();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public boolean isIP68() {
		return IP68;
	}
	public void setIP68(boolean iP68) {
		IP68 = iP68;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public GPU getGpu() {
		return gpu;
	}
	@Autowired
	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}
	public CPU getCpu() {
		return cpu;
	}
	@Autowired
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		CPUinfo();
		GPUinfo();
		return "Phone [name=" + name + ", price=" + price + ", display=" + display + ", IP68=" + IP68 + ", weight="
				+ weight + "]";
	}
	
}
