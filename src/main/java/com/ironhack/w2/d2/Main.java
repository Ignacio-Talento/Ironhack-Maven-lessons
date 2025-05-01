package com.ironhack.w2.d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        Checked exceptions

        readFile("file.txt");

//        Unchecked exceptions

        String name = null;
        printLenght(name);

//        Throws

        int[] sampleArray = null;

        try {
            printArray(sampleArray);
        } catch (NullPointerException e) {
            System.out.println("Array is null");
        }

//        Throwing exceptions

        int a = 900000000;
        int b = 400000000;

        try {
            int product = multiply(a, b);
            System.out.println(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Using the long version...");
            long longProduct = multiply((long) a, (long) b);
            System.out.println(longProduct);
        }

//        Equals, Hash & ToString

        Book book1 = new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
        Book book2 = new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
        System.out.println("book1 == book2; " + book1.equals(book2));




    }

    public static void readFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void printLenght(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }

    public static void printArray(int[] numArray) throws NullPointerException {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    public static int multiply(int a, int b) {
        int product = a * b;

        if (product / a != b) {
            throw new IllegalArgumentException("Product of input is too great for int");
        }

        return product;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

}
