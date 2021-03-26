package main.hackerrank.interviewPreparation.stacksAndQueues;

import java.io.IOException;
import java.util.*;

public class PoisonousPlants {

    static int poisonousPlants(int[] p) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int e: p) deque.addLast(e);
        ArrayDeque<Integer> tempDeque = new ArrayDeque<>();
        boolean key = true;
        int dayCount = 0;

        int deqSize;
        while (true) {
            dayCount++;
            deqSize = deque.size();

            while (!deque.isEmpty()){
                int lastElem = deque.removeLast();
                if (tempDeque.isEmpty()) {
                   tempDeque.addFirst(lastElem);
                }else if (tempDeque.getFirst() > lastElem) {
                    tempDeque.removeFirst();
                    tempDeque.addFirst(lastElem);
                } else {
                  tempDeque.addFirst(lastElem);
                }
            }

            if (deqSize == tempDeque.size()) break;

            deque = tempDeque;
            tempDeque = new ArrayDeque<>();

        }

        return dayCount-1;
    }

    static int poisonousPlants2(int[] p) {

        ArrayList<Integer> list = new ArrayList<>(p.length);
        for (int elem: p) list.add(elem);

        int dayCount = 0;
        int initSize;
        while (true) {
            dayCount++;
            initSize = list.size();
            for (int i = list.size()-1; i > 0; i--) {

                if (list.get(i) > list.get(i-1)) {
                    list.remove(i);
                }
            }

            if(list.size() == initSize) break;
        }

        return dayCount-1;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants2(p);

        System.out.println(result);

        scanner.close();
    }



}
