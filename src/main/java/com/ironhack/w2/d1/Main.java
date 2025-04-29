package com.ironhack.w2.d1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Pulp Fiction", 140);
        Movie movie2 = new Movie("Kill Bill Vol 1", 180);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        Director director = new Director("Quentin", "Tarantino", movieList);
        System.out.println(director);
        System.out.println(director.getDirectorName());
        System.out.println(director.getDirectedMoviesSize());

    }
}
