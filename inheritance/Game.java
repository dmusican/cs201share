import java.util.*;
class Game
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("(c)ircle or (r)ectangle?");
        String answer = scan.next();
        Shape s;
        if (answer.equals("c")) {
            s = new Circle();
        } else {
            s = new Rectangle();
        }
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}

        
