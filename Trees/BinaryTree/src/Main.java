public class Main {
    public static void main(String[] args) {

        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root-Data: "+ root.data);

        System.out.print("PreOder: ");
        tree.preOrder(root);

        System.out.println();       

        System.out.print("Inorder: ");
        tree.inOrder(root);

        System.out.println();

        System.out.print("PostOder: ");
        tree.postOrder(root);

        System.out.println();

        System.out.println("LevelOrder: ");
        tree.levelOrder(root);

        System.out.println("Count of Nodes: "+ tree.countOfNodes(root));

        System.out.println("Sum of Nodes: "+ tree.sumOfNodes(root));

        System.out.println("Height of Tree: " + tree.height(root));

        System.out.println("Diameter of Tree: "+ tree.diameter(root));

        System.out.println("Diameter of Tree: "+ tree.diameter2(root).diam);


    }
}