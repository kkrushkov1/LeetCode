import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(numbers));
    }

//    public static  boolean containsDuplicate(int[] nums) {
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length -1; i++) {
//                if (nums[i] == nums[i+ 1]){
//                    return true;
//                }
//
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();

        for (int num : nums) {
            if (!result.add(num)) {
                return true;
            }
        }
        return false;

    }
}
