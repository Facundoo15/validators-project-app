package com.crymuzz.validators.errors.annotation;

import com.crymuzz.validators.errors.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = ValidNameValidator.class)
public @interface ValidName {
    String message() default "El campo no es válido";
    Class<?>[] groups() default {};  // Definir el parámetro 'groups'
    Class<? extends Payload>[] payload() default {};  // Definir el parámetro 'payload'
}
