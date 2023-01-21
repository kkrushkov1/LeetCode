package Easy;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);


        if (Arrays.equals(word1, word2)) {
            return true;
        }
        return false;
    }
}
