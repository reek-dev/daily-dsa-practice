package practice.string;

public class MergeTwoStringWithAlternateCharacters {

    public static void main(String[] args) {

        System.out.println(merge("Hello", "Bye"));
    }

    public static String merge(String S1, String S2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S1.length() || i < S2.length(); i++) {
            if (i < S1.length()) sb.append(S1.charAt(i));
            if (i < S2.length()) sb.append(S2.charAt(i));
        }
        return sb.toString();
    }
}
