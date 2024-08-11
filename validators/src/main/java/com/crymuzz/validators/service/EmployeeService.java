package com.crymuzz.validators.service;

import com.crymuzz.validators.entity.Employee;
import com.crymuzz.validators.entity.dto.EmployeeDTO;
import com.crymuzz.validators.entity.mapper.EmployeeMapper;
import com.crymuzz.validators.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        System.out.println(employeeDTO);
        Employee employee = EmployeeMapper.INSTANCE.employeeDTOToEmployee(employeeDTO);
        System.out.println("Employee: " + employee);
        return employeeRepository.save(employee);
    }

}
