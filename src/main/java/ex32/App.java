package ex32;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        int check = 1, enter = 1;
        Scanner input = new Scanner(System.in);
        Guess game = new Guess();
        System.out.println("Let's play Guess the Number!\n");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        try
        {
            game.setRandom(game.setUp(input.nextInt()));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value");
            enter = 0;
        }
        if (enter == 1)
        {
            System.out.println("I have my number. What's your guess? ");
            while (check == 1)
            {
                try
                {
                    game.setUserGuess(input.nextInt());
                } catch (InputMismatchException e) {
                    String no = input.next();
                    System.out.println("Please enter a numeric value");
                    check = game.checkNumber(game.getUserGuess(), game.getRandom());
                    continue;
                }
                check = game.checkNumber(game.getUserGuess(), game.getRandom());
            }
        }
    }
}
