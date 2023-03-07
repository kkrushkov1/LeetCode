package Easy;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if
            (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

//    public static int search(int[] nums, int target) {
//        int index = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
}
