package com.crymuzz.validators.errors.validator;

import com.crymuzz.validators.errors.annotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        //Valor que no sea nulo
        if(value == null){
            return false;
        }
        if(value.isEmpty()){
            return false;
        }
        if(value.isBlank()){
            return false;
        }
        if(value.length() < 3 || value.length() > 15){
            return false;
        }
        if(!Character.isUpperCase(value.charAt(0))){
            return false;
        }
        return true;
    }




}
