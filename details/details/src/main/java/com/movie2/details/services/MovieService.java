package com.movie2.details.services;

import com.movie2.details.entities.Movies;

import java.util.List;

public interface MovieService {
    public List<Movies> getMovies();
    public Movies getMovie(long movieId);
    public Movies addMovie(Movies movie);
    public void deleteMovie(long parseLong);
}
