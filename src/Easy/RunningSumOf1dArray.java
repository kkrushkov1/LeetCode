package Easy;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }
}
