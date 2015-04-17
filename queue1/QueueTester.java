public class QueueTester {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(100);
        q.add("martha");
        q.add("ximou");
        q.add("jack");
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add("martin");
        System.out.println(q.remove());
    }
}
