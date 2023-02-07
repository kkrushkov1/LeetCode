package Easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");

        Map<Character, String> map = new HashMap<>();

        if (pattern.length() != array.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(array[i]))
                    return false;
            } else {
                if (map.containsValue(array[i]))
                    return false;
                map.put(c, array[i]);
            }
        }
        return true;
    }
}
