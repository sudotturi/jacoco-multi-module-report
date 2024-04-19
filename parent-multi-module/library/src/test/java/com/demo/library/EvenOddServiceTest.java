package com.demo.library;

import com.demo.library.service.EvenOddService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddServiceTest {

    private final EvenOddService evenOddService = new EvenOddService();

    @Test public void givenEvenNumber_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = 2;
        String result = evenOddService.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenOddNumber_whenIsEvenOrOdd_thenResultIsOdd() {
        Integer number = 3;
        String result = evenOddService.isEvenOrOdd(number);
        assertEquals("Odd", result);
    }

    @Test public void givenZero_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = 0;
        String result = evenOddService.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenNegativeEvenNumber_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = -4;
        String result = evenOddService.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenNegativeOddNumber_whenIsEvenOrOdd_thenResultIsOdd() {
        Integer number = -5;
        String result = evenOddService.isEvenOrOdd(number);
        assertEquals("Odd", result);
    }
}
