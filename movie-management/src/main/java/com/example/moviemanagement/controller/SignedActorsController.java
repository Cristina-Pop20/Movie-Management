package com.example.moviemanagement.controller;

import com.example.moviemanagement.domain.Actor;
import com.example.moviemanagement.domain.Movie;
import com.example.moviemanagement.domain.SignedActors;
import com.example.moviemanagement.service.SignedActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/signed-actors")
public class SignedActorsController {
    private SignedActorsService signedActorsService;

    @Autowired
    public SignedActorsController(SignedActorsService signedActorsService) {
        this.signedActorsService = signedActorsService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insertMovie(@RequestBody SignedActors signedActors) {
        signedActorsService.insertSignedActor(signedActors);
    }

    @GetMapping("/{id}")
    public List<String> getByActorNameAndMovieId(@PathVariable("id") Long id) {
        return signedActorsService.getActorNameToMovieId(id);
    }
}
