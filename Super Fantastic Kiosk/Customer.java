import java.util.*;

/**
 * class Customer to store and set the customer name, the credit balance, 
 * what items has been purchased and their total costs. It also allow
 * customer to buy item and credit and print customer summary.
 *
 * @author (Jiaying Wu)
 * @version 2.0 (2021.04.13)
 */
public class Customer
{
    // instance variables 
    private String name;
    private int credit;
    private String purchasedItems;
    private int totalCost;

    // Decalre and create object
    Scanner input = new Scanner(System.in);
    Item item = new Item();
    LuckyDipGenerator random = new LuckyDipGenerator();

    /**
     * Customer Constructor initialise the name, credit, purchased items and total cost.
     *
     */
    public Customer()
    {
        // initialise instance variables
        name = "";
        credit = 0;
        purchasedItems = "";
        totalCost = 0;
    }

    /**
     * Method setName to set the new customer name
     *
     */
    public void setName()
    {
        // repeat until name not blank
        while (name.equals(""))
        {
            // ask for name
            System.out.print("\nPlease enter your name: ");
            name = input.nextLine().trim();

            // print error message if name is blank
            if (name.equals(""))
                System.out.println("Error: The name can not be blank!");
        }
    }

    /**
     * Method getName return the customer name
     *
     * @return The customer name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method setCredit will set the start credit
     *
     */
    public void setCredit()
    { 
        // repeat until start credit lager than 0
        while (credit <= 0)
        {
            // ask for start credit
            System.out.print("Please enter the credit you want to buy: ");
            credit = Integer.valueOf(input.nextLine());

            // print error message if start credit is not positive
            if (credit <= 0)
                System.out.println("Error: Please enter a positive integer only!");
        }
    }

    /**
     * Method buyCredit ask the user enter the credit as input and update the credit balance.
     *
     */
    public void buyCredit()
    {
        System.out.println("\nThe amount of credit you want to buy: ");
        int newCredit = Integer.valueOf(input.nextLine());

        // Validate if the input credit larger than 0
        if (newCredit <= 0)
            System.out.println("\nThe amount of credit you want to buy: ");
        else
            credit += Integer.valueOf(newCredit);
        System.out.println("Credit balance: " + credit);
    }

    /**
     * Method buyItem ask customer item option as input and get the name and price from item
     * object, then print the item message.
     *
     */
    public void buyItem()
    {
        System.out.println("\nPick the item between 1 to 6: ");
        String itemChoice = input.nextLine().trim();

        // check if the credit greather than or equal to the item price
        if (item.getItemPrice(itemChoice) <= credit)
        {
            // generate random item number
            if (itemChoice.equals("6"))
            {
                itemChoice = random.getRandomItem();
            }
            // update purchased itemsm, credit and Total cost.
            purchasedItems += itemChoice;
            credit -= item.getItemPrice(itemChoice);
            totalCost += item.getItemPrice(itemChoice);
            // print item information
            System.out.println("You have now purchase: " + item.getItemName(itemChoice));
            System.out.print(", cost: " + item.getItemPrice(itemChoice));
            System.out.println("You new credit balance is: " + credit);
        }    
        // print error if credit less than item price
        else
        {
            System.out.println("Sorry, you do not have enough credit to purchase this item!");
            System.out.println("Credit Balance: $" + item.getItemPrice(itemChoice));
            System.out.println("Item Cost: $" + credit);
        }
    }

    public void customerSummary()
    {
        System.out.println("Customer " + name + "has purchased these items:");
        for (int index = 0; index < purchasedItems.length(); index++)
        {
            System.out.print(" " + item.getItemName(String.valueOf(purchasedItems.charAt(index))));
        }
        System.out.println();
        System.out.println("Total cost: " + totalCost);
        System.out.println("Credit balance: " + credit);
    }
}
