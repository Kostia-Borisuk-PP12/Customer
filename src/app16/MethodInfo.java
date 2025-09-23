package app16;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // анотація доступна під час виконання
public @interface MethodInfo {
    String name();
    String returnType();
    String description();
}

