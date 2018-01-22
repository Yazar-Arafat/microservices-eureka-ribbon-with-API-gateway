package com.poc.Account.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.poc.Account.service.AccountServiceClient;

@RestController
public class AccountController {

	@Autowired
	AccountServiceClient accountServiceClient;

	@RequestMapping(value = "/getemprecord", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void getDetails() throws RestClientException, IOException {
		System.out.println("Going to call Employee service to get data!");
		accountServiceClient.getEmp();
	}

}
