package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {

    // Complete the findMedian function below.
    static int findMedian(int[] arr) {

        if(arr.length % 2 == 0){

            int min = arr[0];
            for (int num: arr) {
                if (min > num){
                    min = num;
                }
            }
            int max = arr[0];
            for (int num: arr) {
                if (max < num){
                    max = num;
                }
            }

            return (max+min)/2;

        } else {
            int limit = (int)Math.floor(arr.length/2);
            for (int i = 0; i <= limit; i++) {
                int min = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[min] > arr[j]){
                        min = j;
                    }
                }
                if (min != i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
            return arr[limit];

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = findMedian(arr);

        System.out.println(result);

        scanner.close();
    }
}
