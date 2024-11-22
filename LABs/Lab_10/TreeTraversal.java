package Lab_10;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public Node addNodeRecursive(Node current, int key) {
            if (current == null) {
                return new Node(key);
            }
            if (key < current.data) {
                current.left = addNodeRecursive(current.left, key);
            } else if (key > current.data) {
                current.right = addNodeRecursive(current.right, key);
            }
            return current;
        }
    public void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public void levelOrder(Node root){
            if (root != null){
                Queue<Node> q1 = new LinkedList<>();
                q1.add(root);
                while (!q1.isEmpty()){
                    Node n1 = q1.remove();
                    System.out.print(n1.data+" ");
                    if (n1.left != null){
                    q1.add(n1.left);
                    }
                    if (n1.right != null){
                    q1.add(n1.right);
               }
           }
        }
    }


    public boolean isIdentical(Node root, Node roo1){
        if (root == null && roo1 ==null){
            return true;
        } if (root == null || roo1 ==null){
            return false;
        }
        if (root.data != roo1.data){
            return false;
        }
        return isIdentical(root.left,roo1.left) && isIdentical(root.right,root.right);
    }
    public boolean isSubTree(Node root, Node root1){
            if (root == null && root == null){
                return true;
            } else if (root.data == root1.data) {
                return isIdentical(root,root1);
            } else if (root.data > root1.data) {
               return isSubTree(root.left,root1);
            }else {
              return   isSubTree(root.right,root);
            }
    }

    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();
        Node root = null;
        root = t1.addNodeRecursive(root,5);
        root = t1.addNodeRecursive(root,4);
        root = t1.addNodeRecursive(root,3);
        root = t1.addNodeRecursive(root,1);
        root = t1.addNodeRecursive(root,2);
        root = t1.addNodeRecursive(root,6);
        root = t1.addNodeRecursive(root,7);
        root = t1.addNodeRecursive(root,8);
        Node root1  =  null;
        root1 = t1.addNodeRecursive(root1,3);
        root1 = t1.addNodeRecursive(root1,4);
        root1 = t1.addNodeRecursive(root1,2);
        t1.preOrder(root);
        System.out.println();
        t1.inOrder(root);
        System.out.println();
        t1.postOrder(root);
        System.out.println();
        System.out.println(t1.isIdentical(root,root1));
        System.out.println(t1.isSubTree(root,root1));
        t1.levelOrder(root);
    }
}
