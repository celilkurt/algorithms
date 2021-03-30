package main.hackerrank.codeCrunchingWithMentees;

import java.io.*;
import java.util.*;

public class RectangularGame {

    // Complete the solve function below.
    static int solve(int[][] steps) {

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int[] coor: steps) {
            if (minX > coor[0]) {
                minX = coor[0];
            }
            if (minY > coor[1]) {
                minY = coor[1];
            }
        }

        return minY*minX;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] steps = new int[n][2];

        for (int stepsRowItr = 0; stepsRowItr < n; stepsRowItr++) {
            String[] stepsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int stepsColumnItr = 0; stepsColumnItr < 2; stepsColumnItr++) {
                int stepsItem = Integer.parseInt(stepsRowItems[stepsColumnItr]);
                steps[stepsRowItr][stepsColumnItr] = stepsItem;
            }
        }

        int result = solve(steps);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
