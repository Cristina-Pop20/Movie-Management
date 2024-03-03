package com.example.moviemanagement.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "movie_sequence"
    )
    @Column(
            name = "movieId",
            updatable = false
    )
    private Long movieId;

    @Column(
            name = "movieName",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String movieName;

    @Column(
            name = "release_date",
            nullable = false
    )
    private LocalDateTime releaseDate;

    public Movie(Long movieId, String movieName, LocalDateTime releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    public Movie() {

    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
