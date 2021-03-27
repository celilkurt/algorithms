package main.hackerrank.interviewPreparation.dictsAndHashmaps;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

       boolean[] isOccurS1 = new boolean[26];
       for (char c: s1.toCharArray()) isOccurS1[c-97] = true;

       for (char c: s2.toCharArray()) {
           if (isOccurS1[c - 97]) {
               return "YES";
           }
       }

       return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            System.out.println(result);
        }

        scanner.close();
    }
}