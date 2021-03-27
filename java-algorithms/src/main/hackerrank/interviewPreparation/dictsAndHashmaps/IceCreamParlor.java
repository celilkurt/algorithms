package main.hackerrank.interviewPreparation.dictsAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IceCreamParlor {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {


        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            if (!map.containsKey(cost[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(cost[i], list);
            } else {
                map.get(cost[i]).add(i);
            }
        }

        for (int i = 0; i < cost.length; i++) {
            int curElem = cost[i];
            if(curElem < money) {
                int needed = money - curElem;
                if(map.containsKey( needed)) {
                    ArrayList<Integer> indexList = map.get(needed);
                    if(indexList.size() > 1 ) {
                        System.out.println((i + 1) + " " + (indexList.get(1) + 1));
                        return;
                    } else if (indexList.get(0) != i) {
                        System.out.println((i + 1) + " " + (indexList.get(0) + 1));
                        return;
                    }
                }
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }




}