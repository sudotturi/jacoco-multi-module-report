package com.demo.application;

import com.demo.library.service.EvenOddService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EvenOddApplicationTest {

    @MockBean
    private EvenOddService evenOddService;

    private EvenOddApplication evenOddApplication;

    @BeforeEach public void setup() {
        evenOddApplication = new EvenOddApplication(evenOddService);
    }

    @Test public void givenEvenNumber_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = 2;
        when(evenOddService.isEvenOrOdd(number)).thenReturn("Even");
        String result = evenOddApplication.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenOddNumber_whenIsEvenOrOdd_thenResultIsOdd() {
        Integer number = 3;
        when(evenOddService.isEvenOrOdd(number)).thenReturn("Odd");
        String result = evenOddApplication.isEvenOrOdd(number);
        assertEquals("Odd", result);
    }

    @Test public void givenZero_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = 0;
        when(evenOddService.isEvenOrOdd(number)).thenReturn("Even");
        String result = evenOddApplication.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenNegativeEvenNumber_whenIsEvenOrOdd_thenResultIsEven() {
        Integer number = -4;
        when(evenOddService.isEvenOrOdd(number)).thenReturn("Even");
        String result = evenOddApplication.isEvenOrOdd(number);
        assertEquals("Even", result);
    }

    @Test public void givenNegativeOddNumber_whenIsEvenOrOdd_thenResultIsOdd() {
        Integer number = -5;
        when(evenOddService.isEvenOrOdd(number)).thenReturn("Odd");
        String result = evenOddApplication.isEvenOrOdd(number);
        assertEquals("Odd", result);
    }
}