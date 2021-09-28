package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class employee {
    String worker[] = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

    public String[] getWorker() {
        return worker;
    }

    public void printworker(String worker[])
    {
        System.out.println("There are " + worker.length + " employees:");
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i]);
        }
    }

    public String[] deleteelement(String worker[], String delete)
    {
        String copy[] = new String[worker.length - 1];
        int i, j, index = -1;
        for (i = 0; i < worker.length; i++) {
            if (delete.equals(worker[i]))
            {
                index = i;
            }
        }
        if (index > -1)
        {
            for (i = 0, j = 0; i < worker.length; i++) {
                if (i != index)
                {
                    copy[j++] = worker[i];
                }
            }
            return copy;
        }
        else
        {
            System.out.println("Name does not exist");
            return worker;
        }

    }


}
