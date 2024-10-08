package Lab_1;

import java.util.Scanner;

public class OddEvenSeries {

        public static void main(String[] args) {
            int[] arr = new int[10];

            Scanner cin  = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the Element for index "+i+ " ");
                arr[i] = cin.nextInt();
            }
            System.out.println("The Actual Array is ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\n\nThe Arranged Array is ");
            for(int i = 0; i < arr.length; i++){
                if (arr[i]%2 != 0){
                    System.out.print(arr[i]+" ");
                }
            }
        
            for(int i = 0; i < arr.length; i++){
                if (arr[i]%2 == 0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
