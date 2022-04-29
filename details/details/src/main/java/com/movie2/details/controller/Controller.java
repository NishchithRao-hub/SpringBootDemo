package com.movie2.details.controller;

import com.movie2.details.entities.Movies;
import com.movie2.details.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MovieService movieService;


    @RequestMapping(path = "/movies",method = RequestMethod.GET)
    //get all movies
    public List<Movies> getMovies(){
        return this.movieService.getMovies();
    }

    @GetMapping("/movies/{movieId}")
    //get movie by movieId
    public Movies getMovie(@PathVariable String movieId){
        return this.movieService.getMovie(Long.parseLong(movieId));
    }

    @PostMapping(path= "/movies", consumes = "application/json")
    //add movie by name to database
    public Movies addMovie(@RequestBody Movies movie){

        return this.movieService.addMovie(movie);
    }

    @DeleteMapping("/movies/{movieId}")
    //delete movie
    public ResponseEntity<HttpStatus> deleteMovie(@PathVariable String movieId){
        try{
            this.movieService.deleteMovie(Long.parseLong(movieId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
