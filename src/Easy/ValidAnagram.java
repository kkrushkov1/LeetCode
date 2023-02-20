package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        char[] word1 = s.toCharArray();
//        char[] word2 = t.toCharArray();
//
//        Arrays.sort(word1);
//        Arrays.sort(word2);
//
//
//        if (Arrays.equals(word1, word2)) {
//            return true;
//        }
//        return false;
//    }

    public static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> string1= new HashMap<>();
        HashMap<Character,Integer> string2 = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(string1.containsKey(s.charAt(i))){
                string1.put(s.charAt(i),string1.get(s.charAt(i))+1);
            }
            else{
                string1.put(s.charAt(i),1);
            }

            if(string2.containsKey(t.charAt(i))){
                string2.put(t.charAt(i),string2.get(t.charAt(i))+1);
            }
            else{
                string2.put(t.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> val : string1.entrySet()){
            if(!string2.containsKey(val.getKey())){
                return false;
            }
            else{
                int tmp = string2.get(val.getKey());
                if(tmp!=val.getValue()){
                    return false;
                }
            }
        }
        return true;
    }
}
