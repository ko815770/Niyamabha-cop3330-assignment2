package ex31;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args) {
        Karvonen user = new Karvonen();
        boolean pass = true;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your age?");
            user.setAge(input.nextInt());
            System.out.println("What is your resting heart rate?");
            user.setHeartrate(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value");
            pass = false;
        }
        System.out.println("Resting Pulse: " + user.getHeartrate() + "\t\tAge: " + user.getAge());
        System.out.println("\nIntensity\t | Rate");
        System.out.println("-------------|--------");
        user.calculate(user.getAge(), user.getHeartrate());
    }
}