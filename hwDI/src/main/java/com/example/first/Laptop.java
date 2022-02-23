package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Laptop {
	private String name;
	private double price;
	private int ram;
	private int ssd;
	private double weight;
	@Autowired
	private GPU gpu;
	@Autowired
	private CPU cpu;
	
	public Laptop() {}
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
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
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + ", ssd=" + ssd + ", weight=" + weight + "]";
	}
	
}
