package ex28;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class addition {
    Scanner input = new Scanner(System.in);
    public int loop(int number, int in)
    {
        return number + in;
    }
    public int add()
    {
        int number = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            if (input.hasNextInt())
            {
                number = loop(number, input.nextInt());
            }
            else
                return -1;
        }
        System.out.println("The total is " + number + ".");
        return 0;
    }
}
