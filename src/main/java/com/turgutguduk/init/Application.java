package com.turgutguduk.init;

/**
 * Created by turgut on 19.03.2016.
 */

import com.turgutguduk.annotation.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
