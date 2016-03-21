package com.turgutguduk.controller;

import com.turgutguduk.model.test2.Test2;
import com.turgutguduk.service.test2.Test2ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    Test2ServiceImpl test2Service;

    @RequestMapping("/")
    public ModelAndView index()
    {
        List<Test2> list = test2Service.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("movielist", list);
        return mav;
    }


    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
