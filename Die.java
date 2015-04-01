import java.util.*;
public class Die
{
    // instance variables: always private but not today
    private int top;
    private int sides;
    private Random rand;
    
    public Die()
    {
        top = 1;
        sides = 6;
        rand = new Random();
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
