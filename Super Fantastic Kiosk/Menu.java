import java.util.*;

/**
 * class DisplayInformation to display the welcome menu, help page, item table,

 *
 * @author (Jiaying Wu)
 * @version (2021.04.10)
 */
public class Menu
{
    // Decalre and create object
    Scanner input = new Scanner(System.in);
    
    // instance variable
    private int choice;

    /**
     * Menu Constructor
     *
     */
    public Menu()
    {
        System.out.println("\nWelcome to Super Fantastic Kiosk");
        System.out.println("================================");
        System.out.println("(1) Create A New Order");
        System.out.println("(2) Buy More Credit");
        System.out.println("(3) Purchase An Item");
        System.out.println("(4) What Have I Ordered So Far?");
        System.out.println("(5) Collect My Order");
        System.out.println("(6) Display Help");
        System.out.println("(7) Exit Kiosk");
        
        // ask for menu input
        System.out.print("Choose an option between 1 and 7: ");
        choice = input.nextInt();
    }
    
    /**
     * Method getOption
     *
     */
    public int getChoice()
    {
        return choice;
    }
    
    /**
     * A method that display the item table for customer.
     * 
     */
    public void displayItemTable()
    {
        System.out.println("The items available for today sale:");
        System.out.println("-----------------------------------");
        System.out.println("(1) Pen, cost $10.");
        System.out.println("(2) Book, cost $20.");
        System.out.println("(3) DVD, cost $30.");
        System.out.println("(4) Mouse, cost $40.");
        System.out.println("(5) Keyboard, cost $50.");
        System.out.println("(6) We will pick a random item for you!");
    }

    public void displayHelp()
    {
    }
}
