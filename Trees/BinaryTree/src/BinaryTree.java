import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int index = -1;
    public Node buildTree(int[] nodes){
        index++;

        // if element at index is -1 means the node is null
        if (nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    //preorder traversal   O(n)
    public void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //inorder traversal    O(n)
    public void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //postorder traversal    O(n)
    public void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    //level order traversal   O(n)
    public void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+ " ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    // count no.of Nodes   O(n)
    public int countOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodesCount = countOfNodes(root.left);
        int rightNodesCount = countOfNodes(root.right);

        return leftNodesCount + rightNodesCount + 1;
    }

    // sum of nodes O(n)
    public int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodesSum = sumOfNodes(root.left);
        int rightNodesSum = sumOfNodes(root.right);

        return leftNodesSum+ rightNodesSum + root.data;
    }

    public int height(Node root){
        if (root == null ) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight , rightHeight) + 1;
    }

    // diameter of tree : number of nodes in the longest path between two nodes
    // Approach1 : O(N^2)
    public int diameter(Node root){
        if (root == null) return 0;

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    //diameter of tree Approach2 O(N)

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public TreeInfo diameter2(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam1, Math.max(diam2,diam3));

        return new TreeInfo(myHeight, myDiam);
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(Node root,Node subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
}
