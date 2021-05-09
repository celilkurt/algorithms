package main.hiringChallenges.softttech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {




    }

    public static void commonSubstring(List<String> a, List<String> b) {

        int len = a.size();
        for (int i = 0; i < len; i++) {

            char[] firstStr = a.get(i).toCharArray();
            char[] secondStr = b.get(i).toCharArray();
            boolean[] firstStrHas = new boolean[26];
            for (char c: firstStr) {
                firstStrHas[c-97] = true;
            }

            boolean key = false;
            for (char c: secondStr) {
                if (firstStrHas[c-97]) {
                    key = true;
                    break;
                }
            }

            if (key) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }


    public static List<String> computeParameterValue(List<List<String>> sources) {

        HashMap<String, String> paramMap = new HashMap<>();
        ArrayList<String> orderedKeys = new ArrayList<>();

        for (List<String> source: sources) {

            for (String param: source) {

                String[] keyValue = param.split(":");
                if (!paramMap.containsKey(keyValue[0])) {
                    orderedKeys.add(keyValue[0]);
                }
                paramMap.put(keyValue[0], keyValue[1]);
            }
        }

        ArrayList<String> finalList = new ArrayList<>();
        for (String key: orderedKeys) {
            finalList.add(paramMap.get(key));
        }

        return finalList;

    }


}
