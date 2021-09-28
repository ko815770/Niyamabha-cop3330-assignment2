package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */

public class Karvonen {
    int age, heartrate;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getAge() {
        return age;
    }

    public int getHeartrate() {
        return heartrate;
    }
    public double kar(int age, int heartrate, int i)
    {
        return (((220 - age) - heartrate) * (i * 0.01)) + heartrate;
    }

    public void calculate(int age, int heartrate)
    {
        double target;
        for (int i = 55; i <= 95; i += 5) {
            target = kar(age, heartrate, i);
            System.out.println(i + "%" + "\t\t\t |" + String.format("%.0f", target) + " bpm");
        }
    }
}
