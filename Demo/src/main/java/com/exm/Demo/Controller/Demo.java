package com.exm.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping(value="/Printing")
	public String kalyan() {
		return "kalyan Good Evening";
	}

}
//http://localhost:8000/Printing