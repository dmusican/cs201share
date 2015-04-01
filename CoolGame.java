public class CoolGame
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        System.out.println(die1.getNumSides());
        die1.roll();
        int value = die1.onTop();
        System.out.println("value = " + value);
    }
}
