package Lab_8;

public class DecimalToBinary {
    public static String decimalToBinary(int num) {
        if (num == 1) {
            return "1";
        } else {
            return decimalToBinary(num / 2) + (num % 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(13));
    }
}
