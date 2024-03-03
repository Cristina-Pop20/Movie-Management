package com.example.moviemanagement.repository;

import com.example.moviemanagement.domain.Movie;
import com.example.moviemanagement.domain.SignedActors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SignedActorsRepo extends JpaRepository<SignedActors, Long> {
    @Query("SELECT s.actor.actorName FROM SignedActors s WHERE s.movie.movieId = :movieId")
    List<String> retrieveActorNamesByMovieId(@Param("movieId") Long movieId);

}
