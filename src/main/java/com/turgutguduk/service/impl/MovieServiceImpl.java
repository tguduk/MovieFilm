package com.turgutguduk.service.impl;

import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.entities.Movie;
import com.turgutguduk.dao.MovieDAO;
import com.turgutguduk.mapper.MovieMapper;
import com.turgutguduk.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by turgut on 22.03.2016.
 */

@Service
public class MovieServiceImpl implements MovieService
{
    @Autowired
    private MovieDAO movieDAO;

    @Autowired
    private MovieMapper movieMapper;

    @Transactional
    @Override
    public MovieDTO create(Movie movie)
    {
        Movie save = movieDAO.save(movie);
        return movieMapper.convertDTO(save);
    }

    @Transactional
    @Override
    public MovieDTO delete(Long id)
    {
        Movie deletedMovie =movieDAO.findOne(id);
        if (deletedMovie != null)
           movieDAO.delete(deletedMovie);
        return movieMapper.convertDTO(deletedMovie);
    }

    @Transactional
    @Override
    public List<MovieDTO> findAll()
    {
        return movieMapper.converDTOList(movieDAO.findAll());
    }

    @Transactional
    @Override
    public MovieDTO update(Movie movie)
    {
        Movie updatedMovie = movieDAO.findOne(movie.getId());
        return movieMapper.convertDTO(updatedMovie);
    }

    @Transactional
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
