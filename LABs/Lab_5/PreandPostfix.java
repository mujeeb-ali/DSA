package Lab_5;

import java.util.Stack;

public class PreandPostfix {
    public static int prec(char c){
        if (c == '^'){
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        }
        return -1;
    }

    public static StringBuilder infixPostfix(String str){
        StringBuilder s1 = new StringBuilder();
        Stack<Character> c1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c < 'z') || (c >= 'A' && c < 'Z') || (c >= '0' && c < '9')){
                s1.append(c);
            }else {
                if (c1.isEmpty()){
                    c1.push(c);
                }else {
                    while (! c1.isEmpty() && prec(c1.peek()) >= prec(c)){
                        s1.append(c1.pop());
                    }
                    c1.push(c);
                }
                
            }

        }
        while (!c1.isEmpty()){
            s1.append(c1.pop());
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "a+b-c*d/e";
        System.out.println(infixPostfix(s));
    }
}
