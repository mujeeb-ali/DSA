package Lab_8;

import java.util.Stack;

public class Stacks_in_LinkedList {
     static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
         }
    }
    static Node head = null;
    public static boolean isEmpty(){

         return head == null;
    }
    public static void push(String data){
        Node newNode  = new Node(data);
        if (isEmpty()){
            head  = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static String pop(){
        if (isEmpty()){
            return "Nothing to pop ";
        }
        String top = head.data;
        head = head.next;
        return top;

    }
    public static String  peek(){
        if (isEmpty()){
            return "Empty !!";
        }
        return head.data;

    }
    public static void printStack(){
        Node temp=head;
        while (temp!= null){
            System.out.print(temp.data+" ");
           temp=temp.next;
        }
    }


    public static void main(String[] args) {
//        Stacks_in_LinkedList s1 = new Stacks_in_LinkedList();
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while (!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
