package com.turgutguduk.repository;

import com.turgutguduk.model.Movie;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by turgut on 22.03.2016.
 */

@org.springframework.stereotype.Repository
public interface MovieNamedQueryRepository extends Repository<Movie, Long>
{
    List<Movie> findByName(String name);
}
