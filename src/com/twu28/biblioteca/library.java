package com.twu28.biblioteca;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Akriti
 * @author Akriti
 * Date: 16/9/12
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 **/



public class Library {

   public static int i,choice;



    public static void display_welcome_menu()
    {
        System.out.println("Menu Option");
        if (Login.flag_indicator_of_userlogin==1)
        System.out.println("1. Login As Different User");
        else
        System.out.println("1. Login");
        System.out.println("2. Book Gllery");
        System.out.println("3. Movie Gallery");
        System.out.println("4. Check Details");
        System.out.println("5. Exit");
        if(Login.flag_indicator_of_userlogin==1)
        System.out.println("6. Logout");
        System.out.print("Enter ur Choice (number)");
        enterurchoice();
        selectmenu();
    }



    public static void selectmenu()
    {

       boolean result;
       String result1;
       switch (choice)
        {
            case 1:
                new Login(choice);
                break;
            case 2:
               new  Book(choice);
               break;
            case 3:
                result1=Movie.movie_menu_display(choice);
                break;
            case 4:
                result=UserDetails.details(choice);
                break;
            case 5:
                System.exit(0);
                break;
            case 6:
                 if(Login.flag_indicator_of_userlogin==1)
                 {
                     Login.logout();
                     break;
                 }
            default:
            {
                System.out.println("Select a valid option!!");
                display_welcome_menu();
            }


        }
    }



        public static void enterurchoice()
        {
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
        }
    }