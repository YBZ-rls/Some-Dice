package ybz.sprog.dies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * enum for dice printing
 * 
 * @author YBZ
 * @version 0.1.0
 */
public enum DiceArt
{
    // will add actual arts soon
    DICE2("d2", new String[]{

    }),
    DICE4("d4",new String[]{
        
    }),
    DICE6("d6",new String[]{
        
    }),
    DICE8("d8",new String[]{
        
    }),
    DICE10("d10",new String[]{
        
    }),
    DICE12("d12",new String[]{
        
    }),
    DICE20("d20",new String[]{
        
    }),
    DICE100("d100",new String[]{
        
    });

    private final List<String> LINES;
    private final String NAME;

    private DiceArt(String name, String[] lines)
    {
        this.NAME = name;
        this.LINES = new ArrayList<>();
        this.LINES.addAll(Arrays.asList(lines));
    }

    /**
     * getter for name
     * 
     * @return name field
     * @since 0.1.0
     */
    public String getName() {return this.NAME;}

    /**
     * getter for printable lines
     * 
     * @return lines field
     * @since 0.1.0
     */
    public List<String> getLines() {return new ArrayList<>(this.LINES);}
}
