package com.turgutguduk.service.impl;

import com.turgutguduk.dao.MovieDAO;
import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.entities.Movie;
import com.turgutguduk.mapper.MovieMapper;
import com.turgutguduk.service.MovieService;
import com.turgutguduk.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO movieDAO;

    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private RedisService redisService;

    private static final String REDIS_KEY ="FILMLIST";

    @Transactional
    @Override
    public MovieDTO create(Movie movie)
    {
        Movie save = movieDAO.save(movie);
        return movieMapper.convertDTO(save);
    }

    @Override
    public MovieDTO delete(Long id)
    {
        Movie deletedMovie =movieDAO.findOne(id);
        if (deletedMovie != null)
           movieDAO.delete(deletedMovie);
        return movieMapper.convertDTO(deletedMovie);
    }

    @Override
    public List<MovieDTO> findAll()
    {
        List<MovieDTO> movieDTOS = movieMapper.converDTOList(movieDAO.findAll());
        redisService.setValue(REDIS_KEY,movieDTOS);
        System.out.println(redisService.getValue(REDIS_KEY));
        return movieMapper.converDTOList(movieDAO.findAll());
    }

    @Transactional
    @Override
    public MovieDTO update(Movie movie)
    {
        Movie updatedMovie = movieDAO.findOne(movie.getId());
        return movieMapper.convertDTO(updatedMovie);
    }

    @Override
    public MovieDTO findById(Long id)
    {
        return movieMapper.convertDTO(movieDAO.findOne(id));
    }

    @Override
    public List<MovieDTO> findByName(String name) {
        return null;
    }
}
