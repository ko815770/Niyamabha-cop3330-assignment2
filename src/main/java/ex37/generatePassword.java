package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class generatePassword {
    int length, number, special;
    ArrayList<Character> charlist = new ArrayList<>();
    public int getLength() {
        return length;
    }

    public int getNumber() {
        return number;
    }

    public int getSpecial() {
        return special;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void addNumber(int number)
    {
        String num = "1234567890";
        for (int i = 0; i < number; i++) {
            this.charlist.add(num.charAt(ThreadLocalRandom.current().nextInt(0, num.length())));
        }
    }

    public void addSpecial(int special)
    {
        String spechar = "!@#$%^&*";
        for (int i = 0; i < special; i++) {
            this.charlist.add(spechar.charAt(ThreadLocalRandom.current().nextInt(0, spechar.length())));
        }
    }

    public void addLetter(int length)
    {
        String letter = "abcdefghijklmnopqrstuvwxyz";
        for (int i = this.charlist.size() - 1; i < length; i++) {
            this.charlist.add(letter.charAt(ThreadLocalRandom.current().nextInt(0, letter.length())));
        }
    }

    public String shufflestring()
    {
        String password = "" ;
        Collections.shuffle(this.charlist);
        for (int i = 0; i < this.charlist.size(); i++) {
            password += Character.toString(this.charlist.get(i));
        }
        return password;
    }
}
