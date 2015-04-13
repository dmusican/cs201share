public class LList<E> {  // E is a parameter for the type. "E"=element
    
    private class Node<E> {
        public E item;
        public Node<E> next;
    }

    private Node<E> head;   // instance variable for LList;

    public LList() {    // constructor
        head = null;
    }

    public void addToFront(E data) {
        Node<E> newNode = new Node<E>();
        newNode.item = data;
        newNode.next = head;
        head = newNode;
    }

    public void add(int spot, E data) {
        // insert data at position spot
        // do error checking if spot is negative or greater than length
        Node<E> added = new Node<E>();
        added.item = data;
        if (spot == 0) {
            added.next = head;
            head = added;
        } else {
            Node<E> cur = head;
            for (int i=0; i < spot-1; i++) {
                if (cur != null) {
                    cur = cur.next;
                } else {
                    throw new RuntimeException("List too short");
                }
            }
            added.next = cur.next;
            cur.next = added;
        }
    }

    public void printList() {
        Node cur = head; // shorthand for above
        while (cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
    }
    
}

    
