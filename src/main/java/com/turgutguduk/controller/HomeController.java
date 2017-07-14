package com.turgutguduk.controller;

import com.turgutguduk.constant.MovieFilmUrlConstant;
import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.MalformedURLException;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private MovieService movieService;

    @Value("${sumologic.accessId}")
    private String accessId;

    @Value("${sumologic.accessKey}")
    private String accessKey;

    @Value("${my.number}")
    private int myNumber;

    private static final Logger LOGGER = LoggerFactory.getLogger("jobs");

    @RequestMapping(MovieFilmUrlConstant.INDEX)
    public ModelAndView index() throws MalformedURLException {
        ModelAndView mv = new ModelAndView("home/index");
        List<MovieDTO> list = movieService.findAll();
        //GetCollectorsResponse collectors = smc.getCollectors();
        //SumoLogicClient smc = new SumoLogicClient(new Credentials(accessId, accessKey));
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
