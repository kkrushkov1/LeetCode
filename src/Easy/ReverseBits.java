package Easy;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(00000010100));
    }

    public static int reverseBits(int n) {
        String number = Integer.toBinaryString(n);
        StringBuilder builder = new StringBuilder(number);
        builder.reverse();

        builder.append("0".repeat(32 - builder.length()));

        return Integer.parseUnsignedInt(builder.toString(), 2);

    }

//    public int reverseBits(int n) {
//        return Integer.reverse(n);
//    }
}
