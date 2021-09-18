package com.infoiv.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingControllered {
	
	@GetMapping("/ping")
	public String getPingMessage() {
		return "Pingged .......";
	}

}
