package Lab_5;

public class FirstSingleletter {
    public char firstSingleLetter(String str,int n){
        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int j = i+1; j < n ; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                return str.charAt(i);
            }
        }
        return ',';
    }
    public char firstSingleLetter(char str[],int n){
        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int j = i+1; j < n ; j++) {
                if (str[i] == str[j]){
                    count++;
                }
            }
            if (count == 1){
                return str[i];
            }
        }
        return ',';
    }

    public static void main(String[] args) {
        FirstSingleletter f1 = new FirstSingleletter();
        String name = "Mujeeb";
        System.out.println( f1.firstSingleLetter(name,name.length()));
        char [] nam = {'M','u','j','e','e','b','M'};
        System.out.println( f1.firstSingleLetter(nam,nam.length));
    }

}
