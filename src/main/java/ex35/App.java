package ex35;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int check = 1;
        String name;
        lottery lot = new lottery();
        while (check == 1)
        {
            System.out.println("Enter a name:");
            name = input.nextLine();
            if (name.equals(""))
            {
                check = 0;
            }
            else
            {
                lot.addlist(name);
            }
        }
        lot.setRandom(lot.generatenumber());
        System.out.println("The winner is..." + lot.winner(lot.getList(), lot.getRandom()) + ".");
    }
}