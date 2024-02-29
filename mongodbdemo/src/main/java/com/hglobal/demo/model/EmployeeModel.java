package com.hglobal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

	private int id;
	private String employeeName;
	private String address;
}
