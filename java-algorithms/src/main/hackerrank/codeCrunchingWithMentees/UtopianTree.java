package main.hackerrank.codeCrunchingWithMentees;

import java.util.ArrayList;
import java.util.Scanner;

public class UtopianTree {

    static ArrayList<Integer> list = new ArrayList<>();
    static boolean isDouble = true;
    static {
        list.add(1);
    }
    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int curI = list.size()-1;
        int preElem;
        while (curI < n) {
            preElem = list.get(curI);
            if (isDouble) {
                list.add(preElem*2);
                isDouble = false;
            } else {
                list.add(preElem+1);
                isDouble = true;
            }
            curI++;
        }
        return list.get(n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            System.out.println(result);
        }

        scanner.close();
    }
}
