import java.util.*;

/**
 * class DisplayInformation to display the welcome menu, help page, item table,

 *
 * @author (Jiaying Wu)
 * @version (Version 2.0, 2021.04.13)
 */
public class Menu
{
    // Decalre and create object
    Scanner input = new Scanner(System.in);
    
    // instance variable
    private String choice;

    /**
     * Menu Constructor display the menu and ask for option
     *
     */
    public Menu()
    {
        // initialize option
        choice = "";        
    }
    
    public void setChoice()
    {
        // display menu
        System.out.println("\nWelcome to Super Fantastic Kiosk");
        System.out.println("================================");
        System.out.println("(1) Create a new order");
        System.out.println("(2) Buy more credit");
        System.out.println("(3) Purchase an item");
        System.out.println("(4) What have I ordered so far?");
        System.out.println("(5) Collect my order");
        System.out.println("(6) Display Help");
        System.out.println("(7) Exit Kiosk");
        
        // ask for menu input
        System.out.print("Choose an option between 1 and 7: ");
        String inputChoice = input.nextLine().trim();
        
        // check if the string is empty
        if (!inputChoice.equals(""))
            // validate if the input is degit and between 1 to 7.
            if (inputChoice.length() == 1 && Integer.valueOf(inputChoice) >= 1 &&
                Integer.valueOf(inputChoice) <= 7)
                choice = inputChoice;
        else
            System.out.println("Error: Please enter an integer between 1 to 7 only!");
    }
        
    /**
     * Method getChoice
     *
     * @return the menu choice
     */
    public String getChoice()
    {
        return choice;
    }
    
    /**
     * A method that display the item table for customer.
     * 
     */
    public void displayItemTable()
    {
        System.out.println("\nThe items available for today sale:");
        System.out.println("-----------------------------------");
        System.out.println("(1) Pen, cost $10.");
        System.out.println("(2) Book, cost $20.");
        System.out.println("(3) DVD, cost $30.");
        System.out.println("(4) Mouse, cost $40.");
        System.out.println("(5) Keyboard, cost $50.");
        System.out.println("(6) We will pick a random item for you!");
    }

    /**
     * Method displayHelp display the help page and ground rule
     *
     */
    public void displayHelp()
    {
        System.out.println("\nHelp and Ground Rules");
        System.out.println("------------------------------------------");
        System.out.println("1. Please enter 1 to 7 only in the menu.");
        System.out.println("2. You must create a new order before");
        System.out.println("   selecting (2) to (5) in the menu. ");
        System.out.println("3. Your name can't be blank in new order.");
        System.out.println("4. You must enter a positive integer");
        System.out.println("   when you buy the credit.");
        System.out.println("5. You can not buy a item that cost more");
        System.out.println("   than you credit balance");
        System.out.println("\nEnter anything to exit the Help page.");
        input.nextLine();
    }
}
