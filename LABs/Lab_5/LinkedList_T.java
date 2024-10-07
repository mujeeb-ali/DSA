package Lab_5;

public class LinkedList_T {
    class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    Node head,tail;
    int size;

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head  = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }

    Node addFirst(int data, Node head1) {
        Node newNode = new Node(data);
        size++;
        if (head1 == null) {
            head1 = newNode;
            return head1;
        }
        newNode.Next = head1;
        head1 = newNode;
        return head1;
    }

    public void addAtMiddle(int data, int index) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        int tempo = 1;
        Node temp = head;
        while (tempo < index - 1) {
            temp = temp.Next;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
    }

    Node addLast(int data, Node head1) {
        Node newNode = new Node(data);
        size++;
        if (head1 == null) {
            head1 = newNode;
            return head1;
        }
        Node temp = head1;
        while (temp.Next != null) {
            temp = temp.Next;
        }
        temp.Next = newNode;
        return head1;
    }

    public void remove() {
        if (head == null) {
            System.out.println("LinkedList is Empty ");
            return;
        }
        Node temp = head;
        while (temp.Next.Next != null) {
            temp = temp.Next;
        }
        temp.Next = temp.Next.Next;
        tail = temp.Next;
        size--;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is Empty ");
            return;
        }
        head = head.Next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is Empty ");
            return;
        }
        Node temp = head;
        while (temp.Next.Next != null) {
            temp = temp.Next;
        }
        temp.Next = temp.Next.Next;
        tail = temp.Next;
        size--;
    }

    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("LinkedList is Empty ");
            return;
        }
        int tempo = 1;
        Node temp = head;
        while (tempo < index - 1) {
            temp = temp.Next;
        }
        temp.Next = temp.Next.Next;
        size--;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList is Empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.Next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList_T l1 = new LinkedList_T();
        l1.add(5);
        l1.addFirst(3);
        l1.addAtMiddle(4,1);
        l1.addLast(1);
        l1.addLast(6);
        l1.addLast(7);
        l1.addLast(8);
        l1.addLast(9);
        l1.printLinkedList();
        l1.remove();
        l1.removeFirst();
        l1.removeLast();
        l1.removeAtIndex(1);
        l1.printLinkedList();
    }
}