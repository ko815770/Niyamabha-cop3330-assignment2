package ex26;
import java.lang.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class PaymentCalculator {
    private double balance, monthly;
    private double apr;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthly() {
        return monthly;
    }

    public double getApr() {
        return apr;
    }

    public static double calculateMonthsUntilPaidOff(double balance, double monthly, double apr)
    {
        double n;
        apr = apr / 36500;
        n = (-1.0/30.0) * Math.log(1 + ((balance/monthly) * (1 - (Math.pow((1 + apr), 30))))) / Math.log(1 + apr);
        n = Math.ceil(n);
        return n;
    }

}
