package com.turgutguduk.controller;

import com.turgutguduk.constant.MovieFilmUrlConstant;
import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HomeController {
    @Autowired
    private MovieService movieService;

    @RequestMapping(MovieFilmUrlConstant.INDEX)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("home/index");
        List<MovieDTO> list = movieService.findAll();
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
