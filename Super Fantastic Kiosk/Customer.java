import java.util.*;

/**
 * class Customer to store and set the customer name, the credit balance, 
 * what items has been purchased and their total costs.
 *
 * @author (Jiaying Wu)
 * @version (2021.04.10)
 */
public class Customer
{
    // instance variables 
    private String name;
    private int creditBalance;
    private String purchasedItems;
    private int totalCost;

    /**
     * Customer Constructor
     *
     * @param newName A parameter
     * @param startCredit A parameter
     */
    public Customer()
    {
        // Decalre and create object
        Scanner input = new Scanner(System.in);

        // repeat until name not empty
        name = "";
        while (name == "")
        {
            // ask for name
            System.out.print("\nPlease enter your name: ");
            name = input.nextLine();

            // print error message if name is blank
            if (name == "")
                System.out.println("Error: The name can not be blank!");

        }

        // repeat until start credit lager than 0
        creditBalance = 0;
        while (creditBalance <= 0)
        {
            // ask for start credit
            System.out.print("Please enter the credit you want to buy: ");
            creditBalance = input.nextInt();

            // print error message if start credit is not positive
            if (creditBalance <= 0)
                System.out.println("Error: Please enter a positive integer only!");
        }

        // initialise instance variables
        purchasedItems = "";
        totalCost = 0;
    }

    /**
     * Method getName
     *
     * @return The return value
     */
    public String getName()
    {        
        return name;
    }

    /**
     * Method getCreditBalance
     *
     * @return The return value
     */
    public int getCreditBalance()
    {        
        return creditBalance;
    }

    /**
     * Method getPurchasedItems
     *
     * @return The return value
     */
    public String getPurchasedItems()
    {        
        return purchasedItems;
    }

    /**
     * Method getTotalCost
     *
     * @return The return value
     */
    public int getTotalCost()
    {        
        return totalCost;
    }

    /**
     * Method setCreditBalance
     *
     * @param newCredit A parameter
     */
    public void setCreditBalance(int newCredit)
    {
        creditBalance += newCredit;
    }

    /**
     * Method setPurchasedItems
     *
     * @param newItem A parameter
     */
    public void setPurchasedItems(String newItem)
    {
        purchasedItems += newItem;
    }

    /**
     * Method setTotalCost
     *
     * @param newCost A parameter
     * @return The return value
     */
    public void setTotalCost(int newCost)
    {
        totalCost += newCost;
    }
}
