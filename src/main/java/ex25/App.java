package ex25;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        String printtext = "very weak";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");
        checkPassword check = new checkPassword(input.nextLine());
        switch (check.passwordValidator(check.getPassword()))
        {
            case 1:
                printtext = "very weak";
                break;
            case 2:
                printtext = "weak";
                break;
            case 3:
                printtext = "strong";
                break;
            case 4:
                printtext = "very strong";
                break;
        }
        System.out.println("The password " + "'" + check.getPassword() + "'" + " is a " + printtext + " password.");
    }
}
