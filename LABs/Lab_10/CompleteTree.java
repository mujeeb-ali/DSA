package Lab_10;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteTree {

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
        public Node completeBinaryTree(Node root,int data) {
            Queue<Node> q1 = new LinkedList<>();
            if (root == null) {
                root = new Node(data);
                return root;
            }
            q1.add(root);
            while (!q1.isEmpty()) {
                Node cur = q1.remove();

                if (cur.left == null) {
                    cur.left = new Node(data);
                    return root;
                } else if (cur.right == null) {
                    cur.right = new Node(data);
                    return root;
                } else {
                    q1.add(cur.left);
                    q1.add(cur.right);
                }

            }
            return root;
        }
        public void preOrder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
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

    public static void main(String[] args) {
            CompleteTree c1 = new CompleteTree();
            Node root = null;
            root = c1.completeBinaryTree(root,1);
            root = c1.completeBinaryTree(root,2);
            root = c1.completeBinaryTree(root,3);
            root = c1.completeBinaryTree(root,4);
            root = c1.completeBinaryTree(root,5);
            root = c1.completeBinaryTree(root,6);
            root = c1.completeBinaryTree(root,7);
            root = c1.completeBinaryTree(root,9);
            c1.preOrder(root);
        System.out.println();
            c1.levelOrder(root);
    }
}
