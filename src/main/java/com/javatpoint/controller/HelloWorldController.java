package com.javatpoint.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "Hello Naveen";
}
@GetMapping("/hello")
public String hello1()
{
	return "Hello User Have a nice day";
}
}
