package com.ironhack.w1.d3;

// una clase es una plantilla donde vamos a definir las propiedades y métodos que tendrán los objetos dentro de la misma
// un objeto es una instancia de una clase

public class Movie {
    //    vamos a crear algunas propiedades
    private String title;
    private int duration;
    public final boolean IS_GOOD = true;

    //    para crear objetos de tipo movie necesitamos usar el metodo constructor con alt + insert

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
        this.duration = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void play() {
        System.out.println("Playing " + this.title);
    }

    public static void displayAlert() {
        System.out.println("It is illegal to copy this movie");
    }
}