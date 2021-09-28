package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTest {
    Guess test = new Guess();
    @Test
    void checkNumber() {
        assertEquals(1, test.checkNumber(3, 5));
        assertEquals(0, test.checkNumber(3, 3));
    }
}