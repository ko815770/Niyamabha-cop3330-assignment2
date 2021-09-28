package ex36;

import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class statistic {
    ArrayList<String> numlist = new ArrayList<String>();
    double mean;

    public ArrayList<String> getNumlist() {
        return numlist;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public void addnumlist(String candidate)
    {
        this.numlist.add(candidate);
    }

    public void printNumber(ArrayList<String> numlist)
    {
        System.out.println("Numbers: ");
        System.out.print(numlist.get(0));
        for (int i = 1; i < numlist.size(); i++) {
            System.out.print(", " + numlist.get(i));
        }
    }

    public double average(ArrayList<String> numlist)
    {
        double averageNumber = 0.0;
        for (int i = 0; i < numlist.size(); i++) {
            averageNumber = averageNumber + Double.parseDouble(numlist.get(i));
        }
        return averageNumber / (numlist.size());
    }

    public int minimum(ArrayList<String> numlist)
    {
        int min = 999999999;
        for (int i = 0; i < numlist.size(); i++) {
            if (Integer.parseInt(numlist.get(i)) < min)
            {
                min = Integer.parseInt(numlist.get(i));
            }
        }
        return min;
    }

    public int maximum(ArrayList<String> numlist)
    {
        int max = 0;
        for (int i = 0; i < numlist.size(); i++) {
            if (Integer.parseInt(numlist.get(i)) > max)
            {
                max = Integer.parseInt(numlist.get(i));
            }
        }
        return max;
    }

    public double std(ArrayList<String> numlist, double average)
    {
        double std = 0.0;
        for (int i = 0; i < numlist.size(); i++) {
            std += Math.pow(Double.parseDouble(numlist.get(i)) - average, 2);
        }
        return Math.sqrt(std / numlist.size());
    }
}
