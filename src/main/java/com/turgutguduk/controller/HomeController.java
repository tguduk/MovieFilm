package com.turgutguduk.controller;

import com.turgutguduk.constant.MovieFilmUrlConstant;
import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.List;


@RestController
public class HomeController {

//    @Value("${sumologic.accessId}")

    //    private int myNumber;
//    @Value("${my.number}")
//
//    private String accessKey;
//    @Value("${sumologic.accessKey}")
//
//    private String accessId;

    @Autowired
    private MovieService movieService;


    private static final Logger LOGGER = LoggerFactory.getLogger("jobs");

    @RequestMapping(value = MovieFilmUrlConstant.INDEX)
    public List<MovieDTO> index() throws MalformedURLException {
        List<MovieDTO> list = movieService.findAll();
        return list;
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
