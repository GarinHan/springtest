package com.springmvc.web;
import java.lang.annotation.*;


@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnOne {
    String value() default "我是注解元素的默认值";
}
