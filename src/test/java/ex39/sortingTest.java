package ex39;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortingTest {

    @Test
    void printMap() {
        sorting test = new sorting();
        assertEquals(1, test.printMap());
        test.fillmap();
        assertEquals(0, test.printMap());
    }
}