package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testSumar() {

        App app = new App();

        int resultado = app.sumar(2, 3);

        assertEquals(10, resultado);
    }
}