package com.twu28.biblioteca;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Bhanu
 * Date: 21/9/12
 * Time: 9:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Login {
    public static String user_name[]=new String[] {"111-1111","111-1112","111-1113","111-1114"};
    public static String password[]=new String[] {"welcome1111","welcome1112","welcome1113","welcome1114"};
    public static String user_id_input;
    public static String password_input;
    public static int flag_indicator_of_userlogin=0;

    public Login(int choice)
    {
        input_login_details();
        boolean result=check_validity_of_id_and_password(choice);
        Library.display_welcome_menu();
    }

    public static void input_login_details()
    {
            flag_indicator_of_userlogin=0;
            System.out.print("Enter ur User-ID:\t");
            Scanner scan = new Scanner(System.in);
            user_id_input =scan.next();
            System.out.print("Enter ur Password:\t");
            scan =new Scanner(System.in);
            password_input =scan.nextLine();
    }

     public static boolean check_validity_of_id_and_password(int choice)
     {
      for (int i=0; i<user_name.length; i++)
       {
          if(user_id_input.equals(user_name[i])&&password_input.equals(password[i]))
          {
           flag_indicator_of_userlogin=1;
           UserDetails.which_user_logged_in=i;
           System.out.println("Welcome\t"+UserDetails.name[UserDetails.which_user_logged_in]);
           break;
         }

      }
        if (flag_indicator_of_userlogin==0)
           System.out.println("User Name Or Password Is Incorrect");
         return choice==1;

     }

    public static void logout()
    {
        if (flag_indicator_of_userlogin==1)
        { flag_indicator_of_userlogin=0;
        System.out.println("Successfully Logged Out");
        Library.display_welcome_menu();
        }
    }
}
