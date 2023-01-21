import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 0, 1};
        System.out.println(missingNumber(numbers));
    }

    public static int missingNumber(int[] nums) {
        int size = nums.length;

        int sum = size * (size + 1) / 2;
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }


//    public int missingNumber(int[] nums) {
//        int i;
//        Arrays.sort(nums);
//        for( i=0;i<nums.length;i++){
//            if(i!=nums[i]) return i;
//        }return i;
//    }
}
