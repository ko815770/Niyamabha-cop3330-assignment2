package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statisticTest {

    @Test
    void average() {
        statistic test = new statistic();
        test.addnumlist("100");
        test.addnumlist("200");
        test.addnumlist("1000");
        test.addnumlist("300");
        assertEquals(400.00, test.average(test.getNumlist()));
    }

    @Test
    void minimum() {
        statistic test = new statistic();
        test.addnumlist("100");
        test.addnumlist("200");
        test.addnumlist("1000");
        test.addnumlist("300");
        assertEquals(100, test.minimum(test.getNumlist()));
    }

    @Test
    void maximum() {
        statistic test = new statistic();
        test.addnumlist("100");
        test.addnumlist("200");
        test.addnumlist("1000");
        test.addnumlist("300");
        assertEquals(1000, test.maximum(test.getNumlist()));
    }

    @Test
    void std() {
        statistic test = new statistic();
        test.addnumlist("100");
        test.addnumlist("200");
        test.addnumlist("1000");
        test.addnumlist("300");
        test.setMean(test.average(test.getNumlist()));
        assertEquals(353.5533905932738, test.std(test.getNumlist(), test.getMean()));
    }
}