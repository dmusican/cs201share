public class BinSearchGen {
    // return position of item found, assuming list is sorted
    // generic method
    public static <E> int search(E[] items, Comparable<E> target, int first, int last)
    {
        // return position of item target if found
        // otherwise return a -1
        int mid = (first + last)/2;
        if (first > last) {
            return -1;
        } else if (items[mid].equals(target)) {
            return mid;
        } else if (target.compareTo(items[mid]) < 0) {
            return search(items,target,first,mid-1);
        } else {  // case where items[mid] < target
            return search(items,target,mid+1,last);
        }
    }

    public static void main(String[] args) {
        String[] stuff = {"apple", "car", "ice cream", "mildew", "xylophone"};
        System.out.println(search(stuff,"ice crrrrrream",0,stuff.length-1));
        System.out.println(search(stuff,"ice cream",0,stuff.length-1));
    }
}
