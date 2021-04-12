package main.codlity;

import java.util.HashMap;

public class Ladder {


    public int[] solution(int[] A, int[] B) {

        HashMap<Integer, Long> waysCount = new HashMap<>();
        HashMap<Integer, Integer> powerOfTwos = new HashMap<>();

        int len = A.length;
        long count;
        int p;
        for (int i = 0; i < len; i++) {

            if (!waysCount.containsKey(A[i])) {
                count = countOfWays(A[i], waysCount);

                if (!powerOfTwos.containsKey(B[i])) {
                    p = (int) Math.pow(2, B[i]);
                    powerOfTwos.put(B[i], p);
                } else {
                    p = powerOfTwos.get(B[i]);
                }
                waysCount.put(A[i], count);
                count = count % p;
                A[i] = (int) count;
            } else {
                if (!powerOfTwos.containsKey(B[i])) {
                    p = (int) Math.pow(2, B[i]);
                    powerOfTwos.put(B[i], p);
                } else {
                    p = powerOfTwos.get(B[i]);
                }
                A[i] = (int) (waysCount.get(A[i]) % p);
            }
        }

        return A;

    }

    public long countOfWays(int N, HashMap<Integer, Long> cache) {

        if (cache.containsKey(N)) {
           return cache.get(N);
        }

        if (N < 0) {
            return 0;
        }else if (N == 0) {
            return 1;
        } else {
            long waysForN = countOfWays(N-1, cache) + countOfWays(N-2, cache);
            cache.put(N, waysForN);
            return waysForN;
        }
    }
}
