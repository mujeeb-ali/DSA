package Lab_7;

public class PrintingLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
  static Node head;
    public Node add(int data,Node head1){
        Node newNode = new Node(data);
        if (head1 == null){
            head1 = newNode;
            return head1;
        }
        newNode.next = head1;
        head1 = newNode;
        return head1;
    }
    public void printLinkedList(Node head){
        if (head == null){
            System.out.println("Linkedlist is Empty !");
            return;
        }
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public void printllURec(Node head){
        if (head == null){
            return;
        }else {
            System.out.print(head.data+" ");
            printllURec(head.next);
        }
    }
    public void printllURecInRev(Node head){
        if (head == null){
            return;
        }else {
            printllURecInRev(head.next);
            System.out.print(head.data+" ");
        }
    }

    public static void main(String[] args) {
        Node head = null;
        PrintingLinkedList l1 = new PrintingLinkedList();
       head = l1.add(5,head);
       head = l1.add(4,head);
       head = l1.add(3,head);
       head = l1.add(2,head);
       head = l1.add(1,head);
        System.out.print("LinkedList using Iterative Approach : ");
       l1.printLinkedList(head);
       System.out.println();
        System.out.print("LinkedList using Recursion Approach : ");
       l1.printllURec(head);
        System.out.println();
       System.out.print("Reversed LinkedList using Recursion Approach : ");
       l1.printllURecInRev(head);
    }
}
