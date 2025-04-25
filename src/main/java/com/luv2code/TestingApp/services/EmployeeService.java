package com.luv2code.TestingApp.services;


import com.luv2code.TestingApp.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto getEmployeeById(Long id);

    EmployeeDto createNewEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);
}
