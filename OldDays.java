import java.util.*;
public class OldDays {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("goodbye");
        String a = (String)(list.get(0));
        System.out.println(a);

        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        list2.add("goodbye");
        String b = list2.get(0);
        System.out.println(b);


        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(12);
        list3.add(19);
        int z = list3.get(0);
        System.out.println(z);
    }
}
