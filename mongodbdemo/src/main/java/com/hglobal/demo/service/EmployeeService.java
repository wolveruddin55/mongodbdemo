package com.hglobal.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hglobal.demo.model.EmployeeModel;
import com.hglobal.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeModel saveOrUpdate(EmployeeModel employeeModel) {
		return employeeRepository.save(employeeModel);
	}
	
	public List<EmployeeModel> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Optional<EmployeeModel> getAnEmployee(Integer id){
		return employeeRepository.findById(id);
	}

	public void deleteAnEmployee(EmployeeModel empModel) {
		 employeeRepository.delete(empModel);;
	}

	public List<EmployeeModel> getEmployeeByAddress(String address) {
		return employeeRepository.getEmployeeByAddress(address);
	}
	
}
