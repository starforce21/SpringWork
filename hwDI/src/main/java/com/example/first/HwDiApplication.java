package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HwDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(HwDiApplication.class, args);
		Laptop laptop1= context.getBean(Laptop.class);
		laptop1.setName("ASUS - ROG Zephyrus 14");
		laptop1.setRam(16);
		laptop1.setWeight(1651);
		laptop1.setSsd(1000);
		laptop1.setPrice(1649.99);
		Phone phone1= context.getBean(Phone.class);
		phone1.setDisplay("Dynamic AMOLED 2X, 120Hz, HDR10+, 1750 nits");
		phone1.setIP68(true);
		phone1.setName("Samsung Galaxy S22 Ultra 5G");
		phone1.setPrice(1199.99);
		phone1.setWeight(229);
		// with scope prototype we can make multiple object
		CPU cpu1=context.getBean(CPU.class);
		CPU cpu2=context.getBean(CPU.class);
		GPU gpu1=context.getBean(GPU.class);
		GPU gpu2=context.getBean(GPU.class);
		cpu1.setCore(8);
		cpu1.setGeekBenchMulti(10368);
		cpu1.setGeekBenchSingle(1644);
		cpu1.setName("AMD Ryzen 9 6900HS");
		cpu1.setThread(16);
		
		cpu2.setCore(8);
		cpu2.setGeekBenchMulti(4288);
		cpu2.setGeekBenchSingle(1287);
		cpu2.setName("Qualcomm Snapdragon 8 Gen 1");
		cpu2.setThread(8);
		
		gpu1.setBenchMark(0);
		gpu1.setName("AMD Radeon RX 6700S");
		gpu1.setRam(10);
		
		gpu2.setBenchMark(15571);
		gpu2.setName("Qualcomm Adreno 730");
		gpu2.setRam(8);
		
		laptop1.setCpu(cpu1);
		laptop1.setGpu(gpu1);
		phone1.setCpu(cpu2);
		phone1.setGpu(gpu2);
		System.out.println(laptop1.toString());
		laptop1.CPUinfo();
		laptop1.GPUinfo();
		System.out.println("C-C-C-Combo Breaker");
		System.out.println(phone1.toString());
	}

}
