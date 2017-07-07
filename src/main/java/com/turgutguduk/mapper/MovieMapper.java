package com.turgutguduk.mapper;

import com.turgutguduk.dto.MovieDTO;
import com.turgutguduk.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieMapper {
    public static MovieDTO convertDTO(Movie movie) {
        if (movie != null) {
            return new MovieDTO().builder()
                    .category(movie.getCategory())
                    .createYear(movie.getCreateYear())
                    .name(movie.getName())
                    .point(movie.getPoint())
                    .build();
        } else {
            return null;
        }
    }

    public static List<MovieDTO> converDTOList(final List<Movie> source) {
        if (source != null) {
            List<MovieDTO> destination = new ArrayList();
            source.forEach(t -> {
                destination.add(convertDTO(t));
            });
            return destination;
        } else {
            return null;
        }
    }
}
