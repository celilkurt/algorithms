package main.hiringChallenges.udemInternshipHiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * Örnek girdi: "Hackerrank", "rnk"
 * Örnek çıktı: 4
 *
 * "rnk" yi içeren en küçük substring "rank" tir ve uzunluğu 4'tür.
 *
 * */
public class CircularSubstringCompetition {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String target = bufferedReader.readLine();

        String source = bufferedReader.readLine();

        int result = circularSubstringCompetition(target, source);
        System.out.println(result);


        bufferedReader.close();
    }




    /*
     * Complete the 'circularSubstringCompetition' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING target
     *  2. STRING source
     */

    public static int circularSubstringCompetition(String target, String source) {

        HashMap<Character, ArrayList<Integer>> sourceCharIndexes = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> targetCharIndexes = new HashMap<>();

        int len = source.length();
        for (int i = 0; i < len; i++) {

            char c = source.charAt(i);
            if (sourceCharIndexes.containsKey(c)) {
                sourceCharIndexes.get(c).add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                sourceCharIndexes.put(c, indexes);
            }
        }

        len = target.length();
        for (int i = 0; i < len; i++) {

            char c = target.charAt(i);
            if (targetCharIndexes.containsKey(c)) {
                targetCharIndexes.get(c).add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                targetCharIndexes.put(c, indexes);
            }
        }

        for (Map.Entry<Character, ArrayList<Integer>> entry: targetCharIndexes.entrySet()) {

            if (sourceCharIndexes.containsKey(entry.getKey())) {
                if (entry.getValue().size() != sourceCharIndexes.get(entry.getKey()).size()) {
                    return -1;
                }
            } else {
                return -1;
            }

        }

        return 0;

    }
}