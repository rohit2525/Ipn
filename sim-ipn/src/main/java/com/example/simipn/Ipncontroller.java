package com.example.simipn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Ipn")
public class Ipncontroller {
	@GetMapping
	public String getMessage() {
		System.out.println("Ipn Done");
		return "IPN Is up";
	}
}
