package com.example.moviemanagement.domain;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @SequenceGenerator(
            name = "actor_sequence",
            sequenceName = "actor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "actor_sequence"
    )
    @Column(
            name = "actorId",
            updatable = false
    )
    private Long actorId;

    @Column(
            name = "actorName",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String actorName;

    public Actor(Long actorId, String actorName) {
        this.actorId = actorId;
        this.actorName = actorName;
    }

    public Actor() {

    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", actorName='" + actorName + '\'' +
                '}';
    }
}
