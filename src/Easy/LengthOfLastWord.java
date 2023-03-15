package Easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] sentence = s.split(" ");
        String lastWord = sentence[sentence.length - 1];
        int result = 0;

        for (int i = 0; i < lastWord.length(); i++) {
            result += 1;
        }
        return result;
    }
}
