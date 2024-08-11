package com.crymuzz.validators.entity.mapper;

import com.crymuzz.validators.entity.Employee;
import com.crymuzz.validators.entity.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO employeeToEmployeeDTO(Employee employee);
    @Mapping(source = "departmentDTO", target = "department")
    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);




}
