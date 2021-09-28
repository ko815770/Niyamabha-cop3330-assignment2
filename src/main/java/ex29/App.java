package ex29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String in, regex = "(?=.*[0-9])" + "(?=\\S+$).{1,}$";
        int check = 1;
        Pattern p = Pattern.compile(regex);
        Matcher m;
        while (check == 1)
        {
            System.out.println("What is the rate of return?");
            in = input.nextLine();
            m = p.matcher(in);
            if (m.matches())
            {
                invest user = new invest(Integer.parseInt(in));
                System.out.println("It will take " + user.divide(user.getNumber()) + " years to double your initial investment.");
                check = 0;
            }
            else
                System.out.println("Sorry. That's not a valid input.");

        }


    }
}
