package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hi/{name}")
	public String sayHello(@PathVariable("name") String name) {

		return "Hello Mr/Ms " + name + " welcome";

	}

}
