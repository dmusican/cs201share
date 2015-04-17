class ArrayQueue<E> {
    
    private E[] items;
    private int count;
    
    public ArrayQueue(int capacity) {
        items = new E[capacity];
        count = 0;
    }

    public void add(E data) {  // adds to queue by dropping it at the end
        if (count == items.length) {    // check capacity
            throw new RuntimeException("Queue is full, stop it!");
        }
        items[count] = data;
        count++;
    }

    public E remove() {
        if (count == 0) {
            throw new RuntimeException("That hurt: I'm empty :(  ");
        }
        E result = items[0];
        for (int i=0; i < count-1; i++) {
            items[i] = items[i+1];
        }
        count--;
        return result;
    }
        

}
