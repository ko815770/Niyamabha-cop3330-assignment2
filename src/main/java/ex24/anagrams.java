package ex24;
import java.util.Arrays;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class anagrams {
    public String string1, string2;


    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public static boolean IsAnagram(String string1, String string2)
    {
        char[] charString1 = string1.toCharArray();
        char[] charString2 = string2.toCharArray();
        if (string1.length() == string2.length())
        {
            Arrays.sort(charString1);
            Arrays.sort(charString2);
            for (int i = 0; i < string1.length(); i++) {
                if (charString1[i] != charString2[i])
                    return false;
                else
                    return true;
            }
        }
        return false;
    }
}

