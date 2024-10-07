package Lab_7;

public class MergeSort {
    public static void spilit(int arr[], int stIdx,int endIdx){
        if (stIdx >= endIdx){
            return;
        }
        int mid = (stIdx + endIdx)/2;
        spilit(arr, stIdx, mid);
        spilit(arr, mid+1, endIdx);
        sort(arr, stIdx,mid,endIdx);
    }
    public static void sort(int arr[],int stIdx,int mid,int endIdx){
        int mergeSort[] = new int[endIdx-stIdx+1];
        int idx1 = stIdx;
        int idx2 = mid+1;
        int m = 0;
        while (idx1 <= mid && idx2 <= endIdx){
            if (arr[idx1] <= arr[idx2]){
                mergeSort[m++] = arr[idx1++];
            }else {
                mergeSort[m++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            mergeSort[m++] = arr[idx1++];
        }
        while (idx2 <= endIdx){
            mergeSort[m++] = arr[idx2++];

        }
        for (int i = 0,j = stIdx; i <mergeSort.length ; i++,j++) {
            arr[j] = mergeSort[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        spilit(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
