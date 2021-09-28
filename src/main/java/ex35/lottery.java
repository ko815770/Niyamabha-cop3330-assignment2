package ex35;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class lottery
{
    ArrayList<String> list = new ArrayList<String>();
    int random;

    public void setRandom(int random) {
        this.random = random;
    }

    public int getRandom() {
        return random;
    }

    public void addlist(String candidate)
    {
        this.list.add(candidate);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public int generatenumber()
    {
        int random = ThreadLocalRandom.current().nextInt(0, list.size());
        return random;
    }
    public String winner(ArrayList<String> list, int random)
    {
        return list.get(random);
    }
}
