package ex39;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class sorting {
    TreeMap<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();

    public void fillmap()
        {
            ArrayList<String> object1 = new ArrayList<>();
            object1.add("John");
            object1.add("Manager");
            object1.add("2016-12-31");
            this.map.put("Johnson", object1);
            ArrayList<String> object2  = new ArrayList<>();
            object2.add("Tou");
            object2.add("Software Engineer");
            object2.add("2016-10-05");
            this.map.put("Xiong", object2);
            ArrayList<String> object3  = new ArrayList<>();
            object3.add("Michaela");
            object3.add("District Manager");
            object3.add("2015-12-19");
            this.map.put("Michaelson", object3);
            ArrayList<String> object4  = new ArrayList<>();
            object4.add("Jake");
            object4.add("Programmer");
            object4.add("");
            this.map.put("Jacobson", object4);
            ArrayList<String> object5  = new ArrayList<>();
            object5.add("Jacquelyn");
            object5.add("DBA");
            object5.add("");
            this.map.put("Jackson", object5);
            ArrayList<String> object6  = new ArrayList<>();
            object6.add("Sally");
            object6.add("Web Developer");
            object6.add("2015-12-18");
            this.map.put("Webber", object6);
        }

    public int printMap()
    {
        if (this.map.isEmpty())
        {
            return 1;
        }
        System.out.println("Name                  |  Positon             | Seperation Date");
        System.out.println("----------------------|----------------------|--------------------");
        Set<Map.Entry<String, ArrayList<String>> > entries
                = map.entrySet();
        entries.forEach(entry ->
        {
            String key = entry.getKey(), value1 = entry.getValue().get(0), value2 = entry.getValue().get(1), value3 = entry.getValue().get(2);
            System.out.format("%-10s %-10s %s %20s %s %-5s", value1, key, "|" , value2, "|" , value3);
            System.out.println();
        });
        return 0;
    }
}
