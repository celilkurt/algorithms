package main.leetCode;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int getNewMax(int curMax, int[] charIndexes) {
        int count = 0;
        for (int index: charIndexes) {
            if (index != -1) {
                count++;
            }
        }

        return Math.max(count, curMax);
    }

    public static int lengthOfLongestSubstring(String s) {
        int CHAR_COUNT = 256;
        int[] charIndexes = new int[CHAR_COUNT];
        Arrays.fill(charIndexes, -1);

        int len = s.length();
        int max = 0;

        char curChar;
        for (int i = 0; i < len; i++) {
            curChar = s.charAt(i);

            if (charIndexes[curChar] == -1) {
                charIndexes[curChar] = i;

                max = getNewMax(max, charIndexes);

            } else {
                // Bu indexten önceki elemanlar silinir
                int resetIndex = charIndexes[curChar];
                charIndexes[curChar] = i;
                for (int j = 0; j < CHAR_COUNT; j++) {
                    if (charIndexes[j] != -1){
                        if (charIndexes[j] < resetIndex) {
                            charIndexes[j] = -1;
                        }
                    }

                }

            }

        }

        max = getNewMax(max, charIndexes);

        return max;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
