package com.example.moviemanagement.repository;

import com.example.moviemanagement.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Long> {
    @Query("SELECT a FROM Actor a WHERE LOWER(a.actorName) = LOWER(:actorName)")
    Optional<Actor> retrieveByName(@Param("actorName") String movieName);
}
