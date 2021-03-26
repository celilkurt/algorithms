package main.hackerrank.interviewPreparation.stacksAndQueues;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class LargestRectangle {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {

        long max = 0;

        for (int j = 0; j < h.length-1; j++){
            long length = 0;
            long height = Long.MAX_VALUE;


            for (int i = h.length-1; i >= 0; i--) {
                int n = h[i];

                length++;
                if(n < height){
                    height = n;
                }
                long temp = height*length;
                if(temp > max) {
                    max = temp;
                }

            }
        }




        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        System.out.println(result);

        scanner.close();
    }


}
