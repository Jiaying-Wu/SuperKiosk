
/**
 * class Kiosk will be responsible for displaying the menus, accepting user
 * responses, and performing all the requested operations. It will make use of 
 * one Customer object and one Menu object.
 * 
 * @author (Jiaying Wu)
 * @version 2.0 (2021.04.13)
 */
public class Kiosk
{
    /**
     * Kiosk Constructor
     *
     */
    public Kiosk()
    {
        // boolean to indicat if to leave the kiosk
        boolean notLeaveKiosk = true;

        // declare and create customer object
        Customer customer = new Customer();
        Menu menu = new Menu();

        // loop until customer finish 
        while (notLeaveKiosk)
        {
            // Display menu and aks for choice
            menu.setChoice();

            // if user enter 1 in menu
            if (menu.getChoice().equals("1"))
            {
                // Set the name and start credit for new customer
                customer.setName();
                customer.setCredit();

            }

            // if user enter 2 to 5
            else if (menu.getChoice().equals("2") | menu.getChoice().equals("3") | 
            menu.getChoice().equals("4") | menu.getChoice().equals("5"))
            {
                // if 2-5 enter before 1 the customer name should be ""
                if (customer.getName().equals(""))
                    System.out.println("\nError: Please create a new order first");

                // if the order has been created
                else
                {
                    // if user enter 2 in the menu, buy more credit
                    if (menu.getChoice().equals("2"))
                    {
                        customer.buyCredit();
                    }

                    // if user enter 3 in the menu, purchase an item
                    else if (menu.getChoice().equals("3"))
                    {
                        menu.displayItemTable();
                        customer.buyItem();
                    }

                    // if user enter 4 in the menu, customer summary
                    else if (menu.getChoice().equals("4"))
                    {
                        customer.customerSummary();                        
                    }

                    // if user enter 5 in the menu, print the summary and initialize customer.
                    else
                    {
                        customer.customerSummary();   
                        System.out.println("Thank you for shopping with us. Please collect");
                        System.out.println("your items and credit in the reception.");

                        // initialize for new customer 
                        customer = new Customer();
                    }
                }
            }
            // if user enter 6 in the menu, display help page
            else if (menu.getChoice().equals("6"))
            {
                menu.displayHelp();
            }

            // if user enter 7, break the while loop and end of the program
            else if (menu.getChoice().equals("7"))
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
