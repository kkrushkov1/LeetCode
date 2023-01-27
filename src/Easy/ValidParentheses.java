package Easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> result = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                result.push(s.charAt(i));
            }else if(s.charAt(i)==')' && !result.isEmpty() && result.peek()=='('){
                result.pop();
            } else if(s.charAt(i)=='}'&& !result.isEmpty() && result.peek()=='{'){
                result.pop();
            } else if(s.charAt(i)==']'&& !result.isEmpty() && result.peek()=='['){
                result.pop();
            } else{
                result.push(s.charAt(i));
                break;
            }
        }
        return result.isEmpty();
    }
}
