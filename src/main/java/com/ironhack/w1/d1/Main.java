package com.ironhack.w1.d1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        // PRIMITIVE DATA TYPES

        byte myByte = 100; // En Java se usa el Camel Case para las variables y los métodos. Para las clases se usa el Pascal Case (se empieza con mayúscula).
        short myShort = 1000;
        int myInt = 9999;
        long myLong = 50000000000000000L;
        float myFloat = 1.2345f;
        double myDouble = 3.456;
        boolean myBool = true;
        char myChar = 'a';


        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBool: " + myBool);
        System.out.println("myChar: " + myChar);

        myInt = 1234;
        System.out.println("myInt: " + myInt);

        // Strings

        String myString = "Hello to everyone"; // los strings no son un tipo de variable primitiva en Java. Por eso, al declararlas, hay que poner la palabra String, en mayúscula
        System.out.println(myString);

        // Operators

        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 5);
        System.out.println(number / 3); // al dividir un entero por otro entero, el resultado también será un entero
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);


        // Conditionals

        // if-else

        number = 10;

        if (number == 0) {
            System.out.println("Number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("Number is bigger or equal than 100 and less or equal than 1000");
        } else {
            System.out.println("Number has another value");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("Number has at least 2 digits");
        }

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        boolean myCondition = true;

        if (myCondition) System.out.println("Condition is true");
        else System.out.println("Condition is false");

        // switch case (hace lo mismo que un if-else)

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

// Calling Methods

        myMethod();

        String info = getInfo(3);
        System.out.println(info);

// String Methods

        String address = "Fake Street 123";

        System.out.println("Address lenght: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("E", "-"));

        String address2 = "Fake Street 123";

        if (address.equals(address2)) System.out.println("They are the same address");
        else System.out.println("They are not the same address");

// Wrappers

        Integer myNum = 100;
        System.out.println(myNum);
        System.out.println(myNum.toString()); // los wrappers sirven para poder usar métodos con variables primitivas

        // CFU: Foundational data types and Conditionals

        int value_int = 20;
        String value_string = "Java";
        double value_double = 23.63;

        System.out.println("value_int: " + value_int + ", value_string: " + value_string + ", value_double: " + value_double);
        System.out.printf("value_int: %d, value_string: %s, value_double: %.2f", value_int, value_string, value_double);

        Number number_test = 50.5;
        if (number_test instanceof Double) {System.out.println("\nnumber_test is a Double");}
        else {System.out.println("\nnumber_test is not a Double");}

        int num1 = 50;
        int num2 = 20;
        int num3 = 30;
        int smallest;
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("The smallest number is: " + smallest);

        System.out.println(productFormatter("Python para finanzas Quant", "2021-01-01"));
    }

// METHODS

    public static void myMethod() {
        System.out.println("This");
        System.out.println("Is");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Gringo";
        else if (option == 2) return "This is a Java course";
        else return "option " + option + " provides no info";
    }

    public static String productFormatter(String productName, String date) {
        // Trim the product name
        String trimmedName = productName.trim();

        // Convert tu uppercase

        String upperCaseName = trimmedName.toUpperCase();

        // Replace spaces with underscores

        String nameWithUnderscores = upperCaseName.replace(" ", "_");

        // Append the date
        String formattedName = nameWithUnderscores + "_" + date;

        return formattedName;
    }
}

