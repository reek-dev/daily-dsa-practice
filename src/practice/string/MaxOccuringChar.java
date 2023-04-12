package practice.string;

/*
* The problem is to find the maximum occurring character in a string
* if more than one character appears the maximum amount of time,
* then simply print the character which is lexicographically smaller
* */

public class MaxOccuringChar {

    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(getMaxOccuringChar(s));
    }


    public static char getMaxOccuringChar(String line) {
        int[] frequencyArray = new int[26];
        int maximumCount = 0;
        char result = '\u0000';

        // using hash table to store count of each character.
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') frequencyArray[line.charAt(i) - 'a']++;
        }

        /*
         * reasoning behind why only lexicographically the lowest character will be printed.
         * sample string: "testsample"
         * count: a=1, e=2, l=1, m=1, p=1, s=2, t=2 (note the ascending order, this is how it will be stored in the array)
         * the characters 'e', 's', 't' have the maximum count (i.e. 2)
         * however, only 'e' will be the result because the array will be traversed from left to right and
         * for a character to replace 'e' its count needs to be strictly greater than 2 (notice the if condition)
         */
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > maximumCount) {
                maximumCount = frequencyArray[i];
                result = (char) (i + 'a');
            }
        }
        return result;
    }
}
