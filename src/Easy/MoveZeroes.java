package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MoveZeroes {

//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

//    public static void moveZeroes(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> zeroes = new ArrayList<>();
//
//        for (int num : nums) {
//            if (num != 0) {
//                list.add(num);
//            } else {
//                zeroes.add(num);
//            }
//        }
//
//        list.addAll(zeroes);
//
//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = list.get(i);
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }


    }


}
