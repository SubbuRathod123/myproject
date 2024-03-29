package com.sathya.rms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entity.Employee;
import com.sathya.rms.service.EmployeeService;

@RestController
@RequestMapping(path = "/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/insertEmployee")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);

	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		employeeService.deleteEmployeeById(id);
	}

	@GetMapping("/getAllEmployee")
	public Iterable<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();

	}

	@GetMapping("/getPermissions")
	public Optional<Employee> getpermissions(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}
}
