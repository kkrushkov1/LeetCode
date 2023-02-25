package Medium;

public class MaximumSubarray {
    public static void main(String[] args) {

//        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
