package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(0, new StringBuilder(), digits, map, res);
        return res;

    }
    public static void backtrack(int start, StringBuilder sb, String digits, Map<Character, String> map, List<String> res) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
        }

        for (int i = start; i < digits.length(); i++) {
            String letters = map.get(digits.charAt(i));
            for (int j = 0; j < letters.length(); j++) {
                sb.append(letters.charAt(j));
                backtrack(i + 1, sb, digits, map, res);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
