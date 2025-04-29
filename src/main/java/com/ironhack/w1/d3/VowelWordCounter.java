package com.ironhack.w1.d3;

import java.util.Scanner;

public class VowelWordCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        int vowelWordCount = 0;
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            char firstChar = Character.toLowerCase(word.charAt(0));

            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                vowelWordCount++;
            } else {
                System.err.println("Word " + word + " does not start with a vowel");
            }
        }

        System.out.println("Number of words starting with a vowel: " + vowelWordCount);

        scanner.close();
    }
}
