package Lab_3;


public class CircularLinkedList {
    public class Node {
        int data;
        Node Next;

        Node(int data){
            this.data = data;
            this.Next = null;

        }
    }
    Node head;
    Node tail;
    public void addToFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            head.Next = head;
            return;
        }
        newNode.Next = head;
        head = newNode;
        tail.Next = head;

    }
    public void addToLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            head.Next = head;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
        tail.Next = head;

    }
    public void remove() {
        if (head == null) {
            System.out.println("There is nothing to delete");
        }
        else if (head.Next == head) {
            head = tail = null;
        } else {
            head = head.Next;
            tail.Next = head;
        }
    }
    public void printLinkedList(){
        Node temp = head;
        do {
            System.out.print(temp.data +"-->");
            temp = temp.Next;

        } while (temp != head );
    }


    public static void main(String[] args) {
        CircularLinkedList c1 = new CircularLinkedList();
        c1.addToFirst(3);
        c1.addToFirst(2);
        c1.addToFirst(1);
        c1.addToLast(4);
        c1.addToLast(5);
        c1.printLinkedList();
        System.out.println();
        c1.remove();
        c1.printLinkedList();
    }
}

