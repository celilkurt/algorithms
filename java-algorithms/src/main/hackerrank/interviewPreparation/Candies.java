package main.hackerrank.interviewPreparation;

import java.io.IOException;
import java.util.Scanner;

public class Candies {

    static long candies(int n, int[] arr) {

        int[] candies = new int[n];
        int min = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i-1]) {
                candies[i] = candies[i-1]+1;
            } else if (arr[i] < arr[i-1]) {
                candies[i] = candies[i-1]-1;
            } else {
                candies[i] = min;
            }

            if (candies[i] < min) {
                min = candies[i];
            }

        }

        long sum = 0L;

        for (int num: candies) {
            sum += num;
        }

        sum += (long) n *(Math.abs(min) + 1);

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);
        System.out.println(result);

        scanner.close();
    }

}
