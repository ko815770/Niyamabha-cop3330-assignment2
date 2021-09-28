package ex25;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class checkPassword {
    private String password;

    public checkPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public static int passwordValidator(String password)
    {
        String regex2 = "(?=.*[a-zA-Z])" + "(?=\\S+$).{1,}$";
        String regex3 = "^(?=.*[0-9])" + "(?=.*[a-zA-Z])" + "(?=\\S+$).{8,}$";
        String regex4 = "^(?=.*[0-9])" + "(?=.*[a-zA-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";
        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(password);
        if (m.matches())
        {
            return 4;
        }
        else
        {
            p = Pattern.compile(regex3);
            m = p.matcher(password);
            if (m.matches())
            {
                return 3;
            }
            else
            {
                p = Pattern.compile(regex2);
                m = p.matcher(password);
                if (m.matches())
                {
                    return 2;
                }
                else
                {
                    return 1;
                }
            }
        }
    }
}
