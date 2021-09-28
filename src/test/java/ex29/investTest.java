package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class investTest {
    invest test = new invest(4);
    @Test
    void getNumber() {
        assertEquals(4, test.getNumber());
    }

    @Test
    void divide() {
        assertEquals(18, test.divide(test.getNumber()));
    }
}