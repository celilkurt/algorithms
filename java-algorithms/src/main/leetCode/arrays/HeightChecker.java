package main.leetCode.arrays;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {

    }

    public static int heightChecker(int[] heights) {

        int[] expected = heights.clone();
        Arrays.sort(expected);

        int len = heights.length;
        int count = 0;
        for (int i = 0; i < len; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

}
