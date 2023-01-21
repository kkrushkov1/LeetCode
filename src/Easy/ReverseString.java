package Easy;

import java.lang.reflect.Array;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {

        Stack<Character> string = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            string.push(Array.getChar(s, i));
        }

        int size = string.size();

        for (int i = 0; i < size; i++) {
            s[i] = string.pop();
        }
    }
}
