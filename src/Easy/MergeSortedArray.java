package Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        for (int i = 0; i < m; i++) {
            result[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            result[m + i] = nums2[i];
        }
        Arrays.sort(result);

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }

}
