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
    displaybook(choice);
    Library.enterurchoice();
    selectbook();

    }

    public static boolean displaybook(int ch)
    {
        System.out.println("Book ID\t\t\t\tBook Name\t\t\t\t\tAuthor");
        for(i=0;i<book_name.length;i++)
        {
            System.out.print("100"+(i+1)+"\t\t\t"+book_name[i]+"\t\t\t"+author[i]+"\n");
        }
        System.out.println("Enter the Book id of ur choice");

        return true;

    }

    public static void selectbook()
    {
        boolean result;
        switch(lib2.choice)
        {
          case 1001:
          case 1002:
          case 1003:
             result=checkbookavailabilty(lib2.choice);
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