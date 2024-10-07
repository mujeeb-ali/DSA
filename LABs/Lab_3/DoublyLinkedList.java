package Lab_3;

import java.security.PublicKey;

public class DoublyLinkedList {
    class Node{
        String name;
        Node prev,next;
        Node(String name){
            this.name = name;
            this.next = null;
            this.prev = null;
        }

        Node(Node node){
            this.name = node.name;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void insertAtBeginning(String name){
        Node newNode = new Node(name);
        if (head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtBeginning(Node node){
        Node newNode = new Node(node);
        if (head == null){
            head = tail =  newNode;
            return;
        }
        head.prev = newNode;
        head = newNode;
    }
    public Node insertAtBeginning(String name,Node head1){
        Node newNode = new Node(name);
        if (head1 == null){
            head1 = tail = newNode;
            return head1;
        }

        newNode.next = head1;
        head1.prev = newNode;
        head1 = newNode;
        return head1;
    }
    public void insertAtEnd(String name){
        Node newNode = new Node(name);
        if (head == null){
            head = tail =  newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
        tail = newNode;
    }
    public void insertAtEnd(Node node){
        Node newNode = new Node(node);
        if (head == null){
            head = tail = newNode;
            return;
        }
        Node temp = node;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
        tail = newNode;
    }
    public Node insertAtEnd(String name,Node head1){
        Node newNode = new Node(name);
        if (head1 == null){
            head1 = newNode;
            return head1;
        }
        else{
            Node temp = head1;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
        }
        return head1;
    }
    public void printDoublyLinkedList(){
        if (head == null){
            System.out.println("LinkdList Is Empty ");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.name +"<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void printDoublyLinkedList(Node head2){
        if (head2 == null){
            System.out.println("LinkdList Is Empty ");
        }
        Node temp = head2;
        while (temp != null){
            System.out.print(temp.name +"<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public boolean checkCycle(Node head1){
        Node temp1 = head1;
        Node temp2 = head1.next;
        while (temp1 != temp2){
            if (temp1 == null || temp2.next == null) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return true;

    }
    public void makeCircular(){
        if (head != null && tail == null ){
            tail.next = head;
            head.prev = null;
        }
    }
    public Node insertAfterName(Node node,String name){
        Node temp = node;
        while (temp != null){
            if (temp.next.name == name){
                temp.next.next = node;

            }
        }
        return node;
    }

    public static void main(String[] args) {
        DoublyLinkedList d1 = new DoublyLinkedList();
        d1.insertAtBeginning("Mujeeb");
        d1.insertAtBeginning("Zegum");
        d1.insertAtEnd("Abbas");
        d1.insertAtEnd("Mujeeb");
        d1.printDoublyLinkedList();
        Node head = null;
        head = d1.insertAtBeginning("Zegum",head);
        head = d1.insertAtBeginning("Ali",head);
        head = d1.insertAtEnd("Mujeeb",head);
        head = d1.insertAtEnd("Ali",head);
        d1.insertAtBeginning(head);
        d1.printDoublyLinkedList(head);
        System.out.println(d1.checkCycle(head));
        d1.insertAtEnd(head);
        d1.insertAtEnd(head);
        d1.printDoublyLinkedList(head);
        d1.insertAfterName(head,"Zegum");
        d1.printDoublyLinkedList(head);



    }
}
