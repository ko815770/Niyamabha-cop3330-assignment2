package ex36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        String num, regex = "^(?=.*[0-9])" + "(?=\\S+$).{1,}$";
        statistic stat = new statistic();
        Pattern p = Pattern.compile(regex);
        Matcher m;
        while (check == 1)
        {
            System.out.println("Enter a number:");
            num = input.nextLine();
            m = p.matcher(num);
            if (num.equals("done"))
            {
                check = 0;
            }
            else if (m.matches())
            {
                //System.out.println(num + " added");
                stat.addnumlist(num);
            }
        }
        stat.printNumber(stat.getNumlist());
        stat.setMean(stat.average(stat.getNumlist()));
        System.out.println("\nThe average is " + String.format("%.1f", stat.getMean()));
        System.out.println("The minimum is " + stat.minimum(stat.getNumlist()));
        System.out.println("The maximum is " + stat.maximum(stat.getNumlist()));
        System.out.println("The standard deviation is " + String.format("%.2f", stat.std(stat.getNumlist(), stat.getMean())));
    }
}
