package com.ajtel.customer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajtel.customer.dto.PlanDTO;

@FeignClient(name = "PlanMS", url="http://localhost:9401/")
public interface CustPlanFeign {
	
	@RequestMapping("/plans/{planId}")
	PlanDTO getSpecificPlan(@PathVariable("planId") int planId);

}
