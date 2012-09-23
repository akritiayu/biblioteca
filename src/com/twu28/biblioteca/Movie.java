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
    public static String[] movie_release_year=new String[]{"1973","2000","1902","AAA","Aa","Asas","wsfd","de","443","213","214","24325","3214","23","`12"};
    public static String[] movie_director=new String[] {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL","MM","NN","OO"};
    public static String[] movie_rating=new String[] {"********","*****","*******","*******","**","****","****","N/A","****","***","***","***","*******","*","N/A"};

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


