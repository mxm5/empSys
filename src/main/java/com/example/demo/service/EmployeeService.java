package com.example.demo.service;

import com.example.demo.models.EmployeeModel;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    EmployeeModel createEmployee(EmployeeModel employeeModel);
}
