package Easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

//    public static int[] plusOne(int[] digits) {
//        int i = digits.length - 1;
//        while(i >= 0){
//            if(digits[i] == 9)
//                digits[i--] = 0;
//            else{
//                digits[i]++;
//                return digits;
//            }
//        }
//        int[] array = new int[digits.length+1];
//        array[0] = 1;
//        return array;
//    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int number : digits) {
            sb.append(number);
        }
        String numbersStr = sb.toString();

        BigInteger result = new BigInteger(numbersStr);
        int b = 1;
        BigInteger c = result.add(BigInteger.valueOf(b));
        List<String> digits2 = new ArrayList<>();

        while (c.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = c.mod(BigInteger.TEN);

            digits2.add(remainder.toString());

            c = c.divide(BigInteger.TEN);
        }
        Collections.reverse(digits2);
        String[] stringArray = digits2.toArray(new String[0]);

        int[] result2 = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result2[i] = Integer.parseInt(stringArray[i]);
        }
        return result2;

    }

//    StringBuilder sb = new StringBuilder();
//        for (int number : digits) {
//        sb.append(number);
//    }
//    String numbersStr = sb.toString();
//
//    int result = Integer.parseInt(numbersStr);
//
//    int finalResult = result +1;
//
//    String[] digits2 = Integer.toString(finalResult).split("");
//    int[] result2 = new int[digits2.length];
//        for (int i = 0; i < digits2.length; i++) {
//        result2[i] = Integer.parseInt(digits2[i]);
//    }
//        return result2;
//}
}