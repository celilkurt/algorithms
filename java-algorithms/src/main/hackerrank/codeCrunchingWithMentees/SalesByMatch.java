package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        int pairCount = 0;
        for (int i: ar) {
            boolean key = map.getOrDefault(i, false);
            if(key) {
                pairCount++;
                map.put(i, false);
            } else {
                map.put(i, true);
            }
        }

        return pairCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}
