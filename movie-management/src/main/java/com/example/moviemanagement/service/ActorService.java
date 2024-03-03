package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.Actor;
import com.example.moviemanagement.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface ActorService {
    List<Actor> getAllActors();

    void insertActor(Actor actor);

    void deleteActor(Long id);

    Optional<Actor> getActorById(Long id);

    Optional<Actor> getActorByName(String name);
}
