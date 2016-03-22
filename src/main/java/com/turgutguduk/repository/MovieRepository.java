package com.turgutguduk.repository;

import com.turgutguduk.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by turgut on 22.03.2016.
 */

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>
{
}
