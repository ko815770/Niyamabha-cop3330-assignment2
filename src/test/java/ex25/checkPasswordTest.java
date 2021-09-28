package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkPasswordTest {

    @Test
    void passwordValidator() {
        assertEquals(1, checkPassword.passwordValidator("12345"));
        assertEquals(2, checkPassword.passwordValidator("abcdef"));
        assertEquals(3, checkPassword.passwordValidator("abc123xyz"));
        assertEquals(4, checkPassword.passwordValidator("1337h@xor1"));
    }
}