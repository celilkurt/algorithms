package main.dailyCodingProblem;


/**
 * Medium
 *
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Pinterest.
 *
 * Given an integer list where each number represents the number of hops you can make,
 * determine whether you can reach to the last index starting at index 0.
 *
 * For example, [2, 0, 1, 0] returns True while [1, 1, 0, 1] returns False.
 * */
public class Day106 {

    public static void main(String[] args) {

           System.out.println(isPossible(new int[]{1, 1, 0, 1}));

    }

    public static boolean isPossible(int[] hops) {

        int len = hops.length;
        int curMove = hops[0];
        for (int i = 1; i < len; i++) {

            curMove--;
            if (curMove == 0 && hops[i] == 0 && i != len-1) {
                return false;
            } else if (curMove < hops[i]) {
                curMove = hops[i];
            }
        }

        return true;

    }
}
