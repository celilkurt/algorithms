package main.hackerrank.interviewPreparation.dictsAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountTriplets {

        // Complete the countTriplets function below.
        static long countTriplets(List<Long> arr, long r) {

            int count = 0;
            HashMap<Long, ArrayList<Integer>> indexMap = new HashMap<>();
            int limit = arr.size();

            for (int i = 0; i < limit; i++) {
                long num = arr.get(i);
                if (indexMap.containsKey(num)) {
                    indexMap.get(num).add(i);
                } else {
                    ArrayList<Integer> indexList = new ArrayList<>();
                    indexList.add(i);
                    indexMap.put(num, indexList);
                }
            }

            // for (int i)

            return 0l;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(nr[0]);

            long r = Long.parseLong(nr[1]);

            List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .collect(toList());

            long ans = countTriplets(arr, r);

            System.out.println(ans);

            bufferedReader.close();
        }
}