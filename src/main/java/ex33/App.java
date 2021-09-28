package ex33;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question?\n> ");
        input.nextLine();
        ball user = new ball();
        System.out.println("\n" + user.output(user.getBalloutput(), user.random));


    }
}

