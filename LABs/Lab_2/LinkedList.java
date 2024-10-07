package Lab_2;

public class LinkedList implements List {
    public class Node {
        Object data;
        Node Next;

        Node(Object data){
            this.data = data;
            this.Next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(Object data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }
    public void add(Object data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.Next != null){
            temp = temp.Next;
        }
        temp.Next = newNode;

    }
    void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail =  null;
            return;
        }
        Node temp = head;
        while (temp.Next != null){
            temp = temp.Next;
        }
        temp.Next = newNode;
        temp = newNode;
    }
    int printLinkedList(){
        if (head == null){
            System.out.println("LinkedList is Empty ");
            return 0;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.Next;

        }
        System.out.println("null");
        return 0;
    }
    public void add(int idx,Object data){
        Node newNode = new Node(data);
        size++;
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1){
            temp = temp.Next;
            i++;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;

    }
    int removeFirst(){
        if (size == 0){
            System.out.println("Linked_List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = (int)head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = (int)head.data;
        head = head.Next;
        size--;
        return val;
    }
    public void removeAtIndex(int index){
        if (index == 0){
            System.out.println("LinkedList Is Empty");
            return;
        }
        else if (index == 1){
            removeFirst();
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < index -1){
            temp = temp.Next;
            i++;
        }
        temp.Next = temp.Next.Next;
        size--;
    }
    int removeLast(){
        if (size == 0){
            System.out.println("Linked_List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = (int)head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        int i = 0;
        while (i < size -2){
            temp = temp.Next;
            i++;
        }
        int val = (int)head.data;
        temp.Next = null;
        tail = temp;
        size--;
        return val;

    }
    int searchElement(Object key){
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.Next;
            i++;
        }
        return -1;
    }
    public void remove(int item){
        if (head.data == (Object) item){
            head = head.Next;
            return;
        }
        Node temp = head;
        while (temp.Next != null){
            if (temp.Next.data == (Object) item ){
                if (temp.Next.Next == null){
                    temp.Next = null;
                    size--;
                }else {
                    temp.Next = temp.Next.Next;
                    size--;
                }
                return;
            }
            temp = temp.Next;
        }

    }
   public void ReverseLinkedList(){
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

    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
    public List duplicate(){
        LinkedList duplicate =  new LinkedList();
        Node temp = head;
        while (temp!= null){
            duplicate.add(temp.data);
            temp = temp.Next;
        }

        return duplicate;
    }

    public List duplicateReversed() {
        LinkedList duplicateList = new LinkedList();
        Node current = head.Next;
        while (current != null) {
            duplicateList.add(1, current.data);
            current = current.Next;
        }
        return duplicateList;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLinkedList();
        System.out.println("Is LinkedList is Empty or not "+ll.isEmpty());
        System.out.println("The Size of the LinkedList "+ll.size());
        ll.add(4);
        ll.add(2);
        ll.add(7);
        ll.printLinkedList();
        ll.add(3,6);
        ll.printLinkedList();
        ll.remove(6);
        ll.printLinkedList();
        ll.removeAtIndex(3);
        ll.printLinkedList();

    }
}
