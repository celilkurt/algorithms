package main.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquareForming {

    static int formingMagicSquare(int[][] s) {

        boolean[] has = new boolean[10];
        ArrayList<Integer> excessive = new ArrayList<>();
        ArrayList<Integer> missing = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (has[s[i][j]]) {
                    excessive.add(s[i][j]);
                } else {
                    has[s[i][j]] = true;
                }
            }
        }

        for (int i = 1; i < 10; i++) if (!has[i]) {
            missing.add(i);
        }

        return excessive.size();
    }

    static int getMinCost(ArrayList<Integer> excessive, ArrayList<Integer> missing) {
        int minCost = 0;
        int tempCost;
        for (int num: excessive) {

            for (int num2: missing) {

                tempCost = Math.abs(num-num2);
                //if ()
            }
        }

        return minCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);

        scanner.close();
    }
}
