package com.example.moviemanagement.controller;

import com.example.moviemanagement.domain.Actor;
import com.example.moviemanagement.domain.Movie;
import com.example.moviemanagement.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "api/actors")
public class ActorController {
    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable("id") Long id) {
        try {
            return actorService.getActorById(id)
                    .orElseThrow(() -> new ResponseStatusException(
                            HttpStatus.NOT_FOUND, "Actor Not Found"));
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", ex);
        }
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insertActor(@RequestBody Actor actor) {
        actorService.insertActor(actor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteActor(@PathVariable("id") Long id) {
        try {
            actorService.deleteActor(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor Not Found", ex);
        }
    }
}
