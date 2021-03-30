package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Scanner;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int cost = 0;
        char[] arr = s.toCharArray();

        int curElem = arr[0];
        int len = arr.length;
        int occur = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] == curElem) {
                occur++;
            } else {
                cost += occur-1;
                curElem = arr[i];
                occur = 1;

            }
        }

        return cost+occur-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            System.out.println(result);
        }

        scanner.close();
    }
}