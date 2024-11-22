package Lab_8;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str ,int s,int m,int e){
        if (s >= e){
            return true;
        }
        if (str.charAt(s) != str.charAt(e)){
            return false;
        }
        return checkPalindrome(str,s+1,m,e-1);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Enter any String to check whether it is palindrome or not ?");
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int s = 0;
        int e = str.length()-1;
        int m = (s+e)/2;
        System.out.println(checkPalindrome(str,0,m,e)+"! Entered String is "+str+" Palindrome");
    }

}
