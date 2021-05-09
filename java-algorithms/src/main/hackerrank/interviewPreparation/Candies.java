package main.hackerrank.interviewPreparation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Candies {

    static long candies(int n, int[] arr) {

        int[] candies = new int[n];
        candies[0] = 1;


        for (int i = 1; i < n; i++) {

            if (arr[i-1] < arr[i]) {
                candies[i] = candies[i-1]+1;
            } else /*if (arr[i-1] > arr[i])*/ {
                candies[i] = 1;
                for (int j = i-1; j > 0; j--) {
                    if (arr[j] < arr[j-1]) {
                        candies[j-1] += 1;
                    } else {
                        break;
                    }
                }
            }
        }

        return Arrays.stream(candies).sum();
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
