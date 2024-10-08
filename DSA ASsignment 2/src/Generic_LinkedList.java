public class Generic_LinkedList<S,I> {
    class Node {
        S name;
        I data;
        Node next;
        Node(S name,I data){
        this.name = name;
        this.data = data;
        this.next = null;
        }
    }
    Node head,tail;
    int size = -1;
    public void add(S name,I data){
        Node newNode = new Node(name,data);
        size++;
        if (head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addLast(S name,I data){
        Node newNode = new Node(name,data);
        size++;
        if (head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addFirst(S name,I data){
        Node newNode = new Node(name,data);
        size++;
        if (head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addAtIndex(int index,S name,I data){
        Node newNode = new Node(name,data);
        size++;
        if (head == null){
            head = newNode;
        }
        int tempo = 1;
        Node temp = head;
        while (tempo < index - 1){
            temp = temp.next;
            tempo++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void remove(){
        if (head == null){
            System.out.println("There is nothing to remove ");
        }
        Node temp = head;
        while (temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void removeLast(){
        if (head == null){
            System.out.println("LinkdeList is Empty");
        }
        Node temp = head;
        while (temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void removeFirst(){
        if (head == null) {
            System.out.println("LinkdeList is Empty");
        }
        head = head.next;
        size--;
    }
    public void removeAtIndex(int index){
        if (head == null){
            System.out.println("LinkedList is Empty ");
        }
        int tempo = 1;
        Node temp = head;
        while (tempo < index - 1){
            temp = temp.next;
            tempo++;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void searchElement(String key){
        if (head == null){
            System.out.println("There is Nothing to search ");
            return;
        }
        Node temp = head;
        int length = -1;
        while (temp != null){
            length++;
            if (temp.name.equals(key)){
                System.out.println("Element ("+key+") is found at Index "+length);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element Not found ");
    }
    public void printLinkedList(){
        if (head == null){
            System.out.println("LinkedList id Empty");
        }
        Node temp = head;
        while (temp != null){
            System.out.print("-->"+temp.name+"-->"+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Generic_LinkedList<String,Integer> g1 = new Generic_LinkedList<>();
        g1.addFirst("Ali",132);
        g1.addFirst("Mujeeb",123);
        g1.add("A",312);
        g1.add("B",321);
        g1.addLast("Mujib",221);
        g1.printLinkedList();
        g1.removeFirst();
        g1.removeLast();
        System.out.println();
        g1.printLinkedList();
        g1.addAtIndex(2,"MS",32);
        g1.remove();
        System.out.println();
        g1.printLinkedList();
        System.out.println();
        g1.removeAtIndex(3);
        g1.printLinkedList();
        System.out.println();
        g1.searchElement("MS");
    }
}
