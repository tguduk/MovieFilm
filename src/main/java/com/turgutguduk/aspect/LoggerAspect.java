package com.turgutguduk.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggerAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(* com.turgutguduk.service.*.*(..))")
    public void serviceMethods() {
        LOGGER.info("serviceMethods");
    }

    @Before("serviceMethods()")
    public void beforeMethod() {
        LOGGER.info("before method");
    }

    @Around("serviceMethods()")
    public Object arroundMethod(ProceedingJoinPoint joinPoint) {
        try {
            long start = System.nanoTime();
            Object proceed = joinPoint.proceed();
            long end = System.nanoTime();
            LOGGER.info(String.format("%s took %d ns ", joinPoint.getSignature(), (end - start)));
            return  proceed;

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @After("serviceMethods()")
    public void afterMethod() {
        LOGGER.info("aftermethod");
    }
}
