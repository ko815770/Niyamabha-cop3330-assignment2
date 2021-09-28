package ex34;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        employee array = new employee();
        array.printworker(array.getWorker());
        System.out.println("Enter an employee name to remove: ");
        array.worker = array.deleteelement(array.getWorker(), input.nextLine());
        array.printworker(array.getWorker());
    }
}
