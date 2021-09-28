package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
class accountTest {

    @Test
    void checkName() {
        account test = new account();
        assertEquals(0, test.checkName("3", 0));
        assertEquals(1, test.checkName("John", 0));
        assertEquals(3, test.checkName("", 1));
        assertEquals(1, test.checkName("Johnson", 1));
    }

    @Test
    void checkID() {
        account test = new account();
        assertEquals(0, test.checkID("A12-1234"));
        assertEquals(1, test.checkID("TK-4321"));
    }

    @Test
    void checkZIP() {
        account test = new account();
        assertEquals(0, test.checkZIP("ABCDE"));
        assertEquals(1, test.checkZIP("55555"));
    }
}