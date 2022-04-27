package com.rakuten.processpension.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rakuten.processpension.entities.BankType;
import com.rakuten.processpension.entities.PensionClassification;
import com.rakuten.processpension.entities.PensionDetail;
import com.rakuten.processpension.entities.PensionerDetail;
import com.rakuten.processpension.entities.ProcessPensionInput;

@Service
public class ProcessPensionService {
	
	static PensionDetail calculatedDetail = new PensionDetail();
	
	@Autowired
	RestTemplate restTemplate;
	
	public PensionDetail processPensionDetails(ProcessPensionInput processPensionInput) {
		
		String restTemplateUrl = "http://localhost:8081/PensionerDetailByAadhaar/" + processPensionInput.getAadhar_number();
		PensionerDetail fetchDetailFromSavedData = restTemplate.getForObject(restTemplateUrl, PensionerDetail.class);
		//Had an error with the rest Template fetching data, removed @LoadBalanced from the application class. This link gave me the answer -> https://stackoverflow.com/questions/41052630/spring-cloud-and-eureka-java-lang-illegalstateexception-no-instances-available
		
		if(fetchDetailFromSavedData != null) {
			calculatePensionAmount(fetchDetailFromSavedData);
			calculateBankServiceCharge(fetchDetailFromSavedData);
			
			fetchDetailFromSavedData.setPension_detail(calculatedDetail);
			//Setting calculated detail to our pensioner. This way in the future if we have to fetch the values we, need not calculate it again. (In case a database is connected, then these values shall be populated).
			return calculatedDetail;
		}
		return null;
	}
	
	//Calculating values from Big integer, error solved by this link - https://stackoverflow.com/questions/13105905/is-it-possible-to-multiple-a-biginteger-by-a-double-in-java
	static void calculatePensionAmount(PensionerDetail fetchedDetail) {
		
		if(fetchedDetail.getPension_type() == PensionClassification.SELF) {
			Double result = (0.8 * fetchedDetail.getSalary_earned().doubleValue() ) + fetchedDetail.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		else {
			Double result = (0.5 * fetchedDetail.getSalary_earned().doubleValue() ) + fetchedDetail.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		
	}
	
	static void calculateBankServiceCharge(PensionerDetail fetchedDetail) {
		
		if(fetchedDetail.getBank_detail().getBank_type() == BankType.PUBLIC) {
			calculatedDetail.setBank_service_charge(500);
		}
		else {
			calculatedDetail.setBank_service_charge(550);
		}
		
	}
}
