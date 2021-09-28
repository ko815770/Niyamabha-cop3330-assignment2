package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenTest {

    @Test
    void kar() {
        Karvonen test = new Karvonen();
        assertEquals(138.15, test.kar(22, 65, 55));
    }
}