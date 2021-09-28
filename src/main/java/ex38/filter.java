package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import java.util.ArrayList;

public class filter {
    String numbers;
    ArrayList<Character> numlist = new ArrayList<>();
    ArrayList<Character> evenlist = new ArrayList<>();

    public filter(String numbers) {
        this.numbers = numbers;
    }

    public String getNumbers() {
        return numbers;
    }

    public ArrayList<Character> getNumlist() {
        return numlist;
    }

    public void setEvenlist(ArrayList<Character> evenlist) {
        this.evenlist = evenlist;
    }

    public void fillist(String numbers)
    {
        for (int i = 0; i < numbers.length(); i++) {
            this.numlist.add(numbers.charAt(i));
        }
    }

    public ArrayList<Character> filterEvenNumbers(ArrayList<Character> numlist)
    {
        ArrayList<Character> evenlist = new ArrayList<>();
        for (int i = 0; i < numlist.size(); i++) {
            if (numlist.get(i) == ' ')
            {
                evenlist.add(numlist.get(i));
            }
            else
            {
                if (Character.getNumericValue(numlist.get(i)) % 2 == 0)
                {
                    evenlist.add(numlist.get(i));
                }
            }
        }
        return evenlist;
    }

    public void printlist()
    {
        System.out.println();
        System.out.print("The Even numbers are ");
        for (int i = 0; i < evenlist.size(); i++) {
            System.out.print(this.evenlist.get(i));
        }
        System.out.print(".");
    }
}
