package Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(numbers));

    }

    public static int majorityElement(int[] nums) {
        int majorityNumber = 0;
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                numbers.put(nums[i], 1 + numbers.get(nums[i]));
            } else {
                numbers.put(nums[i], 1);

            }

        }
        int maxValueInMap = (Collections.max(numbers.values()));
        for (Map.Entry<Integer, Integer> entry :
                numbers.entrySet()) {
            if (entry.getValue() == maxValueInMap) {

                majorityNumber = entry.getKey();
            }

        }
        return majorityNumber;

    }

}
