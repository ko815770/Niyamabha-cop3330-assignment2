package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class additionTest {
    addition test = new addition();
    @Test
    void add() {
        assertEquals(5, test.loop(2, 3));
    }
}