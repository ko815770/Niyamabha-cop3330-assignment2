package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramsTest {

    @Test
    void isAnagram() {
        assertEquals(true, anagrams.IsAnagram("abc", "bca"));
        assertEquals(true, anagrams.IsAnagram("abcd", "bcda"));
        assertEquals(false, anagrams.IsAnagram("abc", "ca"));
        assertEquals(false, anagrams.IsAnagram("abc", "gdj"));
    }
}