package Lab_7;

public class SimpleRecursion {
    public static void incNumber(int n){
        if (n <= 0){
            return;
        }
        incNumber(n-1);
        System.out.print(n+" ");
    }
    public static void decNumber(int n){
        if (n <= 0){
            return;
        }
        System.out.print(n+" ");
        decNumber(n-1);
    }
    public static void incChArray(char c[],int length){
        if (length < 0){
            return;
        }
        incChArray(c,length-1);
        System.out.print(c[length]+" ");
    }
    public static void decChArray(char c[],int length){
        if (length < 0){
            return;
        }
        System.out.print(c[length]+" ");
        decChArray(c,length-1);
    }

    public static void main(String[] args) {
        incNumber(5);
        System.out.println();
        decNumber(5);
        System.out.println();
        char c[] = {'a','b','c','d','e','f'};
        incChArray(c,c.length-1);
        System.out.println();
        decChArray(c,c.length-1);
    }

}
