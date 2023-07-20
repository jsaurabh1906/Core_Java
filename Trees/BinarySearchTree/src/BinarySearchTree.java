import java.util.ArrayList;

public class BinarySearchTree {

    //insert Nodes O(N)
    public Node insert(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }
        if( value < root.data){
            root.left = insert(root.left, value);
        }
        else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //print bst O(N)
    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Search key in BST O(N)
    public boolean search(Node root, int searchKey){
        if(root == null){
            return false;
        }
            //searchKey < root.data search in left subtree
        if(searchKey < root.data){
            return search(root.left, searchKey);
        }
            //searchKey > root.data search in right subtree
        else if (searchKey > root.data) {
            return search(root.right, searchKey);
        }
        else { // root.data == searchKey
            return true;
        }
    }

    public Node delete(Node root, int value){
        if (value < root.data ){
            root.left = delete(root.left, value);
        }
        else if (value > root.data){
            root.right = delete(root.right, value);
        }
        else{
            //  case I: No child or Leaf Node
            if (root.left == null && root.right == null){
                return null;
            }
            // case II: only 1 child node
                    //if left is null return right and vice versa
            if (root.left == null){
                return root.right;
            }
            else if (root.right ==null) {
                return root.left;
            }

            // caseIII: two childs
            // replace value with inorder successor : case1: have 1 child case 2: have 0 child
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // inorder successor : it is the leftmost node in right subtree
    // inorder successor will always have either 0 child or 1 child
    private Node inOrderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public void printInRange(Node root, int x, int y){
        if (root == null ) return;

            // if range is from both side of root.data
        if(x <= root.data && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
            // if the complete range is on leftsubtree
        else if (y <= root.data) {
            printInRange(root.left, x, y);
        }
        else { // if the complete range is on rightsubtree
            printInRange(root.right, x, y);
        }
    }

    // all paths from  root to leaf
    public void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root == null) return ;

        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }
        // non-leaf
        else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    private void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "--->");
        }
        System.out.println("null");
    }
}
