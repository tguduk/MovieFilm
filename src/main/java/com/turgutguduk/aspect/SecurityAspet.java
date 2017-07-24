package com.turgutguduk.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspet {

    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void serviceMethod(){
        System.out.println("//test");
    }

    @Before("serviceMethod()")
    public void autMethod(){
        System.out.println("befor ---");
    }

    @After("serviceMethod()")
    public void aut2(){
        System.out.println("after ---");
    }

}
