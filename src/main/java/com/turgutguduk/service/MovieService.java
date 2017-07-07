package com.turgutguduk.service;

import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.entities.Movie;

import java.util.List;

/**
 * Created by turgut on 22.03.2016.
 */
public interface MovieService
{
     MovieDTO create(Movie movie);
     MovieDTO delete(Long id);
     List<MovieDTO> findAll();
     MovieDTO update(Movie movie);
     MovieDTO findById(Long id);
     List<MovieDTO> findByName(String name);
}
