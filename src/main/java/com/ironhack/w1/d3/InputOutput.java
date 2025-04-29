package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        System.out.println("Normal console output");
        System.err.println("Error console output");

        // SCANNER CLASS

        // las variables que vienen de una clase se llaman objetos

        Scanner scanner = new Scanner(System.in); // acá estamos creando una variable de tipo Scanner, que va a ser un objeto porque viene de la clase Scanner

        String name; // declaramos la variable name
        do {
            System.out.println("Escribe tu nombre:");
            name = scanner.nextLine();
        } while (name.length() <= 3);
        System.out.println("Tu nombre es: " + name);

        // System.out.println("Dime tu edad:");
        // int age = scanner.nextInt();
        // System.out.println("Tu edad es: " + age);

        do {
            scanner = new Scanner(System.in);
            System.out.println("Escribe tu edad:");
        } while (!scanner.hasNextInt());
        int age = scanner.nextInt();
        System.out.println("Tu edad es: " + age);

        scanner.close();

//        FILE HANDLING (CRTL + ç para comentar)

        String filePath = "src/com/ironhack/w1/d3/file.txt";

        FileWriter fileWriter = new FileWriter(filePath, true); // creamos un objeto FileWriter
        fileWriter.write("This is a line\n");
        fileWriter.write("This is another line\n");
        fileWriter.close();

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        String str = "";

        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
        }

        fileScanner.close();
        System.out.println(str);







    }
}
