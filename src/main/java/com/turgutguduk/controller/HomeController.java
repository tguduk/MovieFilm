package com.turgutguduk.controller;

import com.turgutguduk.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController
{

    @Autowired
    private MovieService movieService;

    @RequestMapping("/")
    public ModelAndView index()
    {
        ModelAndView mv = new ModelAndView("home/index");
        System.out.printf("size : .");
        mv.addObject("list",movieService.findAll().size());
        return mv;
    }

    @RequestMapping("/test")
    public String test()
    {
        System.out.printf("test : .");
        return "test";
    }
}
