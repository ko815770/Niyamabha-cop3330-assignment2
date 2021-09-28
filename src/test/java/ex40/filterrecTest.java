package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import ex39.sorting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filterrecTest {

    @Test
    void printtheMap() {
        filterrec test = new filterrec("jac");
        assertEquals(1, test.printtheMap());
        test.fillupmap();
        assertEquals(0, test.printtheMap());
    }
}