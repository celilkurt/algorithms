package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Scanner;

public class ANgryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {

        int i = 0;
        int len = a.length;
        while (i < len && k > 0) {
            if (a[i++] <= 0) {
                k--;
            }
        }

        if (k == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);

            System.out.println(result);
        }

        scanner.close();
    }
}
