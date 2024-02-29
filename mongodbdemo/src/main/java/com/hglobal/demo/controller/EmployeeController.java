package com.hglobal.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hglobal.demo.model.EmployeeModel;
import com.hglobal.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee-save-update")
	public EmployeeModel saveOrUpdateEmployee(@RequestBody EmployeeModel employeeEntity) {
		return employeeService.saveOrUpdate(employeeEntity);
	}
	
	@GetMapping("/find-all-employees")
	public List<EmployeeModel> findallEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/find-an-employee")
	public Optional<EmployeeModel> findanEmployees(@RequestParam("id") Integer id) {
		return employeeService.getAnEmployee(id);
	}
	
	@DeleteMapping("/delete-an-employee")
	public String deleteAnEmployee(@RequestBody EmployeeModel empModel) {
		employeeService.deleteAnEmployee(empModel);
		return "Successfully Deleted employee";
	}
	
	/*
	 *  Custom query using mongodb
	 *  the below api is case sensitive
	 */
	@GetMapping("/owner-of-cricket-ground")
	public List<EmployeeModel> getEmployeeByAddress(@RequestParam("address") String address) {
		return employeeService.getEmployeeByAddress(address);
	}
}
