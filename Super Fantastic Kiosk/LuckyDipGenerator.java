import java.util.Random;

/**
 * class LuckyDipGenerator to generate the random number for item option.
 *
 * @author (Jiaying Wu)
 * @version 2.0 (2021.04.13)
 */
public class LuckyDipGenerator
{
    // instance variables - replace the example below with your own
    private String randomItem;

    /**
     * Constructor for objects of class LuckyDipGenerator
     */
    public LuckyDipGenerator()
    {
    }

    
    /**
     * Method getRandomItem
     *
     * @return The return value
     */
    public String getRandomItem()
    {
        Random random = new Random();
        String randomItem = "";
        // add 1 since the original random range is 0 to 4.
        return randomItem + (random.nextInt(5) + 1);
    }
}
