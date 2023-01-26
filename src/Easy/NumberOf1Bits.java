package Easy;

import java.nio.file.Path;

public class NumberOf1Bits {
    public static void main(String[] args) {

        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        String number = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
