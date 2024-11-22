package Lab_9;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    public void addNode(int key) {
        root = addNodeRecursive(root, key);
    }
    public Node addNodeRecursive(Node current, int data) {

        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addNodeRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addNodeRecursive(current.right, data);
        }
        return current;
    }
    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public  int max(){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return maxNumFind(root);

    }
    public int maxNumFind(Node root){
        if (root.right == null){
            return root.data;
        }
        return maxNumFind(root.right);
    }
    public  int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return minNumFind(root);
    }
    public int minNumFind(Node root){
        if (root.left == null){
            return root.data;
        }
        return minNumFind(root.left);
    }
    public boolean searchHelp(Node root,int key){
        if (root == null){
            return false;
        }else if (root.data == key){
            return true;
        }else if (root.data > key){
            return searchHelp(root.left,key);
        }else {
            return searchHelp(root.right,key);
        }
    }
    public boolean search(int key){
       return searchHelp(root,key);
    }
    public int count(Node root){
        if (root == null){
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        return left+right+1;
    }
    public int height(Node root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean balancedTree(Node root){
        if (root == null){
            return false;
        }
        int left = height(root.left);
        int right = height(root.right);
        if ((left - right) == 1 || (left - right) == -1 || (left - right) == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
        Node root = null;
        root = b1.addNodeRecursive(root,5);
        root = b1.addNodeRecursive(root,4);
        root = b1.addNodeRecursive(root,3);
        root = b1.addNodeRecursive(root,2);
        root = b1.addNodeRecursive(root,6);
        root = b1.addNodeRecursive(root,7);
        root = b1.addNodeRecursive(root,8);
        preOrder(root);
        System.out.println();
        System.out.println(b1.search(7));
        int temp = b1.max();
        System.out.println(temp);
        System.out.println(b1.min());
        System.out.println(b1.balancedTree(root));
    }
}
