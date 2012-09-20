
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Akriti
 * @author Akriti
 * Date: 16/9/12
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 **/



public class library {

    public static book b1=new book();
    public static int i,choice;


    public static void welcome()
    {
        System.out.println("\t\t\tWELCOME");
        System.out.println("Menu Option");
        System.out.println("1. Book gallery");
        System.out.println("2. Check Details");
        System.out.println("3. Exit");
        System.out.print("Enter ur Choice (number)");
        enterurchoice();
        selectmenu();
    }

    public static void enterurchoice()
    {
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
    }


    public static void selectmenu()
    {

       boolean result;
       switch (choice)
        {
            case 1:
                result=b1.displaybook(choice);
                enterurchoice();
                b1.selectbook();
                break;
            case 2:
                result=details(choice);
                break;
            case 3:
                System.exit(0);
                break;
            default:
            {
                System.out.println("Select a valid option!!");
                welcome();
            }


        }
    }



    public static boolean details(int choice)
    {
        System.out.println("Please talk to Librarian. Thank you.");
        return true;
    }

}