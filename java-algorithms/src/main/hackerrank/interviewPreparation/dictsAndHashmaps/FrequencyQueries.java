package main.hackerrank.interviewPreparation.dictsAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int occurence = 0;
        for (int[] query: queries) {
            int input = query[1];
            switch (query[0]) {

                case 1:
                    occurence = map.getOrDefault(input,0);
                    map.put(input, occurence+1);
                    break;
                case 2:
                    occurence = map.getOrDefault(input,0);
                    if(occurence > 0){
                        map.put(input, occurence-1);
                    }
                    break;
                case 3:
                    if(map.values().contains(input)) {
                        ans.add(1);
                    } else {
                        ans.add(0);
                    }
                    break;
                default:
                    break;
            }

        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(bufferedReader.readLine().trim());
            List<int[]> queries = new ArrayList<>(q);
            Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
            for (int i = 0; i < q; i++) {
                int[] query = new int[2];
                Matcher m = p.matcher(bufferedReader.readLine());
                if (m.matches()) {
                    query[0] = Integer.parseInt(m.group(1));
                    query[1] = Integer.parseInt(m.group(2));
                    queries.add(query);
                }
            }
            List<Integer> ans = freqQuery(queries);

        }
    }
}