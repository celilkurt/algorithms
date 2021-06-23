package main.leetCode.recursion;

import java.util.HashMap;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 2;
        System.out.println("for " + n + ": " + climbStairs(n));

    }


    public static HashMap<Integer, Integer> cache = new HashMap<>();
    static {
        cache.put(2,2);
    }
    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            if (cache.containsKey(n)) return cache.get(n);
            else {
                int moveCount = climbStairs(n-1) + climbStairs(n-2);
                cache.put(n, moveCount);
                return moveCount;
            }

        }
    }
}
