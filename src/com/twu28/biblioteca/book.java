package com.twu28.biblioteca;
import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: Akriti
 * @author Akriti
 * Date: 16/9/12
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    public static int choice;
    public int id[];
    public static String[] book_name=new String[] {"Head First Java","Complete reference Java","The Agile Samurai"};
    public static String[] author=new String[]{"Kathy Sierra","Herbert Schildt","xustah"};
    public static int[] numberofbooks={6,0,6};
    public static int i;
    public static Library lib2=new Library();

    public Book(int choice)
    {
    boolean result=displaybook(choice);
    display_choice_if_login();

    }

    public static boolean displaybook(int ch)
    {
        System.out.println("Book ID\t\t\t\tBook Name\t\t\t\t\tAuthor");
        for(i=0;i<book_name.length;i++)
        {
            System.out.print("100"+(i+1)+"\t\t\t"+book_name[i]+"\t\t\t"+author[i]+"\n");
        }
        return ch==2;

    }

    public static void display_choice_if_login()
    {
        if (Login.flag_indicator_of_userlogin==1)
        {
            System.out.println("Enter 1 to reserve a book");
            System.out.println("Enter 2 to go back to Previous Menu");
            choice=Library.enterurchoice();
            reserve_a_book_or_go_to_previousmenu(choice);
        }
        else
        {
            System.out.println("You are not logged in. Login to reserve a book");
            Library.display_welcome_menu();
        }
    }

    public static void reserve_a_book_or_go_to_previousmenu(int choice)
    {
        if(choice==1)
        {
            System.out.println("Enter the Book id of ur choice");
            choice=Library.enterurchoice();
            selectbook(choice);

        }
        else  if (choice==2)
            Library.display_welcome_menu();
        else
        {
            System.out.println("Enter Correct Input");
            display_choice_if_login();
        }
    }

    public static void selectbook(int choice)
    {
        boolean result;
        switch(choice)
        {
          case 1001:
          case 1002:
          case 1003:
             result=checkbookavailabilty(choice);
             Library.display_welcome_menu();
             break;
          default:
            {
                System.out.println("Select a valid Book Id");
                new Book(2);
            }
        }
    }

    public static boolean checkbookavailabilty(int choice)
     {
         int i=choice-1001;
         Boolean indiactor=false;

        if (numberofbooks[i]>0)
        {
            indiactor=true;
        }
        if (indiactor==true)
        {
            System.out.println("Thank You! Enjoy the Book");
        }
        else
        {
            System.out.println("Sorry we don't have that Book yet");
        }
         return true;
    }
}