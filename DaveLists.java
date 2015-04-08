import java.util.*;
public class DaveLists {
    public static void main(String[] args) {
        // int isn't a class, so use wrapper class Integer
        List<Integer> list = new LinkedList<Integer>();
        //for (int i=0; i < 1000000; i++) {
        for (int i=0; i < 10; i++) {
            list.add(i); // insert
        }

        //for (int i=0; i < 10; i++) {
        //    System.out.println(list.get(i));
        //}
        for (Integer number : list) {
            System.out.println(number);
        }

    }
}
        
        
