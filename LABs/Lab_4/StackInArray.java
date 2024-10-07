package Lab_4;

public class StackInArray {
    int stack[] = new int[10];
    int tos;

    StackInArray(){
        tos = -1;
    }
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack Is Full");

        else {
            stack[++tos] = item;
        }
    }
    int pop(){
        if(tos < 0 ){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
    public static void main(String args[]){
        StackInArray s1 = new StackInArray();
        StackInArray s2 = new StackInArray();
        for(int i = 0; i < 10; i++){
            s1.push(i);
        }
        for(int i = 10; i < 20; i++){
            s2.push(i);
        }
        System.out.println("Stack in myStack1 ");
        for(int i = 0; i < 10; i++){
            System.out.print(s1.pop()+" ");
        }
        System.out.println();
        System.out.println("Stack in myStack2 ");
        for(int i = 10; i < 20; i++){
            System.out.print(s2.pop()+" ");
        }

    }
}
