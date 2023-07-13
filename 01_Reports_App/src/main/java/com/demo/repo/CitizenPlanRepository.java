package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.CitizenPlan;

@Repository
public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {
	@Query(value = "select distinct (planName) from CitizenPlan")
	public List<String> getPlanName();

	@Query(value = "select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus();

}

//	Distinct means unique
//	To get the data in drop down we have to write custom query
