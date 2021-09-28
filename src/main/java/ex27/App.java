package ex27;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        account user = new account();
        System.out.println("Enter the first name: ");
        user.setFirstname(input.nextLine());
        System.out.println("Enter the last name: ");
        user.setLastname(input.nextLine());
        System.out.println("Enter the ZIP code: ");
        user.setZipcode(input.nextLine());
        System.out.println("Enter the employee ID: ");
        user.setId(input.nextLine());
        user.validateInput(user.getFirstname(), user.getLastname(), user.getZipcode(), user.getId());
    }
}
