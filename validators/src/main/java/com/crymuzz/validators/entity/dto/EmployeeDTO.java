package com.crymuzz.validators.entity.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotBlank(message = "El campo nombre, no puede ser nulo")
    @Size(min = 2, max = 16)
    private String name;
    @NotBlank(message = "El campo apellido, no puede ser nulo")
    @Size(min = 2, max = 16)
    private String lastName;
    @NotBlank(message = "El campo de email, no puede ser nulo")
    @Email(message = "El formato de correo electrónico sea correcto")
    private String email;
    private Long phone;
    @Min(18)
    @Max(80)
    private byte age;
    @Digits(integer = 2, fraction = 3)
    private double height;
    @AssertFalse
    private boolean married;
    @Past
    private LocalDate dateOfBirth;
    @Valid
    private DepartmentDTO departmentDTO;
}
