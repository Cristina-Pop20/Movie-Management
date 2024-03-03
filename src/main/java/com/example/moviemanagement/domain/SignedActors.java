package com.example.moviemanagement.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "SignedActors")
public class SignedActors {
    @Id
    @SequenceGenerator(
            name = "SignedActors_sequence",
            sequenceName = "SignedActors_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "SignedActors_sequence"
    )
    @Column(
            name = "saId",
            updatable = false
    )
    private Long saId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "actorId")
    private Actor actor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movieId")
    private Movie movie;

    public SignedActors(Long saId, Actor actor, Movie movie) {
        this.saId = saId;
        this.actor = actor;
        this.movie = movie;
    }

    public SignedActors() {

    }

    public Long getSaId() {
        return saId;
    }

    public void setSaId(Long saId) {
        this.saId = saId;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "SignedActors{" +
                "saId=" + saId +
                ", actor=" + actor +
                ", movie=" + movie +
                '}';
    }
}
