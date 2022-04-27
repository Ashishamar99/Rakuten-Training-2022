package com.rakuten.pensionerdetail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/PensionerDetailByAadhaar")
public class PensionerDetailController {
	
	@GetMapping("/{m}")
	String demoget(@PathVariable String m) {
		return m;
	}
}
