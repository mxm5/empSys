package com.example.demo.models;

import lombok.Data;

@Data
public class EmployeeModel {
    // private Long id;
    private Long id; // can be omitted
    private String firstName;
    private String lastName;
    private String email;
}
