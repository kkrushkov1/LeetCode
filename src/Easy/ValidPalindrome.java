package Easy;

import java.util.Stack;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String word = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> word2 = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            word2.push(word.charAt(i));
        }

        StringBuilder output = new StringBuilder();
        while (!word2.isEmpty())
            output.append(word2.pop());

        if (word.equals(output.toString())) {
            return true;
        } else {
            return false;
        }
    }

//        public static boolean isPalindrome(String s) {
//            String word = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//
//            String rev = new StringBuilder(word).reverse().toString();
//            return word.equals(rev);
//
//        }
}
