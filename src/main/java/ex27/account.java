package ex27;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class account {
    private String firstname, lastname, zipcode, id;
    String error = "";

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getId() {
        return id;
    }

    public int checkName(String name, int which)
    {
        String regex = "(?=.*[a-zA-Z])" + "(?=\\S+$).{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        if (m.matches())
        {
            return 1;
        }
        if (which == 0)
        {
            if (name.equals(""))
            {
                error = error + "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
                return 3;
            }
            error = error + "The first name must be at least 2 characters long.\n";
        }
        else
        {
            if (name.equals(""))
            {
                error = error + "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";
                return 3;
            }
            error = error + "The last name must be at least 2 characters long.\n";
        }
        return 0;
    }
    public int checkID(String id)
    {
        String regex = "^(?=.*[0-9]{4,4})" + "(?=.*[A-Z]{2,2})" + "(?=.*[-]{1,1})" + "(?=\\S+$).{7,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(id);
        if (m.matches())
        {
            return 1;
        }
        error = error + "The employee ID must be in the format of AA-1234.\n";
        return 0;
    }
    public int checkZIP(String zipcode)
    {
        String regex = "^(?=.*[0-9])" + "(?=\\S+$).{5,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(zipcode);
        if (m.matches())
        {
            return 1;
        }
        error = error + "The zipcode must be a 5 digit number.\n";
        return 0;
    }
    public void validateInput(String firstname, String lastname, String zipcode, String id)
    {
        int first, last, zipboolean, idboolean;
        first = checkName(firstname, 0);
        last = checkName(lastname, 1);
        idboolean = checkID(id);
        zipboolean = checkZIP(zipcode);
        System.out.println((first + last + zipboolean + idboolean) == 4 ? "There were no errors found." : error);
    }
}

