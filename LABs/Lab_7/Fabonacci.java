package Lab_7;

public class Fabonacci {
    public static int fab(int n){
        if (n == 0 || n == 1){
            return n;
        }else {
            return fab(n-1)+fab(n-2);
        }
    }
 
    public static void fabitr(int n){

        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        int num1 = 0;
        int num2 = 1;
        System.out.print(0+" ");
        System.out.print(1+" ");
        int num3;
        for (int i = 2; i < n ; i++) {
            num3 = num1 + num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;

        }
    }
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(fab(i)+" ");
        }
    fabitr(5);
    }
}
