package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ClosestNumbers {

    static int[] closestNumbers(int[] arr) {

        Arrays.sort(arr);

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            ArrayList<Integer> tempList = map.getOrDefault(diff, new ArrayList<Integer>());
            if (tempList.isEmpty()) {
                tempList.add(i);
                tempList.add(i+1);
                map.put(diff, tempList);
            } else {
                tempList.add(i);
                tempList.add(i+1);
            }
        }

        int minDiff = (int) map.keySet().stream().sorted().toArray()[0];
        ArrayList<Integer> indexes = map.get(minDiff);
        int[] ans = new int[indexes.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] =
                    arr[indexes.get(i)];
        }

        return ans;
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

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }


        scanner.close();
    }
}