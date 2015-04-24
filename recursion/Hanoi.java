public class Hanoi {
    public static void displayMoves(int count, int start, int end, int temp) {
        // base case
        if (count == 1) {
            System.out.println("Move disc #1 from " + start + " to " + end);
        } else {
            displayMoves(count-1, start, temp, end);
            System.out.println("Move disc #" + count + " from " + start + " to " + end);
            displayMoves(count-1, temp, end, start);
        }
    }

    public static void main(String[] args) {
//        displayMoves(1,1,3,2); // 5 discs from spot 1 to spot 3, using spot 2 as temp
        displayMoves(3,1,3,2); // 5 discs from spot 1 to spot 3, using spot 2 as temp
    }
}
