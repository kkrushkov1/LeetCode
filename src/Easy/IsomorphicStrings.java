package Easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                if( !map.get(c).equals(t.charAt(i)) )
                    return false;
            }
            else
            {
                if( map.containsValue(t.charAt(i)) )
                    return false;
                map.put(c, t.charAt(i));
            }
        }
        return true;
    }
}
