package ex40;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search string" );
        filterrec record = new filterrec(input.nextLine());
        record.fillupmap();
        record.printtheMap();

    }
}