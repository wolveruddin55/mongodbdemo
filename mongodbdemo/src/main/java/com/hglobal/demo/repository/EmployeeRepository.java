package com.hglobal.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hglobal.demo.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeModel, Integer> {

	@Query("{'address':?0}")
	List<EmployeeModel> getEmployeeByAddress(String Address);
}
