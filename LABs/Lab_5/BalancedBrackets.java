package Lab_5;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String str){
        Stack<Character> s  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                if (s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' &&  ch == '}') || (s.peek() == '[' &&  ch == ']') ){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isValidWC(String str){
        Stack<Character> s  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else if (ch != ')' && ch != '}' && ch != ']'){
                continue;
            }
            else {
                if (s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' &&  ch == '}') || (s.peek() == '[' &&  ch == ']') ){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        BalancedBrackets b1 = new BalancedBrackets();
        String str = "{[()a+b] b+c}";
        System.out.println(isValidWC(str));
    }
}
