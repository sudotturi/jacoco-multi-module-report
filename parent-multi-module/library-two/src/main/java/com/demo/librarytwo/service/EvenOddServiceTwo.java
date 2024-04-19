package com.demo.librarytwo.service;

import org.springframework.stereotype.Service;

@Service
public class EvenOddServiceTwo {
 
    public String isEvenOrOdd(Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}