package Lab_7;

public class Factorial {
    public static int factRec(int n){
        if (n == 0 || n == 1){
            return 1;
        }else {
            return n*factRec(n-1);
        }
    }
    public static int factItr(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("fact using iteration : "+factItr(5));
        System.out.println("fact using Recursion : "+factRec(5));
    }
}
