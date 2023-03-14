package Easy;

import java.util.Stack;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        Stack<Character> result = new Stack<>();
        String number = String.valueOf(x);

        for (int i = 0; i < number.length(); i++) {
            result.push(number.charAt(i));
        }
        StringBuilder output = new StringBuilder();
        while (!result.isEmpty())
            output.append(result.pop());

        if (number.equals(output.toString())) {
            return true;
        } else {
            return false;
        }

    }
}
