package com.springboot.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiZoom {

	@GetMapping("/hi")
	public String hiSay() {
		return "hi ra zook";
	}
}
