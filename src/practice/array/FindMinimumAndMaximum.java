package practice.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FindMinimumAndMaximum {

    public static void main(String[] args) {
        long[] a = {3, 2, 1, 56, 10000, 167};

        long min = Arrays.stream(a).min().getAsLong();
        long max = Arrays.stream(a).max().getAsLong();

        System.out.println(min + " " + max);
    }




}
