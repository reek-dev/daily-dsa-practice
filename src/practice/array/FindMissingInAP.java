package practice.array;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class FindMissingInAP {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,12,14};

        System.out.println(findMissing(arr, arr.length));
    }

    public static int findMissing(int[] arr, int n) {
        int commonDiff = (arr[n-1]-arr[0])/n;
        for (int i = 0; i < n-1; i++)
            if (arr[i+1]-arr[i] != commonDiff) return (arr[i]+commonDiff);
        return 0;
    }
}
