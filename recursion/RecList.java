public class RecList<E> {
    private E data;
    private RecList<E> next;

    public RecList(E data, RecList<E> next) {
        this.data = data;
        this.next = next;
    }

    public RecList() {
        data = null;
        next = null;
    }

    // Every list always has a "dummy" node that is all null. Even the empty
    // list.
    public void add(int pos, E item) {
        if (pos < 0) {
            throw new RuntimeException("Negative postion BADDD!!!");
        }

        // Base case where list is empty
        if (data == null) {
            if (pos == 0 && item != null) {
                data = item;
                next = new RecList<E>(null,null);
            } else {
                throw new RuntimeException("Improper insert.");
            }
            
        } else if (pos == 0) {
            // non-empty list
            RecList<E> addition = new RecList<E>(data,next);
            data = item;
            next = addition;
        } else {
            // not at front -- recursive call
            next.add(pos-1,item);
        }
    }
            

    public void printIt() {
        if (data == null) {
            return;
        } else {
            System.out.println(data);
            next.printIt();
        }
    }

    public static void main(String[] args) {
        RecList<String> words = new RecList<String>();
        words.add(0,"hello");
        words.add(0,"there");
        words.add(1,"you");
        words.add(2,"me");
        words.printIt();
    }
}
