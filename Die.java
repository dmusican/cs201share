import java.util.*;
public class Die
{
    // class variable
    private static int numDice = 0;

    // instance variables: always private
    private int top;
    private int sides;
    private Random rand;
    
    public Die()
    {
        top = 1;
        sides = 6;
        rand = new Random();
        numDice = numDice + 1;
    }

    public static int getNumDice()
    {
        return numDice;
    }


    public void roll()
    {
        top = rand.nextInt(6)+1;
    }

    public int onTop()
    {
        return top;
    }

    public int getNumSides()
    {
        return sides;
    }
}
