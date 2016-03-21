package com.turgutguduk.controller;

import com.turgutguduk.model.Test3;
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
        List<Test3> list = test2Service.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("movielist", list);
        return mav;
    }
}
