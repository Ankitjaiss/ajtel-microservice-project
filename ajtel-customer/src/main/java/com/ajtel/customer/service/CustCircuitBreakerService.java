package com.ajtel.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajtel.customer.controller.CustFriendFeign;
import com.ajtel.customer.controller.CustPlanFeign;
import com.ajtel.customer.dto.PlanDTO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CustCircuitBreakerService {

	@Autowired
	CustPlanFeign planFeign;
	
	@Autowired
	CustFriendFeign friendFeign;
	
	@CircuitBreaker(name = "customerService")
	public PlanDTO getSpecificPlan(Integer planId){
		return planFeign.getSpecificPlan(planId);
	}

	
	@CircuitBreaker(name = "customerService")
	public List<Long> getSpecificFriends(Long phoneNo){
		return friendFeign.getSpecificFriends(phoneNo);
	}
}
