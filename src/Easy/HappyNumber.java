package Easy;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        String number = String.valueOf(n);
        int square = 0;
        int count = 0;
        while (square != 1) {
            square = 0;
            for (int i = 0; i < number.length(); i++) {
                square += (int) Math.pow(Double.parseDouble(String.valueOf(number.charAt(i))), 2);
            }
            number = String.valueOf(square);
            count++;
            if (count == 31) {
                return false;
            }
        }
        return true;

    }

//    public static boolean isHappy(int n) {
//        Set<Integer> generatedNum = new HashSet<>();
//
//        if(n==1)
//            return true;
//
//        int square = 0;
//        String number = String.valueOf(n);
//
//        while (square != 1) {
//            square = 0;
//            for (int i = 0; i < number.length(); i++) {
//                square += (int) Math.pow(Double.parseDouble(String.valueOf(number.charAt(i))), 2);
//            }
//            number = String.valueOf(square);
//            if(generatedNum.contains(square))
//                return false;
//
//            generatedNum.add(square);
//        }
//
//        return isHappy(square);
//    }

}
