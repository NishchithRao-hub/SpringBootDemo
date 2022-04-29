package com.movie2.details.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

    @Id
    private long id;
    private String name;
    private String description;
    public Movies(long id,String name,String description){
        super();
        this.id=id;
        this.name=name;
        this.description=description;
    }
    public Movies(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
