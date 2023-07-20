import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] values = {8,5,3,6,10,11,14};
        int[] values2 = {8,7,5,9,1,2,3,4,10,12,19,6};
        Node root = null;
        Random rand = new Random();
        int max=500,min=1;

        BinarySearchTree bst = new BinarySearchTree();

        //insert

        for(int i = 0; i < values.length; i++) {
            root = bst.insert(root,values[i]);
            //root =bst.insert(root,(rand.nextInt(max - min + 1) + min) );
        }

        bst.inOrder(root);
        System.out.println();

        // Search key in BST

        int valueToSearch = 5;
        if(bst.search(root, valueToSearch))
            System.out.println("The given key " + valueToSearch + " is present in BST!!!");
        else
            System.out.println("The given key" + valueToSearch + " is not present in BST!!!");

        // delete a node

        int valueToDelete = 5;
        //bst.delete(root, valueToDelete);

        System.out.println("After deleting the Node, BST: ");
        bst.inOrder(root);
        System.out.println();

        // print all values between range
        int x = 4;
        int y = 10;
        System.out.println("The Elements between " + x + " and "+ y +": ");
        bst.printInRange(root, x, y);
        System.out.println();

        // all paths from  root to leaf

        bst.printRoot2Leaf(root, new ArrayList<>());
    }
}