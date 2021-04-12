package com.soap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.marlabs.spring.saop.eduloaneligibility.Acknowledgement;
import com.marlabs.spring.saop.eduloaneligibility.UserRequest;

@Endpoint
public class EduLoanEligibilityEndPoint {
	private static final String NAMESPACE = "http://www.marlabs.com/spring/saop/eduloaneligibility";
	@Autowired
	private EduLoanEligibilityService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "UserRequest")
	@ResponsePayload
	public Acknowledgement getLoanStatus(@RequestPayload UserRequest request) {
		return service.checkEduLoanEligibility(request);
	}
}
