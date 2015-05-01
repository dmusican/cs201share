public class BSTSet {
    private static class Node {
        private int data;
        private Node left;
        private Node right;
        
        public Node(int item, Node lchild, Node rchild) {
            data = item;
            left = lchild;
            right = rchild;
        }
    }
    
    // Variables for the tree itself
    private Node root;
    private boolean insertStatus;
    private boolean deleteStatus;
    
    // constructor
    public BSTSet() {
        root = null;
    }
    
    public boolean insert(int item) {
        insertStatus = true;
        root = insert(item, root);
        return insertStatus;
    }

    // Returns a pointer to the updates subtree
    private Node insert(int item, Node localroot) {
        if (localroot == null)
            return new Node(item,null,null);
        else if (item < localroot.data)
            localroot.left = insert(item, localroot.left);
        else if (item > localroot.data)
            localroot.right = insert(item, localroot.right);
        else
            insertStatus = false;
            
        return localroot;
    }



    // This method should be eventually cleaned up
    // or made private or something, it does not
    // guarantee that the tree is correct because
    // it depends on the programmer to get it right,
    // but is good for testing
    public void manuallyBuildTestTree() {
        root = new Node(6,new Node(5,null,null),
               new Node(8,new Node(7,null,null), new Node(11,null,null)));
    }
    
    public void print() {
        print(root);
        System.out.println();
    }
    
    // inorder traversal
    public void print(Node localroot) {
        if (localroot != null) {
            print(localroot.left);
            System.out.print(localroot.data + " ");
            print(localroot.right);
        }
    }
    
    public boolean contains(int item) {
        return contains(item,root);
    }

    private boolean contains(int item, Node localroot) {
        if (localroot == null)
            return false;
        else if (item < localroot.data)
            return contains(item,localroot.left);
        else if (item > localroot.data)
            return contains(item,localroot.right);
        else
            return true;
    }


    public boolean delete(int item) {
        deleteStatus = true;
        root = delete(item,root);
        return deleteStatus;
    }

    // Returns a pointer to the updated subtree
    private Node delete(int item, Node localroot) {
        // item not in subtree
        if (localroot == null) {
            deleteStatus = false;
            return localroot;
        }
        else if (item < localroot.data) {
            localroot.left = delete(item, localroot.left);
            return localroot;
        }
        else if (item > localroot.data) {
            localroot.right = delete(item, localroot.right);
            return localroot;
        } else {
            // The item to delete is right here
            deleteStatus = true;

            // If only one child, then just return a pointer to that
            // child
            if (localroot.left == null)
                return localroot.right;
            else if (localroot.right == null)
                return localroot.left;
            else {
                // Two children. Simpler case is when left child has
                // no right child; then just cut it out
                if (localroot.left.right == null) {
                    localroot.data = localroot.left.data;
                    localroot.left = localroot.left.left;
                    return localroot;
                }
                else {
                    localroot.data = snagLargestChild(localroot.left);
                    return localroot;
                }
            }
        }
    }

    // Finds largest child in a tree, and removes it. Tree is
    // guaranteed to at least have a right child.
    private int snagLargestChild(Node localroot) {
        if (localroot.right.right == null) {
            int largestValue = localroot.right.data;
            localroot.right = localroot.right.left;
            return largestValue;
        } else {
            return snagLargestChild(localroot.right);
        }
    }
        
    public static void main(String[] args) {
        BSTSet set = new BSTSet();
        //set.manuallyBuildTestTree();
        set.insert(7);
        set.insert(4);
        set.insert(11);
        set.insert(6);
        set.print();
        //for (int i=1; i < 15; i++)
        //    System.out.println(i + " " + set.contains(i));
        set.delete(11);
        set.delete(4);
        set.delete(7);
        set.delete(6);
        set.print();
    }
}
