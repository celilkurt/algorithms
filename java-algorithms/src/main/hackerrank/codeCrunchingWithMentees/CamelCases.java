package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Scanner;

public class CamelCases {

    // Complete the camelcase function below.
    static int camelcase(String s) {

        int count = 0;
        for (char c: s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        return count+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);

        scanner.close();
    }
}
