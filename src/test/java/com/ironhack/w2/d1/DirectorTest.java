package com.ironhack.w2.d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    public static List<Movie> movieList;
    public static Director director;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll is the first to be executed");

        Movie movie1 = new Movie("Pulp Fiction", 140);
        Movie movie2 = new Movie("Kill Bill Vol 1", 180);
        movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach is executed before each test");

        director = new Director("Quentin", "Tarantino", movieList);

    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach is executed after each test");
    }

    @Test
    void getDirectedMoviesSize() {
        int directedMoviesSize = director.getDirectedMoviesSize();
        System.out.println("Directed Movies Size:" + directedMoviesSize);

        assertEquals(2, directedMoviesSize);
    }

    @Test
    void getDirectorName() {
        String fullName = director.getDirectorName();
        System.out.println("Director Name:" + fullName);

        assertEquals("Quentin Tarantino", fullName);
    }

}