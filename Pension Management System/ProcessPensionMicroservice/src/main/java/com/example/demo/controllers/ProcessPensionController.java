package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PensionDetail;
import com.example.demo.entities.ProcessPensionInput;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/ProcessPension")
public class ProcessPensionController {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void processPension(@RequestBody PensionDetail pensionDetail, @RequestBody ProcessPensionInput processPensionInput) {
		System.out.println(pensionDetail);
		System.out.println(processPensionInput);
		
		//Call pensioner detail and get salary detail and calc pension.
		//Calc bank's service charge too. (from getting the bank detail from pensioner detail)
	}
}
