package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(String.format("%4d", multiplyNum(i, j)));
            }
            System.out.println();
        }
    }
    public static int multiplyNum(int number1, int number2)
    {
        return number1 * number2;
    }
}