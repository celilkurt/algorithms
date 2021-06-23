package main.leetCode.recursion;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int rowIndex = 1;
        List<Integer> row = getRow(rowIndex);
        System.out.println(row);
    }

    public static List<Integer> getRow(int rowIndex) {

        int rowIter = 1;
        int colCount;
        LinkedList<Integer> deque = new LinkedList<>();
        deque.add(1);
        if (rowIndex == 0) return deque;


        while (rowIndex >= rowIter) {

            colCount = rowIter+1;

            int preElem = 0;
            while (--colCount > 0) {
                int lastElem = deque.removeLast();
                deque.addFirst(preElem+lastElem);
                preElem = lastElem;
            }
            deque.addFirst(1);

            rowIter++;


        }

        return deque;

    }

}
