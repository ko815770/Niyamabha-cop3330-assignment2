package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filterTest {

    @Test
    void filterEvenNumbers() {
        filter test = new filter("2 4 6 8");
        test.fillist(test.getNumbers());
        assertEquals(test.getNumlist(), test.filterEvenNumbers(test.getNumlist()));
    }
}