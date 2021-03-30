package main.hackerrank.codeCrunchingWithMentees;

import java.util.*;

public class MissingNumbers {

    public int[] missingNumbers(int[] arr, int[] brr) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int occur;
        for (int num: arr) {
            occur = map.getOrDefault(num, 0);
            map.put(num, occur-1);
        }

        for (int num: brr) {
            occur = map.getOrDefault(num, 0);
            map.put(num, occur+1);
        }

        int num;
        int i = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            occur = entry.getValue();
            num = entry.getKey();
            while (occur-- > 0) {
                brr[i++] = num;
            }
        }

        int[] ansArr = Arrays.copyOfRange(brr, 0, i);


        return ansArr;
    }
}
