package Lab_3;

public class LinkedListWT {

    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size = 0;
    public void addToFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void removeFirst(){
        if (head == null) {
            System.out.println("there is nothing to remove ");
            return;
        }
        head = head.next;

        size--;
    }
    public void addToLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head  = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void removeLast(){
        if (head == null) {
            System.out.println("there is nothing to remove ");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp.next;
        size--;
    }
    int searchElement(int key){
        int i = 0;

        if (head.data == key) {
            return i;
        }
        Node temp = head;
        while (i < size-1 ) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    void PrintLinkedList(){
        if (head == null) {
            System.out.println("LinkedList is Empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListWT ll = new LinkedListWT();
        ll.addToFirst(3);
        ll.addToFirst(2);
        ll.addToFirst(1);
        ll.addToLast(4);
        ll.addToLast(5);
        ll.addToLast(6);
        ll.PrintLinkedList();
        ll.removeFirst();
        ll.PrintLinkedList();
        ll.removeLast();
        ll.PrintLinkedList();
        System.out.println("The element is found at index :"+ll.searchElement(5)+" (-1 means item does not exist in the LinkedList) ");
    }
}

