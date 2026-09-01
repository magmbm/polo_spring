package com.cloud.aws.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Polo {
    
    @GetMapping("/polo")
	public String polo_endpoint() {
		return "AWS_Polo";
	}
}
