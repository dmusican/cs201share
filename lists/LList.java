public class LList {
    
    private class Node {
        public String item;
        public Node next;
    }

    private Node head;   // instance variable for LList;

    public LList() {    // constructor
        head = null;
    }

    public void addToFront(String data) {
        Node newNode = new Node();
        newNode.item = data;
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node cur = head; // shorthand for above
        while (cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
    }
    
}

    
