package main.codlity;

import java.util.HashMap;
import java.util.Map;


/**
 * Task Score %100
 * */
public class OddOccurrencesInArray {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {

        HashMap<Integer, Boolean> isEvenMap = new HashMap<>();

        for (int num: A) {
            boolean curVal = isEvenMap.getOrDefault(num, true);
            isEvenMap.put(num, !curVal);
        }


        for (Map.Entry<Integer, Boolean> entry: isEvenMap.entrySet()) {
            if (!entry.getValue()) return entry.getKey();
        }

        return -1;
    }

}
