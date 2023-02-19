package Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public static String largestNumber(int[] nums) {
        PriorityQueue<String> pq = new PriorityQueue<>(new CompareToStrings());
        for (int i = 0; i < nums.length; i++) {
            pq.add(Integer.toString(nums[i]));
        }

        StringBuilder str = new StringBuilder();
        while (!pq.isEmpty()) {
            str.append(pq.poll());
        }

        if (str.toString().charAt(0) == '0') return "0";

        return str.toString();
    }

    static class CompareToStrings implements Comparator<String> {
        public int compare(String a, String b) {
            return (b + a).compareTo(a + b);
        }
    }
}
