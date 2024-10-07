package Lab_7;

public class SearchUsingRecursion {
    public static int searchuItr(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return 1;
            }
        }
        return 0;
    }
    public static int searchURec(int arr[],int length, int key){
        if (length >= 0) {
            if (arr[length] == key) {
                return 1;
            }else {
                return searchURec(arr,length-1,key);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,7,9,2,1,5};
        long searchitrS_Time = System.nanoTime();
        System.out.println(searchuItr(arr,10));
        long searchitrE_Time = System.nanoTime();
        long SearchTotalTimeitr = searchitrE_Time-searchitrS_Time;


        long searchRecS_Time = System.nanoTime();
        System.out.println(searchURec(arr,arr.length-1,7));
        long searchRecE_Time = System.nanoTime();
        long SearchTotalTimeRec = searchRecE_Time-searchRecS_Time;


    }
}
