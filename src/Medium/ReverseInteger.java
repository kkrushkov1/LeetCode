package Medium;

import java.lang.reflect.Array;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }


    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        long reversed = 0;

        while (x != 0) {
            int digit = Math.abs(x % 10);
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reversed * sign;
    }

//    Without the check for 64-bit integer
//
//    public static int reverse(int x) {
//        Stack<Character> string = new Stack<>();
//        String s = String.valueOf(Math.abs(x));
//        int sign = (x < 0) ? -1 : 1;
//
//        for (int i = 0; i < s.length(); i++) {
//            string.push(s.charAt(i));
//        }
//
//        StringBuilder reversed = new StringBuilder();
//        while (!string.isEmpty()) {
//            reversed.append(string.pop());
//        }
//
//        return Integer.parseInt(reversed.toString()) * sign;
//
//    }


}
