package Lab_1;

public class NoDuplicate {
    public static void noDup(int a[][] ,int b[]){


        int size = b.length;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                boolean exit = false;
                for (int l = 0; l <= k; l++) {
                    if (b[l] == a[i][j]){
                        size--;
                        exit = true;
                        break;
                    }
                }
                if (exit == false){
                    b[k++] = a[i][j];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[][] = {{1,2,3,4,5},{5,4,3,2,1},{3,4,5,6,7},{9,8,7,6,5}};
        int arr2 [] = new int[20];
        noDup(arr1,arr2);

    }
}
