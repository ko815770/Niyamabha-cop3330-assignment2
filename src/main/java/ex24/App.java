package ex24;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        boolean check;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        anagrams anaclass = new anagrams();
        System.out.println("Enter the first string:");
        anaclass.setString1(input.nextLine());
        System.out.println("Enter the second string:");
        anaclass.setString2(input.nextLine());
        check = anaclass.IsAnagram(anaclass.getString1(), anaclass.getString2());
        if (check == false)
        {
            System.out.println("\"" + anaclass.getString1() + "\"" +" and " + "\"" + anaclass.getString2() + "\"" + " are not anagrams.");
        }
        else
        {
            System.out.println("\"" + anaclass.getString1() + "\"" +" and " + "\"" + anaclass.getString2() + "\"" + " are anagrams.");
        }
    }
}
