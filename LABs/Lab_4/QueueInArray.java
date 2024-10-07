package Lab_4;

public class QueueInArray {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
    QueueInArray(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }
    public void enQueue(int data){
        if (count == capacity){
            System.out.println("Queue is Full");
            return;
        }
//        System.out.println("Inserting "+data);
        arr[front++] = data;
        count++;

    }
    public int deQueue(){
        if (front == 0){
            System.out.println("Queue is Empty ");
            return 0;
        }
//        System.out.println("Removing "+arr[rear]);
        count--;
        int temp = arr[rear];
        arr[rear++] = 0;
        return temp;
    }
    public int top(){
        return arr[rear];
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return front == capacity;
    }

    public static void main(String[] args) {
        QueueInArray q1 = new QueueInArray(5);
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);

        System.out.println("Front Element is: "+q1.top());
        q1.deQueue();
        System.out.println("Front Element is: "+q1.top());
        System.out.println("Queue size is "+q1.size());
        q1.deQueue();
        q1.deQueue();
        if (q1.isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            System.out.println("Queue is not Empty");
        }
    }
}

