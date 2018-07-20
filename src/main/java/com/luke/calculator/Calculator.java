package com.luke.calculator;
import org.springframework.stereotype.Service;

/**
 * Main Calculator class.
 */
@Service
public class Calculator {
     int sum(int a, int b) {
          return a + b;
     }
}
