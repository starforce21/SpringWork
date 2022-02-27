package com.example.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String home() 
	{
		return "This is the home page";
	}
	
	@RequestMapping("another")
	public String another()
	{
		return "This is another page";
	}
	@RequestMapping("/jack")
	public String jack()
	{
		return "1+1=2";
	}
	
}
