package main.hackerrank.codeCrunchingWithMentees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: a) {
            int occur = map.getOrDefault(num, 0);
            map.put(num, occur+1);
        }

        Object[] arr = map.keySet().stream().sorted().toArray();
        int len = arr.length;
        int first, second;
        int max = 0;
        for (int i = 0; i < len-1; i++) {
            first = (int)arr[i];
            second = (int)arr[i+1];
            if (Math.abs(first-second) <= 1) {
                int temp = map.get(first) + map.get(second);
                if (max < temp) {
                    max = temp;
                }
            }
        }


        return max;

    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);

        System.out.println(result);

        bufferedReader.close();
    }
}
