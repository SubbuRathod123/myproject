package com.sathya.rms.service;

import java.util.Optional;

import com.sathya.rms.entity.Employee;

public interface EmployeeService {

	public Employee insertEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployeeById(Integer id);

	public Iterable<Employee> getAllEmployee();

	public Optional<Employee> getEmployeeById(Integer id);

}
