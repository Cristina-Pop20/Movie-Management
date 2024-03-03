package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();

    void insertMovie(Movie movie);

    void deleteMovie(Long id);

    Optional<Movie> getMovieById(Long id);
}
