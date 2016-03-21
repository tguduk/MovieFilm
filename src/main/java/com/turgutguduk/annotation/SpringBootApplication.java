package com.turgutguduk.annotation;

import com.turgutguduk.constant.SystemConstant;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by turgut on 19.03.2016.
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = SystemConstant.PROPERTY_NAME_BASE_PACKAGE)
public @interface SpringBootApplication
{
    Class<?>[] exclude() default {};
}