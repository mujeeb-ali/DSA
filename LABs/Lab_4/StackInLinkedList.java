package Lab_4;

public class StackInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    public static boolean isEmpty(){

        return head == null;
    }
    public static void push(int data){
        Node newNode  = new Node(data);
        if (isEmpty()){
            head  = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;

    }
    public static int  peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;

    }


    public static void main(String[] args) {
        StackInLinkedList s1 = new StackInLinkedList();
//        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while (!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }

}
