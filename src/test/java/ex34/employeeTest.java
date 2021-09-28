package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeTest {

    @Test
    void deleteelement() {
        employee test = new employee();
        assertEquals(test.worker, test.deleteelement(test.getWorker(), "Do not delete"));
    }
}