package com.SpringExample.demo12.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="/printing")
	public String kalyan()
	{
		return "Kalyan Dev";

	}
	
	
	
	

}
