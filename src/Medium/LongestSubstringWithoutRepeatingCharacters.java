package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int start = 0;
        int end = 0;
        Set<Character> nonRepeatable = new HashSet<>();
        while(end < s.length()) {
            if(nonRepeatable.contains(s.charAt(end))){
                nonRepeatable.remove(s.charAt(start));
                start++;
            }else{
                nonRepeatable.add(s.charAt(end));
                end++;
                longest = Math.max(nonRepeatable.size(),longest);
            }
        }
        return longest;
    }
}
