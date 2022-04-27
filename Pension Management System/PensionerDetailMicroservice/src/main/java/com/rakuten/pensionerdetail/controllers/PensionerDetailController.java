package com.rakuten.pensionerdetail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.pensionerdetail.entities.PensionerDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/PensionerDetailByAadhaar")
public class PensionerDetailController {
	
	List<PensionerDetail> pensioners = new ArrayList<>();
	
	@GetMapping("/{aadhar_number}")
	PensionerDetail getPensionerDetail(@PathVariable String aadhar_number) {
		
		List<PensionerDetail> search_result = pensioners.stream().filter(saved_pensioner -> String.valueOf(saved_pensioner.getAadhar_number()).equals(aadhar_number)).collect(Collectors.toList());
		if(search_result.size() != 0) {
			return search_result.get(0);
		}
		return null;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void savePensionerDetail(@RequestBody PensionerDetail pensioner_detail) {
		pensioners.add(pensioner_detail);
	}
}
