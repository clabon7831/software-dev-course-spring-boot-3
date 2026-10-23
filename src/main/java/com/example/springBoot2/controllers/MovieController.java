package com.example.springBoot2.controllers;

import com.example.springBoot2.models.Movie;
import com.example.springBoot2.repositories.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;

//    private final List<Movie> movies = List.of(
//        new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 142),
//        new Movie("The Godfather", "Francis Ford Coppola", 1972, 175),
//        new Movie("The Dark Knight", "Christopher Nolan", 2008, 152)
//    );

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Movie> getMovie() {
        return movieRepository.findAll();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}
