/**
 * Created with IntelliJ IDEA.
 * User: Bhanu
 * Date: 20/9/12
 * Time: 1:27 AM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: Bhanu
 * Date: 20/9/12
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class libraryTest {

    @Test
    public void when_user_enter_1_displaybook()
    {
        boolean expectedresult=true;
        int choice=1;
        Assert.assertEquals(expectedresult, book.displaybook(choice));
    }

    @Test
    public void when_user_enter_2_displaydetails()
    {
        boolean expectedresult=true;
        int choice=2;
        Assert.assertEquals(expectedresult, library.details(choice));
    }

     @Test
    public void user_selects_bookid_1001()
    {
        boolean expectedresult=true;
        int choice=1001;
        Assert.assertEquals(expectedresult,book.checkbookavailabilty(choice));
    }

    @Test
    public void user_selects_bookid_1002()
    {
        boolean expectedresult=true;
        int choice=1002;
        Assert.assertEquals(expectedresult,book.checkbookavailabilty(choice));
    }

    @Test
    public void user_selects_bookid_1003()
    {
        boolean expectedresult=true;
        int choice=1003;
        Assert.assertEquals(expectedresult,book.checkbookavailabilty(choice));
    }

}

