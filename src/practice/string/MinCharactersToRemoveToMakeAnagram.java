package practice.string;

/*
* Problem: you are given two strings, and you need return the minimum number of characters
* to be removed from any of those two strings such that those strings become anagrams
*
* example
* S1 = "basgadhbfgvhads", S2 = "sjdhgvbjdsbhvbvd"
* the counts in S1: { a=3, b=2, d=2, f=1, g=2, h=2, s=2, v=1 }
* the counts in S2: { b=3, d=3, g=1, h=2, j=2, s=2, v=3 }
*
* So, basically what you need to do is simply count
* the occurrences of the unique characters (i.e. a,f,j) +
* the differences of the common characters (b,d,g,h,s,v)
*
* the sum of occurrences of 'a', 'f', 'j' are 3 + 1 + 2 = 6
* the sum of differences of 'b', 'd', 'g', 'h', 's', 'v' are
* (3-2) + (3-2) + (2-1) + (2-2) + (2-2) + (3-1) = 1 + 1 + 1 + 0 + 0 + 2 = 5
*
* so, total characters to be removed: 6 + 5 = 11
*
* we can use a frequencyArray to solve this
* */

import java.util.HashMap;
import java.util.Map;

public class MinCharactersToRemoveToMakeAnagram {

    public static void main(String[] args) {
        String S1 = "sjdhgvbjdsbhvbvd";
        String S2 = "basgadhbfgvhads";

        System.out.println(remAnagrams(S1, S2));
    }

    public static int remAnagrams(String S1,String S2) {

        int[] frequencyArray = new int[26];

        for (int i = 0; i < Math.max(S1.length(), S2.length()); i++) {
            if (i < S1.length()) frequencyArray[S1.charAt(i) - 'a']++;
            if (i < S2.length()) frequencyArray[S2.charAt(i) - 'a']--;
        }

        int minCharsToRemove = 0;
        for (int i : frequencyArray) minCharsToRemove += Math.abs(i);
        return minCharsToRemove;
    }
}
