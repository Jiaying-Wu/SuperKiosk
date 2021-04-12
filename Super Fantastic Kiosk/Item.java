import java.util.*;

/**
 * class Item to store and return the item name and price.
 *
 * @author (Jiaying Wu)
 * @version 2.0 (2021.04.13)
 */
public class Item
{
    // declare and crete the hash map to store the name and price pair
    HashMap<String, String> nameMap = new HashMap<>();
    HashMap<String, Integer> priceMap = new HashMap<>();

    /**
     * Constructor for objects of class Item to store the item name and price.
     */
    public Item()
    {
        // pair of item option and name
        nameMap.put("1", "Pen");
        nameMap.put("2", "Book");
        nameMap.put("3", "DVD");
        nameMap.put("4", "Mouse");
        nameMap.put("5", "Keyboard");
        
        // pair of item option and price
        priceMap.put("1", 10);
        priceMap.put("2", 20);
        priceMap.put("3", 30);
        priceMap.put("4", 40);
        priceMap.put("5", 50);
    }

    /**
     * Method getItemName return item name base on item option
     *
     * @param itemOption A parameter that indicate the item option
     * @return The item name
     */
    public String getItemName(String itemOption)
    {
        return nameMap.get(itemOption);
    }
    
    /**
     * Method getItemPrice item name price on item option
     *
     * @param itemOption A parameter that indicate the item option
     * @return The item price
     */
    public int getItemPrice(String itemOption)
    {
        return priceMap.get(itemOption);
    }
}
