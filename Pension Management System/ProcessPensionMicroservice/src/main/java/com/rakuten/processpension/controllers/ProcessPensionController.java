package com.rakuten.processpension.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rakuten.processpension.entities.BankType;
import com.rakuten.processpension.entities.PensionClassification;
import com.rakuten.processpension.entities.PensionDetail;
import com.rakuten.processpension.entities.PensionerDetail;
import com.rakuten.processpension.entities.ProcessPensionInput;
import com.rakuten.processpension.services.ProcessPensionService;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/ProcessPension")
public class ProcessPensionController {
	
	@Autowired
	ProcessPensionService service;
	
	@GetMapping
	PensionDetail processPension(@RequestBody ProcessPensionInput processPensionInput) {
		System.out.println("Fetching Details Of This Aadhar Number:: " + processPensionInput.getAadhar_number());
		return service.processPensionDetails(processPensionInput);
	}
}
