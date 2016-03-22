package com.turgutguduk.service;

import com.turgutguduk.model.Movie;

import java.util.List;

/**
 * Created by turgut on 22.03.2016.
 */
public interface MovieService
{
    public Movie create(Movie movie);
    public Movie delete(int id);
    public List<Movie> findAll();
    public Movie update(Movie movie);
    public Movie findById(int id);
}
