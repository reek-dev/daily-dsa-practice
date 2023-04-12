package practice.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Wild Animals";
        System.out.println(reverseWordUsingString(s));
        System.out.println(reverseWordUsingStringBuilder(s));
    }

    public static String reverseWordUsingString(String str) {
        String reversedString = ""; // initially empty; will add the characters later

        for (int i = str.length()-1; i >= 0; i--)
            reversedString += str.charAt(i);
        return reversedString;
    }

    public static String reverseWordUsingStringBuilder(String str) {
        if (str.length() == 1) return str;
        return new StringBuilder().append(str).reverse().toString();
    }
}
