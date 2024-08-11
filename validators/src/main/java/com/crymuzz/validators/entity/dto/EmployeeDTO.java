package com.crymuzz.validators.entity.dto;

import com.crymuzz.validators.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private String lastName;
    private String email;
    private Long phone;
    private byte age;
    private double height;
    private boolean married;
    private LocalDate dateOfBirth;
    private DepartmentDTO departmentDTO;
}
