package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.SignedActors;

import java.util.List;
import java.util.Optional;

public interface SignedActorsService {
    void insertSignedActor(SignedActors signedActors);

    List<String> getActorNameToMovieId(Long id);
}
