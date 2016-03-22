package com.turgutguduk.annotation;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


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
@EnableCaching
@ComponentScan(basePackages = "com.turgutguduk")
public @interface SpringBootApplication
{
    Class<?>[] exclude() default {};
}