package com.ironhack.w2.d1;

import com.ironhack.w2.d1.CFU.MathLibrary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest {
    private MathLibrary mathLibrary;

    @BeforeEach
    public void setUp() {
        mathLibrary = new MathLibrary();
    }

    @Test
    public void add_twoNegativeInts_Summed(){
        MathLibrary mathLibrary = new MathLibrary();
        int a = -5;
        int b = -3;
        int expectedSum = -8;

        int actualSum = mathLibrary.add(a, b);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of positive integers returns correct result")
    public void sumList_withPositiveIntegers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSum = 15;

        int actualSum = mathLibrary.sumList(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of negative integers returns correct result")
    public void sumList_withNegativeIntegers_returnsSumOfAllIntegers() {
        // Arrange
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -5);
        int expectedSum = -15;

        // Act
        int actualSum = mathLibrary.sumList(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of mixed positive and negative integers returns correct result")
    public void sumList_withMixedIntegers_returnsSumOfAllIntegers() {
        // Arrange
        List<Integer> numbers = Arrays.asList(10, -5, 3, -8, 0);
        int expectedSum = 0;

        // Act
        int actualSum = mathLibrary.sumList(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of empty list returns zero")
    public void sumList_withEmptyList_returnsZero() {
        // Arrange
        List<Integer> numbers = Collections.emptyList();
        int expectedSum = 0;

        // Act
        int actualSum = mathLibrary.sumList(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of null list returns zero")
    public void sumList_withNullList_returnsZero() {
        // Arrange
        List<Integer> numbers = null;
        int expectedSum = 0;

        // Act
        int actualSum = mathLibrary.sumList(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("Sum of list with single integer returns that integer")
    public void sumList_withSingleInteger_returnsThatInteger() {
        // Arrange
        List<Integer> numbers = Collections.singletonList(42);
        int expectedSum = 42;

        // Act
        int actualSum = mathLibrary.sumList(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}
