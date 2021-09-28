package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(70.0, PaymentCalculator.calculateMonthsUntilPaidOff(5000, 100, 12));
    }
}