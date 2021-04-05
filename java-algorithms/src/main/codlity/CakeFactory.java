package main.codlity;

import java.util.ArrayList;

/**
 * Correctness %100
 * Performans %0
 * Overall %53
 * */

public class CakeFactory {

    public static void main(String[] args) {

        int result = solution(5, 2, new int[]{1, 1, 2}, new int[]{5, 5, 3}, new int[]{1, 2, 1});
        System.out.println(result);
    }

    public static int solution(int N, int K, int[] A, int[] B, int[] C) {

        if (C.length < K) return 0;

        ArrayList<ArrayList<Integer>> cakes = new ArrayList<>();
        int arrLen = C.length;
        for (int i = 0; i < N; i++) cakes.add(new ArrayList<>());

        for (int i = 0; i < arrLen; i++) {

            for (int j = A[i]-1; j < B[i]; j++) {
                cakes.get(j).add(C[i]);
            }
        }

        int validCount = 0;
        for (ArrayList<Integer> arrList: cakes) {

            if(arrList.size() == K) {
                boolean key = true;
                int i = 1;
                for (int layer: arrList) {
                    if (layer != i++) {
                        key = false;
                        break;
                    }
                }
                if (key) validCount++;
            }
        }

        return validCount;
    }
}
