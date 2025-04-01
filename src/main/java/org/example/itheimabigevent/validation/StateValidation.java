package org.example.itheimabigevent.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.itheimabigevent.anno.State;

public class StateValidation implements ConstraintValidator<State, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null)
            return false;
        if (value.equals("已发布")||value.equals("草稿"))
            return true;
        return false;
    }
}
