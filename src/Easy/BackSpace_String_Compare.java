package Easy;

import java.util.Stack;

public class BackSpace_String_Compare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }

    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> string1 = new Stack<>();
        Stack<Character> string2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!string1.isEmpty()) {
                    string1.pop();
                }
            } else {
                string1.push(s.charAt(i));
            }


        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!string2.isEmpty()) {
                    string2.pop();
                }
            } else {
                string2.push(t.charAt(i));
            }


        }

        return string1.equals(string2);
    }
}
