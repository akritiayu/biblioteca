package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Bhanu
 * Date: 21/9/12
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserDetails
{
    public static int which_user_logged_in;
    public static String name[]=new String[] {"Akriti","Pooja","Pallavi","Renu"};
    public static String email_id[]=new String[] {"akriti@gmail.com","pooja@gmail.com","pallavi@gmail.com","renu@gmail.com"};
    public static String phone_number[]=new String[] {"9911231677","9267341672","9123456789","8912345678"};
    public static boolean details(int choice)
    {
        if (Login.flag_indicator_of_userlogin==0)
            System.out.println ("Please talk to Librarian. Thank you.");
        else
        {
         System.out.println("Library Number\t\t\t\tName\t\t\t\tEmail-ID\t\t\t\tPhone Number");
         System.out.println(Login.user_name[which_user_logged_in]+"\t\t\t\t\t"+name[which_user_logged_in]+"\t\t\t"+email_id[which_user_logged_in]+"\t\t\t"+phone_number[which_user_logged_in]);
        }
        return true ;
    }
}
