package ru.javabegin.RobotSpring.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.javabegin.RobotSpring.enums.ColorStyle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface RobotQualifier {

	ColorStyle color();

	boolean sound();
}
