package Lab_1;

public class BoundryCroping {
    public static void firstAndLast(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[0].length - 1 ) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    public static void middle(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i != 0 && j != 0 && i != arr.length-1 && j != arr[0].length-1 ){
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
// I am Adding a comment in this program
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        firstAndLast(arr);
        middle(arr);
    }
}
