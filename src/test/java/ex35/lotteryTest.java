package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class lotteryTest {

    @Test
    void winner() {
        lottery test = new lottery();
        test.addlist("Homer");
        test.addlist("Bart");
        test.addlist("Maggie");
        test.addlist("Lisa");
        test.addlist("Moe");
        assertEquals("Maggie", test.winner(test.getList(), 2));
        assertEquals("Moe", test.winner(test.getList(), 4));
    }
}