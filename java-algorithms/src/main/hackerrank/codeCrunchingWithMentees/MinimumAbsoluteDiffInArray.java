package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDiffInArray {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int len = arr.length;
        int diff;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len-1; i++) {
            diff = arr[i+1] - arr[i];
            if(diff < min) {
                min = diff;
            }
        }

        return min;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println(result);

        scanner.close();
    }
}