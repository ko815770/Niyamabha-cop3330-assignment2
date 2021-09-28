package ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PaymentCalculator credit = new PaymentCalculator();
        System.out.println("What is your balance?");
        credit.setBalance(input.nextDouble());
        System.out.println("What is the APR on the card (as percent)?");
        credit.setApr(input.nextDouble());
        System.out.println("What is the monthly payment you can make?");
        credit.setMonthly(input.nextDouble());
        System.out.println("It will take you " + String.format("%.0f", credit.calculateMonthsUntilPaidOff
                (credit.getBalance(), credit.getMonthly(), credit.getApr())) + " months to pay off this card.");
    }
}
