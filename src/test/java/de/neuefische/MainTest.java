package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_when1Plus1_thenReturn2() {
        // GIVEN
        int a = 1;
        int b = 1;
        int expected = a + b;
        // WHEN
        int actual = Main.add(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void add_when2Plus2_thenReturn4(){
        // GIVEN
        int a = 2;
        int b = 2;
        int expected = a + b;
        // WHEN
        int actual = Main.add(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isEven_whenNumberIsEven_thenReturnTrue(){
        // GIVEN
        int number = 6;
        // WHEN
        boolean actual = Main.isEven(number);
        // THEN
        assertFalse(actual);
    }
}