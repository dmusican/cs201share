import java.util.*;

public class GuessingGame
{
    public static void main(String[] args)
    {
	Random rand = new Random();
	int number = rand.nextInt(100)+1;

	// Get guesses from user
	// System.in means keyboard
	System.out.print("Give me number! ");
	Scanner scan = new Scanner(System.in);
	int guess = scan.nextInt();
	System.out.println(guess);

	while (guess != number)
	{
	    if (guess < number)
	    {
		System.out.println("too small");
	    }
	    else
	    {
		System.out.println("too big");
	    }
	    guess = scan.nextInt();
	    System.out.println(guess);
	}
    }
}


