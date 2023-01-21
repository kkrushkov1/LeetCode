import java.util.HashMap;
import java.util.Map;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 1;

    }

}
