package ybz.sprog.dies;

import java.util.Random;

/**
 * Base Dice Object
 * 
 * @author YBZ
 * @version 0.2.0
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
     * @param maxValue of dice
     * @throws IllegalArgumentException if maxValue <= 1
     * @since 0.2.0
     */
    public Dice(int maxValue) 
    {
        if (maxValue <= 1)
            throw new IllegalArgumentException("value must be a possitive integer greater than 1");
        this.maxValue = maxValue;
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
     * gets max value of dice
     * 
     * @return maxValue field
     * @since 0.2.0
     */
    public int getMaxValue() 
    {
        return this.maxValue;
    };

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
