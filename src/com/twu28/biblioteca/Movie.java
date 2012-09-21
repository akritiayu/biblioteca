package com.twu28.biblioteca;


/**
 * Created with IntelliJ IDEA.
 * User: Bhanu
 * Date: 21/9/12
 * Time: 9:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {

    public static String[] movie_name=new String[] {"Sholay","3 Idiots","Gajini","Agent Vinod","Agneepath","Cocktail","Barfi","Houseful 2","Kahaani","Avengers","","","","",""};
    public static String[] movie_release_year=new String[]{"","","","","","","","","","","","","","",""};
    public static String[] movie_director=new String[] {"","","","","","","","","","","","","","",""};
    public static String[] movie_rating=new String[] {"","","","","","","","","","","","","","",""};

    public static String movie_menu_display(int choice)
    {
        int i;
        System.out.println("Movie\t\t\t\tYear\t\t\t\tDirector\t\t\t\tRating");
        for (i=0;i<15;i++)
        {
         System.out.println(movie_name[i]+"\t\t\t"+movie_release_year[i]+"\t\t\t"+movie_director[i]+"\t\t\t"+movie_rating[i]);
        }
        return ("Successfully Displayed");
    }


}


