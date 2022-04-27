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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/ProcessPension")
public class ProcessPensionController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	PensionDetail processPension(@RequestBody ProcessPensionInput processPensionInput) {
		System.out.println("Fetching Details Of This Aadhar Number:: " + processPensionInput.getAadhar_number());
		
		String restTemplateUrl = "http://localhost:8081/PensionerDetailByAadhaar/" + processPensionInput.getAadhar_number();
		PensionerDetail fetchDetailFromSavedData = restTemplate.getForObject(restTemplateUrl, PensionerDetail.class);
		//Had an error with the rest Template fetching data, removed @LoadBalanced from the application class. This link gave me the answer -> https://stackoverflow.com/questions/41052630/spring-cloud-and-eureka-java-lang-illegalstateexception-no-instances-available
		
		
		//Calculating values from Big integer, error solved by this link - https://stackoverflow.com/questions/13105905/is-it-possible-to-multiple-a-biginteger-by-a-double-in-java
		//Calculating pension amount.
		PensionDetail calculatedDetail = new PensionDetail();
		if(fetchDetailFromSavedData.getPension_type() == PensionClassification.SELF) {
			Double result = (0.8 * fetchDetailFromSavedData.getSalary_earned().doubleValue() ) + fetchDetailFromSavedData.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		else {
			Double result = (0.5 * fetchDetailFromSavedData.getSalary_earned().doubleValue() ) + fetchDetailFromSavedData.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		//Calculating bank service charge.
		if(fetchDetailFromSavedData.getBank_detail().getBank_type() == BankType.PUBLIC) {
			calculatedDetail.setBank_service_charge(500);
		}
		else {
			calculatedDetail.setBank_service_charge(550);
		}
		
		//Setting the pension detail of fetched data to the calculated data.
		fetchDetailFromSavedData.setPension_detail(calculatedDetail);
		
		return calculatedDetail;
	}
}
