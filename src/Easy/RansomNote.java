package Easy;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int counter=0;

        List<Character> nl = new ArrayList<>();
        for (char c : magazine.toCharArray())
            nl.add(c);

        for (int i = 0; i < ransomNote.length(); i++) {
            if (nl.contains(ransomNote.charAt(i))) {
                nl.remove((Object)ransomNote.charAt(i));
                counter++;
            }
        }

        return counter == ransomNote.length();
    }

//    The reason why the code is casting the charAt(i) to Object is because List.remove has two overloaded methods:
//    remove(int index) and remove(Object o).
//
//    If you don't cast the charAt(i) to Object, the remove method would try to call remove(int index),
//    which would remove the element at the specified index. But in this case,
//    the element to be removed is specified by value, not by index, so the remove(Object o) method should be used instead.
//
//    By casting the charAt(i) to Object, the remove method being called is the remove(Object o) method,
//    which removes the first occurrence of the specified element in the list, if it exists.
}
