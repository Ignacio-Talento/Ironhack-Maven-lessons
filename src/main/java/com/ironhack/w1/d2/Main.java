package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) { // shortcuts para escribir esto: psvm o main
        System.out.println("Week 1, day 2");

        // Arrays

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[0]);
        System.out.println(days.length);
        System.out.println(days[days.length - 1]);

        String[] subjectArray = createSubjectArray();
        System.out.println(Arrays.toString(subjectArray));

        // Loops

        // for loop

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < subjectArray.length; i++) {
            System.out.println(i + " : " + subjectArray[i]);
        }

        int[] evenNumbers = new int[51];
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) evenNumbers[i / 2] = i;
        }

        System.out.println(Arrays.toString(evenNumbers));

        // for each loop

        for (String subject : subjectArray) {
            System.out.println(subject);
        }

        // while loop

        int counter = 0;
        while (counter < 100) {
            System.out.println("Counter: " + counter++);
        }

        while (counter < 100) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // do while

        counter = 100;

        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 110);

        // Arraylist

        List<String> countries = new ArrayList<>();
        countries.add("Spain");
        countries.add("Italy");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0));
        System.out.println(countries.size());
        countries.set(0, "Germany");
        System.out.println(countries);
        countries.remove(1);
        System.out.println(countries);
        countries.add("Portugal");

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // Add elements to array

        int[] numbers = {0, 1, 2, 3, 4};
        // numbers[5] = 5; // This cannot be done with an array

        int[] numbers2 = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }
        numbers2[5] = 5;
        System.out.println(Arrays.toString(numbers2));

        // Math class & casting

        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 3));
        System.out.println((int) Math.pow(2, 3)); // Esto es un casting
        System.out.println((int) 3.75); // El casteo se queda con la parte entera
        System.out.println(Math.ceil(3.75));

        // CFU: Loops

        // #1

        int[] numbers3 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(numbers3));

        int[] originalNumbers = numbers3.clone();

        for (int i = 0; i < numbers3.length; i++) {
            int nextIndex = (i + 1) % numbers3.length;
            numbers3[i] = originalNumbers[i] * originalNumbers[nextIndex];
            System.out.println(numbers3[i]);
        }

        // #2

        int[] numbers4 = {1, 2, 3, 4, 5};

        int[] invertedNumbers = new int[numbers4.length];
        for (int i = 0; i < numbers4.length; i++) {
            invertedNumbers[i] = numbers4[numbers4.length - 1 - i];
            System.out.println(invertedNumbers[i]);
        }

    }

    public static String[] createSubjectArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Physics";
        subjects[2] = "Chemistry";
        subjects[3] = "English";
        subjects[4] = "History";

        return subjects;
    }
}
