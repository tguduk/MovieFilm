package com.turgutguduk.annotation;

import com.turgutguduk.constant.SystemConstant;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Configuration
@EnableAutoConfiguration
@EnableCaching
@ComponentScan(basePackages = SystemConstant.PROPERTY_NAME_BASE_PACKAGE)
public @interface SpringBootApplication
{
    Class<?>[] exclude() default {};
}