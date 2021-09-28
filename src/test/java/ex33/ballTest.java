package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ballTest {

    @Test
    void output() {
        ball test = new ball();
        assertEquals("Maybe.", test.output(test.getBalloutput(), 2));
        assertEquals("No.", test.output(test.getBalloutput(), 1));
    }
}