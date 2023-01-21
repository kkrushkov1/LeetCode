package Easy;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5, 6, 7};
        int i = 2;
        int j = 5;

        reverse(prices, i, j);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
