package ex37;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        generatePassword password = new generatePassword();
        System.out.println("What's the minimum length?");
        password.setLength(input.nextInt());
        System.out.println("How many special characters?");
        password.setSpecial(input.nextInt());
        System.out.println("How many numbers?");
        password.setNumber(input.nextInt());
        password.addSpecial(password.getSpecial());
        password.addNumber(password.getNumber());
        password.addLetter(password.getLength());
        System.out.println("Your password is " + password.shufflestring());
    }
}
