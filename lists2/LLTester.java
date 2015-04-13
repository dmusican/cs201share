public class LLTester {
    public static void main(String[] args) {
        LList<String> list = new LList<String>();
        list.addToFront("c");
        list.addToFront("b");
        list.addToFront("a");
        list.add(2,"d");
        list.add(0,"e");
        list.add(12,"f");
        list.printList();

        LList<Integer> list2 = new LList<Integer>();
        list2.addToFront(3);
        list2.addToFront(12);
        list2.printList();


    }
}
