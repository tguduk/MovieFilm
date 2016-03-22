package com.turgutguduk.service;

import com.turgutguduk.model.Movie;
import com.turgutguduk.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by turgut on 22.03.2016.
 */

@Service
public class MovieServiceImpl implements MovieService
{
    @Resource
    private MovieRepository movieRepository;

    @Transactional
    @Override
    public Movie create(Movie movie)
    {
        return movieRepository.save(movie);
    }

    @Transactional
    @Override
    public Movie delete(int id)
    {
        Movie deletedMovie =movieRepository.getOne(id);
        if (deletedMovie != null)
           movieRepository.delete(deletedMovie);
        return deletedMovie;
    }

    @Transactional
    @Override
    public List<Movie> findAll()
    {
        return movieRepository.findAll();
    }

    @Transactional
    @Override
    public Movie update(Movie movie)
    {
        Movie updatedMovie =movieRepository.findOne(movie.getId());
        return updatedMovie;
    }

    @Transactional
    @Override
    public Movie findById(int id)
    {
        return movieRepository.getOne(id);
    }
}
