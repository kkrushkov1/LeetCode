package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }


    public static List<String> fizzBuzz(int n) {
        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add("Easy.FizzBuzz");
            } else if (i % 5 == 0) {
                numbers.add("Buzz");
            } else if (i % 3 == 0) {
                numbers.add("Fizz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }

        return numbers;
    }
}
