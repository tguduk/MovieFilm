package com.turgutguduk.dao;

import com.turgutguduk.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MovieDAO extends CrudRepository<Movie,Long> {
    List<Movie> findAll();
}
