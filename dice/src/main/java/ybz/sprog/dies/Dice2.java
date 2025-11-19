package ybz.sprog.dies;

import java.util.List;

public class Dice2 extends Dice
{
    private DiceArt art;

    /**
     * empty constructor
     * 
     * @since 0.2.0
     */
    public Dice2()
    {
        super(2);
        this.art = DiceArt.DICE2;
    }

    /**
     * toString override
     * 
     * @since 0.2.0
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        List<String> lines = this.art.getLines();

        builder.append(String.format("%s Sided Dice\n",super.getMaxValue()));
        for (int t = 0; t < lines.size()/2; t++)
            builder.append(String.format("%s\n", lines.get(t)));
        builder.append(String.format("%s\n", super.getValue()));
        for (int t = lines.size()/2; t < lines.size(); t++)
            builder.append(String.format("%s\n", lines.get(t)));

        return builder.toString();
    }
}
