package Easy;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        if (num % 2 != 0) return false;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num;
    }

}
