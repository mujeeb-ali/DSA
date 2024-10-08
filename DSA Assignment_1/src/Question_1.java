public class Question_1 {

    public  class Node {
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            this.Next =null;
        }
    }
    static int size = 0;
    public static  Node head;
    public static  Node tail;
    void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if (head == null){
           head = newNode;
           return;
        }
        newNode.Next = head;
        head = newNode;
    }
    void addLast(int data){

        size++;
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        Node temp = head;
        while (temp.Next!= null){
            temp = temp.Next;
        }
        temp.Next = newNode;
    }

    void Print_Linked_List(){
        if (head == null){
            System.out.println("Linked list is empty");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.Next;
        }
        System.out.println("Null");


    }

     boolean isEmpty(){
        return head == null;
    }
    int nthFromLast(int index){
        if (head == null){
            System.out.println("List_Is_Empty ");
            return -1;
        }
        Node temp = head;
        int i = 0;
        while ( i < size - index){
            temp = temp.Next;
            i++;
        }
        int tempo = temp.data;
        return tempo;

    }
    void ReverseLinkedList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    void removeDuplicate(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        else if (size == 1){
            System.out.println("there is nothing to compare");
            return;
        }
        Node cr = head;
        while (cr != null){
            Node temp = cr;
            while (temp.Next != null){
                if (temp.Next.data == cr.data){
                    temp.Next = temp.Next.Next;
                }
                else {
                    temp = temp.Next;
                }
            }
            cr = cr.Next;
        }
    }

    public static void main(String[] args) {
        Question_1 q1 = new Question_1();
        q1.addFirst(3);
        q1.addFirst(2);
        q1.addFirst(6);
        System.out.println("Linked List after adding 3 items from first");
        q1.Print_Linked_List();
        q1.addLast(6);
        q1.addLast(9);
        q1.addLast(6);
        System.out.println("Linked List after adding 3 items from last");
        q1.Print_Linked_List();
        System.out.println("Printing nth node from last");
        System.out.println(q1.nthFromLast(4));
        System.out.println("This is original linked list ");
        q1.Print_Linked_List();
        q1.removeDuplicate();
        System.out.println("After removing the duplicates");
        q1.Print_Linked_List();
        q1.ReverseLinkedList();
        System.out.println("Reversed Linked list");
        q1.Print_Linked_List();
    }
}
