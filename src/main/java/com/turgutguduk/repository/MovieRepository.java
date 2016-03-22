package com.turgutguduk.repository;

import com.turgutguduk.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by turgut on 22.03.2016.
 */
public interface MovieRepository extends JpaRepository<Movie,Integer>
{
}
