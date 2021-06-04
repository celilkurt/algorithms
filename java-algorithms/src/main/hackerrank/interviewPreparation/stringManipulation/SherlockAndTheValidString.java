package main.hackerrank.interviewPreparation.stringManipulation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SherlockAndTheValidString {

    public static void main(String[] args) {

    }

    public static String isValid(String s) {

        int[] charCounts = new int[122-96];
        char[] charArr = s.toCharArray();

        for (char c: charArr) {
            charCounts[c-97]++;
        }

        HashMap<Integer, Integer> countFre = new HashMap<>();

        for (int occur: charCounts) if (occur != 0) {

            countFre.put(occur, countFre.getOrDefault(occur, 0)+1);

        }


        if (countFre.size() == 1) {
            return "YES";
        }else if (countFre.size() == 2) {
            Iterator<Map.Entry<Integer,Integer>> entries = countFre.entrySet().iterator();
            Map.Entry<Integer,Integer> firstEntry = entries.next();
            Map.Entry<Integer,Integer> secondEntry = entries.next();

            if (firstEntry.getValue() > secondEntry.getValue()) {
                int diffOfFrequences = Math.abs(secondEntry.getKey() - firstEntry.getKey());
                return (diffOfFrequences == 1 && secondEntry.getValue() == 1) ? "YES": "NO";
            } else {
                int diffOfFrequences = Math.abs(secondEntry.getKey() - firstEntry.getKey());
                return (diffOfFrequences == 1 && firstEntry.getValue() == 1) ? "YES": "NO";
            }

        } else {
            return "NO";
        }

    }

}
