package main.codlity;

import java.util.HashMap;

public class CountNonDivisible {

    public static void main(String[] args) {

        int[] result = solution(new int[]{3,1,2,3,6});

    }

    public static int[] solution(int[] A) {


        HashMap<Integer, Integer> divisors = new HashMap<>();
        for (int num: A) {

            if (!divisors.containsKey(num)) {
                int nonDivisorsCount = 0;
                for (int factor: A) if (num%factor != 0) {
                    nonDivisorsCount++;
                }
                divisors.put(num, nonDivisorsCount);
            }
        }

        int len = A.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = divisors.get(A[i]);
        }

        return ans;
    }
}
