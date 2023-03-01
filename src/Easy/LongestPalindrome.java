package Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;
        for (char c : s.toCharArray()) {
            // If set contains character already, remove that character & adding 2 to length...
            // It means we get a pair of character which is used in palindrome...
            if (set.contains(c)) {
                len += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (set.size() > 0) {
            return len + 1;
        } else {
            return len;
        }
    }

//    public static int longestPalindrome2(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        int len = 0;
//        for (int i : map.values()) {
//            if (i % 2 == 0) {
//                len += i;
//            } else {
//                len += i - 1;
//            }
//        }
//
//        if (len < s.length()) {
//            return len + 1;
//        } else {
//            return len;
//        }
//    }
}
