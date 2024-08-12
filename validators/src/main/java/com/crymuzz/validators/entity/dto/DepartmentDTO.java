package com.crymuzz.validators.entity.dto;

import com.crymuzz.validators.errors.annotation.ValidName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class DepartmentDTO {

    @ValidName(message = "El nombre no es correctoo")
    private String name;
    private String city;
}
