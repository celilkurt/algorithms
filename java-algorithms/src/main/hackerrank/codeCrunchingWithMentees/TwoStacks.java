package main.hackerrank.codeCrunchingWithMentees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TwoStacks {


    /*
    * STDIN   Function
-----   --------
10      q = 10 (number of queries)
1 42    1st query, enqueue 42
2       dequeue front element
1 14    enqueue 42
3       print the front element
1 28    enqueue 28
3       print the front element
1 60    enqueue 60
1 78    enqueue 78
2       dequeue front element
2       dequeue front element
    *
    *
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int query = sc.nextInt();

            switch (query) {
                case 1:
                    queue.add(sc.nextInt());
                    break;
                case 2:
                    queue.poll();
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
                default:
                    break;
            }
        }

    }
}