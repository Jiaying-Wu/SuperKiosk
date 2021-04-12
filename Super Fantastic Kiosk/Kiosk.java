
/**
 * class Kiosk will be responsible for displaying the menus, accepting user
 * responses, and performing all the requested operations. It will make use of 
 * one Customer object and one LuckyDipGenerator object.
 * 
 * @author (Jiaying Wu)
 * @version (2021.04.10)
 */
public class Kiosk
{
    /**
     * Kiosk Constructor
     *
     */
    public Kiosk()
    {
        // boolean to indicat if the order has been created or to leave the kiosk
        boolean orderNotCreated = true;
        boolean notLeaveKiosk = true;

        while (notLeaveKiosk)
        {
            // Display menu and aks for option
            Menu menu = new Menu();
            
            // if user enter 1 in menu
            if (menu.getChoice() == 1)
            {
                // Declare and create customer object
                Customer user = new Customer();
                orderNotCreated = false;
            }

            // if user enter 2 to 5
            else if (menu.getChoice() == 2 | menu.getChoice() == 3 | menu.getChoice() == 4 | menu.getChoice() == 5)
            {
                // if 2-5 enter before 1
                if (orderNotCreated)
                    System.out.println("\nError: Please create a new order first");

                // if the order has been created
                else
                {
                    // if user enter 2 in the menu
                    if (menu.getChoice() == 2)
                    {

                    }

                    // if user enter 3 in the menu
                    else if (menu.getChoice() == 3)
                    {

                    }

                    // if user enter 4 in the menu
                    else if (menu.getChoice() == 4)
                    {

                    }

                    // if user enter 5 in the menu
                    else
                    {

                    }
                }
            }
            // if user enter 6 in the menu
            else if (menu.getChoice() == 6)
            {

            }

            // if user enter 7, break the while loop and end of the program
            else if (menu.getChoice() == 7)
            {
                notLeaveKiosk = false;
                System.out.println("\nThank you for visiting the kiosk!");
            }

            // Print Error message if the menu input not between 1 to 7
            else
                System.out.println("\nError: Please enter a number between 1 to 7!");
        }
    }
}
