package practice.string;

public class BinaryStringThatStartsAndEndsWithOne {
    public static void main(String[] args) {

    }

    public static int binarySubstring(int a, String str) {
        if (str.length() == 1) return 0;
        int countOfOnes = 0;
        for (Character ch : str.toCharArray())
            if (ch == '1') ++countOfOnes;
        return (countOfOnes * (countOfOnes-1))/2;
    }
}
