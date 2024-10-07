package Lab_6;

public class Sorting_Algorithms {
    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,2,7,5,8,1};
        int arr1[] = {2,9,4,1,7,3};
        System.out.print("This is The Original arr : ");
        printArray(arr);
        System.out.print("This is The Original arr1 : ");
        printArray(arr1);
        SelectionSort(arr);
        System.out.print("This is the Sorted arr Using Selection Sort : ");
        printArray(arr);
        insertionSort(arr1);
        System.out.print("This is the Sorted arr1 Using Insertion Sort : ");
        printArray(arr1);
    }
}
