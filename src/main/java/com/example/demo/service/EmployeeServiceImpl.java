package com.example.demo.service;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.models.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        System.out.println("employeeEntity before filling -----");
        System.out.println(employeeEntity);
        BeanUtils.copyProperties(employeeModel, employeeEntity);
        EmployeeEntity save = employeeRepository.save(employeeEntity);

        System.out.println("employeeEntity after filling -----");
        System.out.println(save);

        return employeeModel;
    }
}
