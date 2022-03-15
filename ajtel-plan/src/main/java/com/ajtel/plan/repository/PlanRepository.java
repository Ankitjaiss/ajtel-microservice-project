package com.ajtel.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajtel.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
