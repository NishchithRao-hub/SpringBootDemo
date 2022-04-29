package com.movie2.details.dao;

import com.movie2.details.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movies,Long> {
}
