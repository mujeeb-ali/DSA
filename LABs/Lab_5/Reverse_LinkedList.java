package Lab_5;

public class Reverse_LinkedList extends LinkedList_T  {
    public void ReverseLinkedList(){
        Node prev = null;
        Node Curr = tail = head;
        Node next;
        while (Curr != null){

            next = Curr.Next;
            Curr.Next = prev;
            prev = Curr;
            Curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Reverse_LinkedList r1 = new Reverse_LinkedList();
//        r1.addFirst(6);
//        r1.addFirst(5);
//        r1.addFirst(4);
//        r1.addFirst(3);
//        r1.addFirst(2);
//        r1.addFirst(1);
        r1.printLinkedList();
        r1.ReverseLinkedList();
        r1.printLinkedList();
    }

}
