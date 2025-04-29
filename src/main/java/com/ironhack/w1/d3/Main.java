package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lordOfTheRings = new Movie("El orco del trono", 150);
        Movie harryPotter2 = new Movie("Harry Potter y la piedra filosofal");

        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        harryPotter.setTitle("Harry Potter y la piedra filosofal");
        harryPotter.setDuration(150);
        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        System.out.println(lordOfTheRings.getTitle() + " " + lordOfTheRings.getDuration());

        System.out.println(harryPotter);
        System.out.println(lordOfTheRings);
        System.out.println(harryPotter2);
        System.out.println(harryPotter.IS_GOOD);
        harryPotter.play();
        Movie.displayAlert();

        HorrorMovie scream = new HorrorMovie("Scream", 100, false);
        System.out.println(scream.getTitle() + " " + scream.getDuration() + " " + scream.isReallyScary());
        scream.play();
    }
}
