package io.github.deepaksorthiya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(8, calc.add(5, 3));
    }
}