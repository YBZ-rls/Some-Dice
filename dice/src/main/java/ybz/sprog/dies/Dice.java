package ybz.sprog.dies;

import java.util.Random;

/**
 * Base Dice Object
 * 
 * @author YBZ
 * @version 0.1.0
 */
public abstract class Dice
{
    private final Random RAND;

    // actual values
    private int maxValue;
    private int value;

    /**
     * init will initialize value and Random
     * 
     * @since 0.1.0
     */
    public Dice() 
    {
        this.value = 1;
        this.RAND = new Random();
    }

    /**
     * rolls dice sets value based on maxValue
     * 
     * @since 0.1.0
     */
    public void roll() 
    {
        this.value = RAND.nextInt(this.maxValue)+1;
    }

    /**
     * gets dice value
     * 
     * @return int value
     * @since 0.1.0
     */
    public int getValue()
    {
        return this.value;
    }

    /**
     * toString override
     * 
     * @return String def of object
     * @since 0.1.0
     */
    @Override
    public abstract String toString();
}
