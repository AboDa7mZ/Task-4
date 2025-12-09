package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        assertEquals("Hello, World!", app.greet());
    }

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-2, 2));
        assertEquals(-5, app.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5, 3));
        assertEquals(0, app.subtract(5, 5));
        assertEquals(-2, app.subtract(3, 5));
    }

    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(20, app.multiply(4, 5));
        assertEquals(0, app.multiply(0, 5));
        assertEquals(-6, app.multiply(-2, 3));
    }

    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(5.0, app.divide(10, 2));
        assertEquals(2.5, app.divide(5, 2));
        assertEquals(0.0, app.divide(0, 5));
    }

    @Test
    public void testDivideByZero() {
        App app = new App();
        assertThrows(IllegalArgumentException.class, () -> app.divide(10, 0));
    }
}
