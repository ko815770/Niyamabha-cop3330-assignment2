package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
import java.util.concurrent.ThreadLocalRandom;
public class Guess {
    private int random, userGuess, difficulty, count;

    public void setUserGuess(int userGuess) {
        if (userGuess > 0 && userGuess < 1001) {
            this.userGuess = userGuess;
        }
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getRandom() {
        return random;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public int setUp(int difficulty)
    {
        int random = 1;
        if (difficulty == 1)
        {
            random = ThreadLocalRandom.current().nextInt(1, 11);
        }
        else if (difficulty == 2)
        {
            random = ThreadLocalRandom.current().nextInt(1, 101);
        }
        else if (difficulty == 3)
        {
            random = ThreadLocalRandom.current().nextInt(1, 1001);
        }
        return random;
    }
    public int checkNumber(int userGuess, int random)
    {
        if ((userGuess < random) && userGuess > 0)
        {
            System.out.println("Too low. Guess again: ");
            this.count++;
            return 1;
        }
        else if ((userGuess > random) && userGuess < 1000)
        {
            System.out.println("Too high. Guess again: ");
            this.count++;
            return 1;
        }
        else if (userGuess == random)
        {
            this.count++;
            System.out.println("You got it in " + this.count + " guesses!");
            return 0;
        }
        this.count++;
        return 1;
    }
}
