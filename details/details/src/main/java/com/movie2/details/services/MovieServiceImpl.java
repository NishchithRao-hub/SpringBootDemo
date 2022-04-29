package com.movie2.details.services;

import com.movie2.details.dao.MovieDao;
import com.movie2.details.entities.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;
    //List<Movies> list;

    public MovieServiceImpl(){
//        list=new ArrayList<>();
//        list.add(new Movies(01,"Spiderman","Movie about spiders"));
    }
    @Override
    public List<Movies> getMovies() {
        return movieDao.findAll() ;
    }

    @Override
    public Movies getMovie(long movieId) {
//        Movies m=null;
//        for(Movies movie:list){
//            if(movie.getId()==movieId){
//                m=movie;
//                break;
//            }
//        }
        return movieDao.getById(movieId);
    }

    @Override
    public Movies addMovie(Movies movie) {
        movieDao.save(movie);
        return movie;
    }

    @Override
    public void deleteMovie(long parseLong) {
        //list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
        Movies entity=movieDao.getById(parseLong);
        movieDao.delete(entity);
    }
}
