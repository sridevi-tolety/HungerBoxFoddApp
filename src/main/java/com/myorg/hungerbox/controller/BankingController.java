package com.myorg.hungerbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodbooking")
public class BankingController {
	
	@Autowired
	BankAccountClient bac;
	
	@GetMapping("/checkCardNumber/{cardNumber}")
	public boolean checkCardNumber(@PathVariable Long cardNumber) {
		return bac.checkCardNumber(cardNumber);
	}

}
