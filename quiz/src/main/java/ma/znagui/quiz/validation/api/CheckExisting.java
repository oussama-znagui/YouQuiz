package ma.znagui.quiz.validation.api;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ma.znagui.quiz.validation.CheckExistingValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Constraint(validatedBy = CheckExistingValidator.class)
@Retention(RetentionPolicy.RUNTIME)

public @interface CheckExisting {
    String message() default "L'ID  n'existe pas";


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    Class<?> entityC();
}
