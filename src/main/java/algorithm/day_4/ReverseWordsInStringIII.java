package algorithm.day_4;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(s);
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuffer(word).reverse()).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
