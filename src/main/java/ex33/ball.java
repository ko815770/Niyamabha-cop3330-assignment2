package ex33;

import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class ball {
    String balloutput[] = {"Yes." , "No.", "Maybe.", "Ask again later."};
    int random = ThreadLocalRandom.current().nextInt(0, 4);

    public String[] getBalloutput() {
        return balloutput;
    }

    public String output(String balloutput[], int random)
    {
        return balloutput[random];
    }

}
