package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.Movie;
import com.example.moviemanagement.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepo movieRepo;

    @Autowired
    public MovieServiceImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public void insertMovie(Movie movie) {
        movieRepo.save(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepo.deleteById(id);
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return movieRepo.findById(id);
    }

}
