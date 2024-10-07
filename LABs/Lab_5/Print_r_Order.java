package Lab_5;

public class Print_r_Order extends LinkedList_T{

    public void printReverse(){
        Print_r_Order p = new Print_r_Order();
        Node temp = head;
        while (temp != null){
            p.addFirst(temp.data);
            temp = temp.Next;
        }
        p.printLinkedList();
    }

    public static void main(String[] args) {
        Print_r_Order p1 =new Print_r_Order();
        p1.addFirst(4);
        p1.addFirst(7);
        p1.addFirst(8);
        p1.addFirst(1);
        System.out.println("this is original Linked list ");
        p1.printLinkedList();
        System.out.println("this is reversed linked list ");
        p1.printReverse();
        System.out.println("Again this is original Linked list ");

        p1.printLinkedList();

    }
}
