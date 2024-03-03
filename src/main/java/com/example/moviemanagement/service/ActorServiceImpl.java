package com.example.moviemanagement.service;

import com.example.moviemanagement.domain.Actor;
import com.example.moviemanagement.repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {
    private ActorRepo actorRepo;

    @Autowired
    public ActorServiceImpl(ActorRepo actorRepo) {
        this.actorRepo = actorRepo;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepo.findAll();
    }

    @Override
    public void insertActor(Actor actor) {
        actorRepo.save(actor);
    }

    @Override
    public void deleteActor(Long id) {
        actorRepo.deleteById(id);
    }

    @Override
    public Optional<Actor> getActorById(Long id) {
        return actorRepo.findById(id);
    }

    @Override
    public Optional<Actor> getActorByName(String name) {
        return actorRepo.findByActorName(name);
    }
}
