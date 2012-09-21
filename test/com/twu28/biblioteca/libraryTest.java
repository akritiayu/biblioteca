package com.twu28.biblioteca;
import org.junit.Assert;
import org.junit.Test;

////import static com.twu28.biblioteca.Book.displaybook;
//import static com.twu28.biblioteca.Login.*;


/**
 * Created with IntelliJ IDEA.
 * User: Akriti
 * Date: 20/9/12
 * Time: 1:27 AM
 * To change this template use File | Settings | File Templates.
 **/

/**
 * Created with IntelliJ IDEA.
 * User: Akriti
 * Date: 20/9/12
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class libraryTest {

    @Test
    public void when_user_enter1_displaylogin()
    {
        int choice=1;
        boolean expected=true;
        Assert.assertEquals(expected, Login.check_validity_of_id_and_password(choice));
    }

    @Test
    public void when_user_enter_2_displaybook()
    {
        int choice=2;
        Assert.assertTrue(Book.displaybook(choice));
    }

    @Test
    public void user_selects_bookid_1001()
    {
        boolean expectedresult=true;
        int choice=1001;
        Assert.assertEquals(expectedresult, Book.checkbookavailabilty(choice));
    }

    @Test
    public void user_selects_bookid_1002()
    {
        boolean expectedresult=true;
        int choice=1002;
        Assert.assertEquals(expectedresult, Book.checkbookavailabilty(choice));
    }

    @Test
    public void user_selects_bookid_1003()
    {
        boolean expectedresult=true;
        int choice=1003;
        Assert.assertEquals(expectedresult, Book.checkbookavailabilty(choice));
    }

    @Test
    public void fifteen_movies_or_not()
    {
        int expected=15;
        Assert.assertEquals(expected, Movie.movie_name.length);
        Assert.assertEquals(expected, Movie.movie_director.length);
        Assert.assertEquals(expected, Movie.movie_rating.length);
        Assert.assertEquals(expected, Movie.movie_release_year.length);
    }

    @Test
    public void number_of_userid_and_password_equal()
    {
        Assert.assertEquals(Login.user_name.length, Login.password.length);
    }

    @Test
    public void number_of_userdetails_equalto_numberof_userid()
    {
        int expected= Login.user_name.length;
        Assert.assertEquals(expected, UserDetails.name.length);
        Assert.assertEquals(expected, UserDetails.email_id.length);
        Assert.assertEquals(expected, UserDetails.phone_number.length);

    }

    @Test
    public void movielist_successfully_displayed()
    {
        String expected="Successfully Displayed";
        int choice=3;
        Assert.assertEquals(expected, Movie.movie_menu_display(choice));
    }


}
