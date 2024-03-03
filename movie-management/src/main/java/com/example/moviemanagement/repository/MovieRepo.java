package com.example.moviemanagement.repository;

import com.example.moviemanagement.domain.Actor;
import com.example.moviemanagement.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
    Optional<Movie> findByMovieId(Long movieId);

    List<Movie> findAll();

    Movie save(Movie movie);

    void deleteByMovieId(Long movieId);

    @Query("SELECT m FROM Movie m WHERE LOWER(m.movieName) = LOWER(:movieName)")
    Optional<Movie> retrieveByName(@Param("movieName") String movieName);
}
