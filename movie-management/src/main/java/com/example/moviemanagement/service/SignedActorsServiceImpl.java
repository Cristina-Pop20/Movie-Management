package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.SignedActors;
import com.example.moviemanagement.repository.SignedActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignedActorsServiceImpl implements SignedActorsService {
    private SignedActorsRepo signedActorsRepo;

    @Autowired
    public SignedActorsServiceImpl(SignedActorsRepo signedActorsRepo) {
        this.signedActorsRepo = signedActorsRepo;
    }

    @Override
    public void insertSignedActor(SignedActors signedActors) {
        signedActorsRepo.save(signedActors);
    }

    @Override
    public List<String> getActorNameToMovieId(Long id) {
        return this.signedActorsRepo.retrieveActorNamesByMovieId(id);
    }
}
