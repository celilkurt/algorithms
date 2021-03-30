package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {

        int len = unsorted.length;
        BigInteger[] nums = new BigInteger[len];
        for (int i = 0; i < len; i++) {
            nums[i] = new BigInteger(unsorted[i]);
        }

        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            unsorted[i] =  nums[i].toString();
        }

        return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.println("");
            }
        }

        scanner.close();
    }
}
